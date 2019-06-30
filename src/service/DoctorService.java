package service;

import domain.Doctor;

public interface DoctorService extends PersonnelService {

    Doctor getBySpecialty(String specialty);

}
