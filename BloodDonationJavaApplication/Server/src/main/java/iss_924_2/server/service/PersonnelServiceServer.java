package iss_924_2.server.service;

import iss_924_2.core.domain.Request;
import iss_924_2.core.service.PersonnelService;
import iss_924_2.core.domain.Donor;
import iss_924_2.core.domain.Patient;
import iss_924_2.core.domain.User;

import iss_924_2.core.utils.RequestStatus;
import iss_924_2.server.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class PersonnelServiceServer implements PersonnelService {

    @Autowired
    private Repository personnelRepository;

    @Autowired
    private Repository donorRepository;

    @Autowired
    private Repository requestRepository;

    public String contactDonor(int id) {

        Optional<Donor> optionalDonor = donorRepository.findById(id);

        if (optionalDonor.isPresent())
            return optionalDonor.get().getPhoneNumber();

        return null;
    }

    public Set<Request> collectRequests() {
        return new HashSet<>(requestRepository.findAll());
    }

    public Set<Donor> collectData() {
        return new HashSet<>(donorRepository.findAll());
    }

    public Donor determineClosestCompatibleDonor(Patient patient) {
        // TODO implement here
        return null;
    }

    public void manageJourney(int id) {

        Optional<Request> opt = requestRepository.findById(id);
        opt.ifPresent(request -> {
            RequestStatus rs = request.getStatus();

            if (rs == RequestStatus.registered)
                request.setStatus(RequestStatus.processed);
            else if (rs == RequestStatus.processed)
                request.setStatus(RequestStatus.completed);

        });

        requestRepository.save(opt.get());
    }

}