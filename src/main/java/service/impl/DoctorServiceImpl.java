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
    public Optional<Doctor> save(Doctor doctor) {
        return doctorDao.save(doctor);
    }

    @Override
    public Optional<Doctor> update(Doctor doctor) {
        return doctorDao.update(doctor);
    }

    @Override
    public Set<Doctor> getAll() {
        return doctorDao.getAll();
    }

    @Override
    public Optional<Doctor> getById(Long id) {
        return doctorDao.getById(id);
    }

    @Override
    public void delete(Doctor doctor) { doctorDao.delete(doctor);

    }

    @Override
    public void deleteAll() { doctorDao.deleteAll();

    }

    @Override
    public void deleteById(Long id) { doctorDao.deleteById(id);

    }
}
