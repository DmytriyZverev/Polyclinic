package service.impl;

import dao.MedicamentDao;
import dao.impl.MedicamentDaoImpl;
import domain.Medicament;
import service.MedicamentService;

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
    public Medicament[] getByPrice(Double price) {
        return new Medicament[0];
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
