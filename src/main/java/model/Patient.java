package model;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person{
    List<PatientComment> comments;

    public Patient() {
        comments = new ArrayList<>();
    }

    public List<PatientComment> getComments() {
        return comments;
    }

    public void setComments(List<PatientComment> comments) {
        this.comments = comments;
    }
}
