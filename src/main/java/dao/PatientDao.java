package dao;

import domain.Patient;
import java.util.Optional;

public interface PatientDao extends GenericDao<Patient> {
    Optional<Patient> getByDisease(String disease);

}
