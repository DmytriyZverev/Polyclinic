package service.impl;

import dao.MedicamentDao;
import dao.impl.MedicamentDaoImpl;
import domain.Medicament;
import service.MedicamentService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class MedicamentServiceImpl implements MedicamentService {

    private static MedicamentService instance;

    private MedicamentDao medicamentDao = MedicamentDaoImpl.getInstance();

    private MedicamentServiceImpl() {

    }

    public static MedicamentService getInstance() {
        if (instance == null) {
            instance = new MedicamentServiceImpl();
        }
        return instance;
    }

    @Override
    public List<Medicament> getByPrice(Double price) {
        return medicamentDao.getByPrice(price);
    }

    @Override
    public Optional<Medicament> save(Medicament object) {
        return medicamentDao.save(object);
    }

    @Override
    public Optional<Medicament> update(Medicament object) {
        return medicamentDao.update(object);
    }

    @Override
    public Collection<Medicament> getAll() {
        return medicamentDao.getAll();
    }

    @Override
    public Optional<Medicament> getByName(String name) {
        return medicamentDao.getByName(name);
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
