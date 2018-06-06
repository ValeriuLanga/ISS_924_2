package iss_924_2.client.console;

import iss_924_2.core.domain.Donor;
import iss_924_2.core.service.AdminService;
import iss_924_2.core.service.DoctorService;
import iss_924_2.core.service.DonorService;
import iss_924_2.core.service.PersonnelService;

import java.util.List;

public class ConsoleUi {

    private AdminService adminService;
    private DoctorService doctorService;
    private DonorService donorService;
    private PersonnelService personnelService;

    public ConsoleUi(DonorService donorService) {
        this.donorService = donorService;

    }

    public List<Donor> getAll(){
        return donorService.getAllDonors();
    }

    public void start(){
        donorService.getAllDonors().forEach(System.out::println);
    }

}

