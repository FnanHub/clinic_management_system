package deo;


import model.Address;
import model.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoctorsDeo {

    private static Map<String, Doctor> doctors = new HashMap<>();

    public static Map<String, Doctor> getDoctors() {
        return doctors;
    }

    public static void setDoctors(Map<String, Doctor> doctors) {
        DoctorsDeo.doctors = doctors;
    }

    static {
        Address address = new Address("2000 North court street", "Fairfield", "IA", "52556");

        doctors.put("1001",new Doctor("1001","Merih", "Gebreyohannes", LocalDate.of(1890, 03, 23), address, "merih@mum.edu", "862-704-4056", "1"));
        doctors.put("1002",new Doctor("1002","Merih", "Gebreyohannes", LocalDate.of(1890, 03, 23), address, "merih@mum.edu", "862-704-4056", "1"));
        doctors.put("1003",new Doctor("1003","Merih", "Gebreyohannes", LocalDate.of(1890, 03, 23), address, "merih@mum.edu", "862-704-4056", "1"));
        doctors.put("1004",new Doctor("1004","Merih", "Gebreyohannes", LocalDate.of(1890, 03, 23), address, "merih@mum.edu", "862-704-4056", "1"));
        doctors.put("1005",new Doctor("1005","Merih", "Gebreyohannes", LocalDate.of(1890, 03, 23), address, "merih@mum.edu", "862-704-4056", "1"));


        doctors.put("1006",new Doctor("1006","Merih6", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "2"));
        doctors.put("1007",new Doctor("1007","Merih7", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "2"));
        doctors.put("1008",new Doctor("1008","Merih8", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "2"));
        doctors.put("1009",new Doctor("1009","Merih9", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "2"));
        doctors.put("1010",new Doctor("1010","Merih10", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "2"));
        doctors.put("1011",new Doctor("1011","Merih11", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "2"));



        doctors.put("1012",new Doctor("1012","Merih12", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "3"));
        doctors.put("1013",new Doctor("1013","Merih13", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "3"));
        doctors.put("1014",new Doctor("1014","Merih14", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "3"));
        doctors.put("1015",new Doctor("1015","Merih15", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "3"));
        doctors.put("1016",new Doctor("1016","Merih16", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "3"));
        doctors.put("1017",new Doctor("1017","Merih17", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "4"));

        doctors.put("1018",new Doctor("1018","Merih18", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "4"));
        doctors.put("1019",new Doctor("1019","Merih19", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "4"));
        doctors.put("1020",new Doctor("1020","Merih20", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "4"));
        doctors.put("1021",new Doctor("1021","Merih21", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "4"));
        doctors.put("1022",new Doctor("1022","Merih22", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "4"));
        doctors.put("1023",new Doctor("1023","Merih23", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "4"));


        doctors.put("1024",new Doctor("1024","Merih24", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "5"));
        doctors.put("1025",new Doctor("1025","Merih25", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "5"));
        doctors.put("1026",new Doctor("1026","Merih26", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "5"));
        doctors.put("1027",new Doctor("1027","Merih27", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "5"));
        doctors.put("1028",new Doctor("1028","Merih28", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "5"));
        doctors.put("1029",new Doctor("1029","Merih29", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "5"));


        doctors.put("1031",new Doctor("1031","Merih31", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "6"));
        doctors.put("1032",new Doctor("1032","Merih32", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "6"));
        doctors.put("1033",new Doctor("1033","Merih33", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "6"));
        doctors.put("1034",new Doctor("1034","Merih34", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "6"));
        doctors.put("1035",new Doctor("1035","Merih35", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "6"));
        doctors.put("1036",new Doctor("1036","Merih36", "Gebreyohannes", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "862-704-4056", "6"));


    }

    public static List<Doctor> getDoctorsList(){
        List<Doctor> dlist = new ArrayList<>();
        for(String key: doctors.keySet()){
            dlist.add(doctors.get(key));
        }

        return dlist;
    }


    public static void deleteDoctorById(String id) {

        doctors.remove(id);
    }
}
