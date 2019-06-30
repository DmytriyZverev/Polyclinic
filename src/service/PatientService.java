package service;

import domain.Patient;

public interface PatientService extends GenericService {

    Patient getByDisease(String disease);

}
