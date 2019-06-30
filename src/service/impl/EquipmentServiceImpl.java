package service.impl;

import dao.EquipmentDao;
import dao.impl.EquipmentDaoImpl;
import domain.Equipment;
import service.EquipmentService;


public class EquipmentServiceImpl implements EquipmentService {

    private static EquipmentService instance;

    private EquipmentDao equipmentDao = EquipmentDaoImpl.getInstance();

    private EquipmentServiceImpl() {

    }

    public static EquipmentService getInstance() {
        if (instance == null) {
            instance = new EquipmentServiceImpl();
        }
        return instance;
    }

    @Override
    public Equipment getById(Integer id) {
        return null;
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
