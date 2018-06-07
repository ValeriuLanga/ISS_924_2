package iss_924_2.server.service;

import iss_924_2.core.domain.*;
import iss_924_2.core.utils.RequestStatus;
import iss_924_2.server.repository.Repository;
import iss_924_2.core.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 */
public class DoctorServiceServer implements DoctorService {

    /**
     * Default constructor
     */
    public DoctorServiceServer() {
    }

    /**
     * 
     */
    @Autowired
    private Repository doctorRepository;

    @Autowired
    private Repository hospitalRepository;

    @Autowired
    private Repository requestRepository;

    /**
     * 
     */
    public Set<Request> checkRequestStatus(int id) {
        Optional<Doctor> optionalDoctor = doctorRepository.findById(id);
        Set<Request> requests = null;


        if (optionalDoctor.isPresent()) {
            requests = optionalDoctor.get().getRequest().stream().filter(request -> request.getDoctor().getId()
                    .equals(id)).collect(Collectors.toSet());
        }

        return requests;
    }

    @Override
    public void cancelBloodRequest(int id) {
        Optional<Request> request = requestRepository.findById(id);

        if (request.isPresent()) {
            request.get().setStatus(RequestStatus.cancelled);

            requestRepository.save(request.get());
        }
    }

    /**
     * 
     */
    public void requestBlood(Request request, Doctor doctor) {

        doctor.getRequest().add(request);

        System.out.println(doctor.getRequest());

        doctorRepository.save(doctor);
    }

    /**
     * 
     */
    public void cancelBloodRequest(int id, Doctor doctor) {
        Set<Request> requests = doctor.getRequest();

        Optional<Request> optoinalRequest = requests.stream().filter(r -> r.getId() == id).findFirst();

        optoinalRequest.ifPresent(request -> request.cancelRequest());
    }

    /**
     * @param hospitalId
     */
    public Set<BloodContainer> getAvailableStocks(int hospitalId) {
        Set<BloodContainer> availableStocks = null;

        Optional<Hospital> hospital = hospitalRepository.findById(hospitalId);

        if (hospital.isPresent()) {
            availableStocks = hospital.get().getBloodContainers();
        }

        return availableStocks;
    }

}