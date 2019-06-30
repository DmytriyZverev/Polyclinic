package service.impl;

import dao.AidmanDao;
import dao.impl.AidmanDaoImpl;
import domain.Personnel;
import domain.Aidman;
import service.AidmanService;


public class AidmanServiceImpl implements AidmanService {

    private static AidmanService instance;

    private AidmanDao aidmanDao = AidmanDaoImpl.getInstance();

    private AidmanServiceImpl(){

    }

    public static AidmanService getInstance() {
        if (instance == null) {
            instance = new AidmanServiceImpl();
        }
        return instance;
    }

    @Override
    public Aidman getByIncrease(Integer increase) {
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
