package service;

import domain.Doctor;
import java.util.Optional;

public interface DoctorService extends PersonnelService<Doctor> {

    Optional<Doctor> getBySpecialty(String specialty);

}
