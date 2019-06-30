package dao;

import domain.Patient;

public interface PatientDao extends GenericDao {

    Patient getByDisease(String disease);

}
