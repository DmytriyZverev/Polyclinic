package service.impl;

import dao.AssistantDao;
import dao.impl.AssistantDaoImpl;
import domain.Assistant;
import service.AssistantService;

import java.util.Optional;
import java.util.Set;


public class AssistantServiceImpl implements AssistantService {

    private static AssistantService instance;

    private AssistantDao assistantDao = AssistantDaoImpl.getInstance();

    private AssistantServiceImpl(){

    }

    public static AssistantService getInstance() {
        if (instance == null) {
            instance = new AssistantServiceImpl();
        }
        return instance;
    }

    @Override
    public Optional<Assistant> getByCategory(Integer category) {
        return assistantDao.getByCategory(category);
    }

    @Override
    public boolean fire(Assistant personnel) {
        //add some logic
        assistantDao.delete(personnel);
        return true;
    }

    @Override
    public boolean hire(Assistant personnel) {
        //add some logic
        assistantDao.save(personnel);
        return true;
    }

    @Override
    public boolean promote(Assistant personnel) {
        //add some logic
        assistantDao.update(personnel);
        return true;
    }

    @Override
    public Optional<Assistant> save(Assistant object) {
        return assistantDao.save(object);
    }

    @Override
    public Optional<Assistant> update(Assistant object) {
        return assistantDao.update(object);
    }

    @Override
    public Set<Assistant> getAll() {
        return assistantDao.getAll();
    }

    @Override
    public Optional<Assistant> getByName(String name) {
        return assistantDao.getByName(name);
    }

    @Override
    public void delete(Assistant object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
