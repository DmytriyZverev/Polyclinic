package dao;

import domain.Medicament;

public interface MedicamentDao extends GenericDao {

    Medicament[] getByPrice(Double price);

}
