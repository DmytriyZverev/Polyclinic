package service.impl;

import dao.PatientDao;
import dao.impl.PatientDaoImpl;
import domain.Patient;
import service.PatientService;

import java.util.Collection;
import java.util.Optional;


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
    public Optional<Patient> getByDisease(String disease) {
        return patientDao.getByDisease(disease);
    }

    @Override
    public Optional<Patient> save(Patient object) {
        return patientDao.save(object);
    }

    @Override
    public Optional<Patient> update(Patient object) {
        return patientDao.update(object);
    }

    @Override
    public Collection<Patient> getAll() {
        return patientDao.getAll();
    }

    @Override
    public Optional<Patient> getByName(String name) {
        return patientDao.getByName(name);
    }

    @Override
    public void delete(Patient object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
