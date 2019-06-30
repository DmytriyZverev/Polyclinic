package dao.impl;

import dao.MedicamentDao;
import domain.Medicament;

public class MedicamentDaoImpl implements MedicamentDao {

    private static MedicamentDao instance;

    private MedicamentDaoImpl() {

    }

    public static MedicamentDao getInstance() {
        if (instance == null) {
            instance = new MedicamentDaoImpl();
        }
        return instance;
    }

    @Override
    public Medicament[] getByPrice(Double price) {
        return null;
    }

    @Override
    public Medicament save(Object object) {
        return null;
    }

    @Override
    public Medicament update(Object object) {
        return null;
    }

    @Override
    public Medicament[] getAll() {
        return new Medicament[0];
    }

    @Override
    public Medicament getByName(String name) {
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
