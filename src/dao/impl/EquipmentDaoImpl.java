package dao.impl;

import dao.EquipmentDao;
import domain.Equipment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static java.util.Optional.empty;

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
    public List<Equipment> getById(Integer id) {
        return new ArrayList<>();
    }

    @Override
    public Optional<Equipment> save(Equipment object) {
        return empty();
    }

    @Override
    public Optional<Equipment> update(Equipment object) {
        return empty();
    }

    @Override
    public List<Equipment> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Equipment> getByName(String name) {
        return empty();
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
