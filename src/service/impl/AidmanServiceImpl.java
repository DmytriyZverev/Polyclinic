package service.impl;

import dao.AidmanDao;
import dao.impl.AidmanDaoImpl;
import domain.Aidman;
import service.AidmanService;

import java.util.Optional;
import java.util.Set;


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
    public Optional<Aidman> getByIncrease(Integer increase) {
        return aidmanDao.getByIncrease(increase);
    }

    @Override
    public boolean fire(Aidman personnel) {
        //add some logic
        aidmanDao.delete(personnel);
        return true;
    }

    @Override
    public boolean hire(Aidman personnel) {
        //add some logic
        aidmanDao.save(personnel);
        return true;
    }

    @Override
    public boolean promote(Aidman personnel) {
        //add some logic
        aidmanDao.update(personnel);
        return true;
    }

    @Override
    public Optional<Aidman> save(Aidman object) {
        return aidmanDao.save(object);
    }

    @Override
    public Optional<Aidman> update(Aidman object) {
        return aidmanDao.update(object);
    }

    @Override
    public Set<Aidman> getAll() {
        return aidmanDao.getAll();
    }

    @Override
    public Optional<Aidman> getByName(String name) {
        return aidmanDao.getByName(name);
    }

    @Override
    public void delete(Aidman object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
