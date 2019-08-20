package service.impl;

import dao.NurseDao;
import dao.impl.NurseDaoImpl;
import domain.Nurse;
import service.NurseService;

import java.util.Optional;
import java.util.Set;


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
    public Optional<Nurse> getByProfile(String profile) {
        return nurseDao.getByProfile(profile);
    }

    @Override
    public boolean fire(Nurse personnel) {
        //add some logic
        nurseDao.delete(personnel);
        return true;
    }

    @Override
    public boolean hire(Nurse personnel) {
        //add some logic
        nurseDao.save(personnel);
        return true;
    }

    @Override
    public boolean promote(Nurse personnel) {
        //add some logic
        nurseDao.update(personnel);
        return true;
    }

    @Override
    public Optional<Nurse> save(Nurse nurse) {
        return nurseDao.save(nurse);
    }

    @Override
    public Optional<Nurse> update(Nurse nurse) {
        return nurseDao.update(nurse);
    }

    @Override
    public Set<Nurse> getAll() {
        return nurseDao.getAll();
    }

    @Override
    public Optional<Nurse> getById(Long id) {
        return nurseDao.getById(id);
    }

    @Override
    public void delete(Nurse nurse) { nurseDao.delete(nurse);

    }

    @Override
    public void deleteAll() { nurseDao.deleteAll();

    }

    @Override
    public void deleteById(Long id) { nurseDao.deleteById(id);

    }
}
