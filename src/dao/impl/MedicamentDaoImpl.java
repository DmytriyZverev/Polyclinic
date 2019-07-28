package dao.impl;

import dao.MedicamentDao;
import domain.Medicament;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static java.util.Optional.empty;

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
    public List<Medicament> getByPrice(Double price) {
        return new ArrayList<>();
    }

    @Override
    public Optional<Medicament> save(Medicament object) {
        return empty();
    }

    @Override
    public Optional<Medicament> update(Medicament object) {
        return empty();
    }

    @Override
    public List<Medicament> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Medicament> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Medicament object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
