package service.impl;

import dao.DoctorDao;
import dao.impl.DoctorDaoImpl;
import domain.Personnel;
import domain.Doctor;
import service.DoctorService;


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
    public Doctor getBySpecialty(String specialty) {
        return null;
    }

    @Override
    public boolean fire(Personnel personnel) {
        return false;
    }

    @Override
    public boolean hire(Personnel personnel) {
        return false;
    }

    @Override
    public boolean promote(Personnel personnel) {
        return false;
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
