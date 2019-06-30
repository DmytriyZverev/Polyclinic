package dao.impl;

import dao.NurseDao;
import domain.Nurse;

public class NurseDaoImpl implements NurseDao {

    private static NurseDao instance;

    private NurseDaoImpl() {

    }

    public static NurseDao getInstance() {
        if (instance == null) {
            instance = new NurseDaoImpl();
        }
        return instance;
    }

    @Override
    public Nurse getByProfile(String profile) {
        return null;
    }

    @Override
    public Nurse save(Object object) {
        return null;
    }

    @Override
    public Nurse update(Object object) {
        return null;
    }

    @Override
    public Nurse[] getAll() {
        return new Nurse[0];
    }

    @Override
    public Nurse getByName(String name) {
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
