package dao.impl;

import dao.PatientDao;
import domain.Patient;

public class PatientDaoImpl implements PatientDao {

    private static PatientDao instance;

    private PatientDaoImpl() {

    }

    public static PatientDao getInstance() {
        if (instance == null) {
            instance = new PatientDaoImpl();
        }
        return instance;
    }

    @Override
    public Patient getByDisease(String disease) {
        return null;
    }

    @Override
    public Patient save(Object object) {
        return null;
    }

    @Override
    public Patient update(Object object) {
        return null;
    }

    @Override
    public Patient[] getAll() {
        return new Patient[0];
    }

    @Override
    public Patient getByName(String name) {
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
