package service.impl;

import dao.EquipmentDao;
import dao.impl.EquipmentDaoImpl;
import domain.Equipment;
import service.EquipmentService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


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
    public List<Equipment> getById(Integer id) {
        return equipmentDao.getById(id);
    }

    @Override
    public Optional<Equipment> save(Equipment object) {
        return equipmentDao.save(object);
    }

    @Override
    public Optional<Equipment> update(Equipment object) {
        return equipmentDao.update(object);
    }

    @Override
    public Collection<Equipment> getAll() {
        return equipmentDao.getAll();
    }

    @Override
    public Optional<Equipment> getByName(String name) {
        return equipmentDao.getByName(name);
    }

    @Override
    public void delete(Equipment object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
