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
    public Optional<Patient> save(Patient patient) {
        return patientDao.save(patient);
    }

    @Override
    public Optional<Patient> update(Patient patient) {
        return patientDao.update(patient);
    }

    @Override
    public Collection<Patient> getAll() {
        return patientDao.getAll();
    }

    @Override
    public Optional<Patient> getById(Long id) {
        return patientDao.getById(id);
    }

    @Override
    public void delete(Patient patient) { patientDao.delete(patient);

    }

    @Override
    public void deleteAll() { patientDao.deleteAll();

    }

    @Override
    public void deleteById(Long id) { patientDao.deleteById(id);

    }
}
