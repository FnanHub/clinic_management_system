package model;


public class Doctor extends Person{

    private DoctorSpecializations specialization;
    private String description;

    public Doctor() {
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
}
