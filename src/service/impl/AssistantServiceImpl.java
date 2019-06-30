package service.impl;

import dao.AssistantDao;
import dao.impl.AssistantDaoImpl;
import domain.Personnel;
import domain.Assistant;
import service.AssistantService;


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
    public Assistant getByCategory(Integer category) {
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
