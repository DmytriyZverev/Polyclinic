package service.impl;

import dao.DoctorDao;
import dao.impl.DoctorDaoImpl;
import domain.Doctor;
import service.DoctorService;

import java.util.Optional;
import java.util.Set;


public class DoctorServiceImpl implements DoctorService {

    private static DoctorService instance;

    private DoctorDao doctorDao = DoctorDaoImpl.getInstance();

    private DoctorServiceImpl(){

    }

    public static DoctorService getInstance() {
        if (instance == null) {
            instance = new DoctorServiceImpl();
        }
        return instance;
    }

    @Override
    public Optional<Doctor> getBySpecialty(String specialty) {
        return doctorDao.getBySpecialty(specialty);
    }

    @Override
    public boolean fire(Doctor personnel) {
        //add some logic
        doctorDao.delete(personnel);
        return true;
    }

    @Override
    public boolean hire(Doctor personnel) {
        //add some logic
        doctorDao.save(personnel);
        return true;
    }

    @Override
    public boolean promote(Doctor personnel) {
        //add some logic
        doctorDao.update(personnel);
        return true;
    }

    @Override
    public Optional<Doctor> save(Doctor object) {
        return doctorDao.save(object);
    }

    @Override
    public Optional<Doctor> update(Doctor object) {
        return doctorDao.update(object);
    }

    @Override
    public Set<Doctor> getAll() {
        return doctorDao.getAll();
    }

    @Override
    public Optional<Doctor> getByName(String name) {
        return doctorDao.getByName(name);
    }

    @Override
    public void delete(Doctor object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
