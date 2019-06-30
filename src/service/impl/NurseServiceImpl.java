package service.impl;

import dao.NurseDao;
import dao.impl.NurseDaoImpl;
import domain.Personnel;
import domain.Nurse;
import service.NurseService;


public class NurseServiceImpl implements NurseService {

    private static NurseService instance;

    private NurseDao nurseDao = NurseDaoImpl.getInstance();

    private NurseServiceImpl(){

    }

    public static NurseService getInstance() {
        if (instance == null) {
            instance = new NurseServiceImpl();
        }
        return instance;
    }

    @Override
    public Nurse getByProfile(String profile) {
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
