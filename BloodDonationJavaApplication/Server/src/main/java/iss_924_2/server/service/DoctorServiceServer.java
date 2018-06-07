package iss_924_2.server.service;

import iss_924_2.core.domain.*;
import iss_924_2.core.utils.RequestStatus;
import iss_924_2.server.repository.Repository;
import iss_924_2.core.service.DoctorService;

import java.util.Optional;
import java.util.Set;

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
    public Doctor currentUser;

    /**
     * 
     */
    private Repository doctorRepository;

    /**
     * 
     */
    public RequestStatus checkRequestStatus(int id) {
        // TODO implement here

        Set<Request> requests = currentUser.getRequest();

        Request request = requests.stream().filter(r -> r.getId() == id).findFirst().get();

        RequestStatus status = request.getStatus();

        return status;
    }

    /**
     * 
     */
    public void requestBlood(BloodContainer bloodContainer, int quantity, int urgencyLevel) {
        // TODO implement here
        Request request = new Request();
        request.setContainerType(bloodContainer.getContainerType());
        request.setDoctor(currentUser);
        request.setQuantity(quantity);
        request.setUrgencyLevel(urgencyLevel);

        currentUser.getRequest().add(request);
    }

    /**
     * 
     */
    public void cancelBloodRequest(int id) {
        // TODO implement here
        Set<Request> requests = currentUser.getRequest();

        Optional<Request> optoinalRequest = requests.stream().filter(r -> r.getId() == id).findFirst();

        optoinalRequest.ifPresent(request -> request.cancelRequest());
    }

    /**
     *
     */
    public boolean checkDonationForPerson() {
        // TODO implement here    /**

        return true;
    }

    /**
     * @param hospital
     */
    public Set<BloodContainer> getAvailableStocks(Hospital hospital) {
        // TODO implement here
        Set<BloodContainer> availableStocks = hospital.getBloodContainers();

        return availableStocks;
    }

}