package service;

import domain.Patient;
import java.util.Optional;

public interface PatientService extends GenericService<Patient> {

    Optional<Patient> getByDisease(String disease);

}
