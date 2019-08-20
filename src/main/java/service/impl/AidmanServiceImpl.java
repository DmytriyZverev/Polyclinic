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

    private AidmanServiceImpl() {

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
    public Optional<Aidman> save(Aidman aidman) {
        return aidmanDao.save(aidman);
    }

    @Override
    public Optional<Aidman> update(Aidman aidman) {
        return aidmanDao.update(aidman);
    }

    @Override
    public Set<Aidman> getAll() {
        return aidmanDao.getAll();
    }

    @Override
    public Optional<Aidman> getById(Long id) {
        return aidmanDao.getById(id);
    }

    @Override
    public void delete(Aidman aidman) {
        aidmanDao.delete(aidman);

    }

    @Override
    public void deleteAll() {
        aidmanDao.deleteAll();

    }

    @Override
    public void deleteById(Long id) { aidmanDao.deleteById(id);

    }
}
