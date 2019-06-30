package service.impl;

import dao.PatientDao;
import dao.impl.PatientDaoImpl;
import domain.Patient;
import service.PatientService;


public class PatientServiceImpl implements PatientService {

    private static PatientService instance;

    private PatientDao patientDao = PatientDaoImpl.getInstance();

    private PatientServiceImpl() {

    }

    public static PatientService getInstance() {
        if (instance == null) {
            instance = new PatientServiceImpl();
        }
        return instance;
    }

    @Override
    public Patient getByDisease(String disease) {
        return null;
    }

    @Override
    public Object save(Object object) {
        return null;
    }

    @Override
    public Object update(Object object) {
        return null;
    }

    @Override
    public Object[] getAll() {
        return new Object[0];
    }

    @Override
    public Object getByName(String Name) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
