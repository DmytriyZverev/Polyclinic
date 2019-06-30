package dao;

import domain.Doctor;

public interface DoctorDao extends GenericDao {

    Doctor getBySpecialty(String specialty);

}
