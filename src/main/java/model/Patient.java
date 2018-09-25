package model;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private static String id = "0";
    List<PatientComment> comments;
    private String message;


    public Patient() {
        comments = new ArrayList<>();
    }

    public Patient(String full_name, String email, String phone, String message) {
        super(Patient.getgenId(), full_name, email, phone);
        this.message = message;
    }

    public static String getgenId() {
        int gen_id = Integer.parseInt(id);
        ++gen_id;
        return "" + gen_id;
    }

    public List<PatientComment> getComments() {
        return comments;
    }

    public void setComments(List<PatientComment> comments) {
        this.comments = comments;
    }
}
