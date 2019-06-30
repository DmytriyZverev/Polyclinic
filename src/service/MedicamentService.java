package service;

import domain.Medicament;

public interface MedicamentService extends GenericService {

    Medicament[] getByPrice(Double price);

}
