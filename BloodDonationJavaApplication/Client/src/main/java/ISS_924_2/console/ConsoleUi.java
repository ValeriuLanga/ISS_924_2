package iss_924_2.console;

import iss_924_2.service.AdminService;
import iss_924_2.service.DoctorService;
import iss_924_2.service.DonorService;
import iss_924_2.service.PersonnelService;

public class ConsoleUi {

    private AdminService adminService;
    private DoctorService doctorService;
    private DonorService donorService;
    private PersonnelService personnelService;

    public ConsoleUi(AdminService adminService, DoctorService doctorService, DonorService donorService, PersonnelService personnelService) {
        this.adminService = adminService;
        this.doctorService = doctorService;
        this.donorService = donorService;
        this.personnelService = personnelService;
    }

    public void start(){
        while (true){
        }
    }

}

