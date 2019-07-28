package dao;

import domain.Medicament;
import java.util.List;

public interface MedicamentDao extends GenericDao<Medicament> {
    List<Medicament> getByPrice(Double price);

}
