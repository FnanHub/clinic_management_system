package model;


import deo.DoctorsDeo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor extends Person{

    private DoctorSpecializations specialization;
    private String description;
    private String clinicserviceId;

    public Doctor() {
    }

    public Doctor(String id, String first_name, String last_name, LocalDate dob, Address address, String email, String phoneNumber, String clinicserviceId) {
        super(id,first_name, last_name, dob, address, email, phoneNumber);
        this.clinicserviceId = clinicserviceId;

    }

    public static List<Doctor> getDoctorsList(String  serviceId) {

        List<Doctor> dlist = DoctorsDeo.getDoctorsList().stream().filter( doc-> doc.clinicserviceId.equals(serviceId)).collect(Collectors.toList());

        return dlist;
    }

    public DoctorSpecializations getSpecialization() {
        return specialization;
    }

    public void setSpecialization(DoctorSpecializations specialization) {
        this.specialization = specialization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClinicserviceId() {
        return clinicserviceId;
    }

    public void setClinicserviceId(String clinicserviceId) {
        this.clinicserviceId = clinicserviceId;
    }
}
