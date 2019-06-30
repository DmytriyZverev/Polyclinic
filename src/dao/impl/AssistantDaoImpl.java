package dao.impl;

import dao.AssistantDao;
import domain.Assistant;

public class AssistantDaoImpl implements AssistantDao {

    private static AssistantDao instance;

    private AssistantDaoImpl() {

    }

    public static AssistantDao getInstance() {
        if (instance == null) {
            instance = new AssistantDaoImpl();
        }
        return instance;
    }

    @Override
    public Assistant getByCategory(Integer category) {
        return null;
    }

    @Override
    public Assistant save(Object object) {
        return null;
    }

    @Override
    public Assistant update(Object object) {
        return null;
    }

    @Override
    public Assistant[] getAll() {
        return new Assistant[0];
    }

    @Override
    public Assistant getByName(String name) {
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
