package deo;

import model.ClinicService;
import java.util.HashMap;
import java.util.Map;

public class ClinicServiceDeo {
    private static Map<String, ClinicService> clinicServiceMap = new HashMap<>();

    static {
        clinicServiceMap.put("1", new ClinicService("1", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("2", new ClinicService("2", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("3", new ClinicService("3", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("4", new ClinicService("4", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("5", new ClinicService("5", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("6", new ClinicService("6", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("7", new ClinicService("7", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("8", new ClinicService("8", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("9", new ClinicService("9", "Dental", "we give Dental services which is the best service in Mars","resources/img/clinicServiceImages/dentist.jpg"));

    }



    public static ClinicService getClinicServiceById(String key) {
        return clinicServiceMap.get(key);
    }

    public static void addClinicService(ClinicService clinicService) {
        clinicServiceMap.put(clinicService.getClinicserviceId(), clinicService);
    }

    public static Map<String, ClinicService> getClinicServiceMap() {
        return clinicServiceMap;
    }

    public static void setClinicServiceMap(Map<String, ClinicService> clinicServiceMap) {
        ClinicServiceDeo.clinicServiceMap = clinicServiceMap;
    }
}
