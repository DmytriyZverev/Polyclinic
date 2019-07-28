package service;

import domain.Medicament;
import java.util.List;

public interface MedicamentService extends GenericService<Medicament> {

    List<Medicament> getByPrice(Double price);

}
