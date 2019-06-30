package dao.impl;

import dao.EquipmentDao;
import domain.Equipment;

public class EquipmentDaoImpl implements EquipmentDao {

    private static EquipmentDao instance;

    private EquipmentDaoImpl() {

    }

    public static EquipmentDao getInstance() {
        if (instance == null) {
            instance = new EquipmentDaoImpl();
        }
        return instance;
    }

    @Override
    public Equipment getById(Integer id) {
        return null;
    }

    @Override
    public Equipment save(Object object) {
        return null;
    }

    @Override
    public Equipment update(Object object) {
        return null;
    }

    @Override
    public Equipment[] getAll() {
        return new Equipment[0];
    }

    @Override
    public Equipment getByName(String name) {
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
