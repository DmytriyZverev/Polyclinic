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
    public Optional<Medicament> sale(Medicament medicament, Integer count) {
        medicament.setCount(medicament.getCount() - count);
        return medicamentDao.update(medicament);
    }

    @Override
    public Optional<Medicament> save(Medicament medicament) {
        return medicamentDao.save(medicament);
    }

    @Override
    public Optional<Medicament> update(Medicament medicament) {
        return medicamentDao.update(medicament);
    }

    @Override
    public Collection<Medicament> getAll() {
        return medicamentDao.getAll();
    }

    @Override
    public Optional<Medicament> getById(Long id) {
        return medicamentDao.getById(id);
    }

    @Override
    public void delete(Medicament medicament) { medicamentDao.delete(medicament);

    }

    @Override
    public void deleteAll() { medicamentDao.deleteAll();

    }

    @Override
    public void deleteById(Long id) { medicamentDao.deleteById(id);

    }
}
