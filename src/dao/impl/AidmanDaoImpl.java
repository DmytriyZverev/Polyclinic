package dao.impl;

import dao.AidmanDao;
import domain.Aidman;

public class AidmanDaoImpl implements AidmanDao{

    private static AidmanDao instance;

    private AidmanDaoImpl() {

    }

    public static AidmanDao getInstance() {
        if (instance == null) {
            instance = new AidmanDaoImpl();
        }
        return instance;
    }

    @Override
    public Aidman getByIncrease(Integer increase) {
        return null;
    }

    @Override
    public Aidman save(Object object) {
        return null;
    }

    @Override
    public Aidman update(Object object) {
        return null;
    }

    @Override
    public Aidman[] getAll() {
        return new Aidman[0];
    }

    @Override
    public Aidman getByName(String name) {
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
