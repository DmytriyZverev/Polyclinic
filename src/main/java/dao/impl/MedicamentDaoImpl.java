package dao.impl;

import dao.MedicamentDao;
import domain.Medicament;

import java.util.ArrayList;
import java.util.List;


public class MedicamentDaoImpl extends GenericDaoImpl<Medicament> implements MedicamentDao {

    private static MedicamentDao instance;

    private MedicamentDaoImpl() {
        super(Medicament.class, (o) -> {
            Medicament medicament = null;
            if (o instanceof Medicament) {
                medicament = (Medicament) o;
            }
            return medicament;
        });

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

}
