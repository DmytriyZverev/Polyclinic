package dao;

import domain.Doctor;
import java.util.Optional;

public interface DoctorDao extends PersonnelDao<Doctor> {

    Optional<Doctor> getBySpecialty(String specialty);

}
