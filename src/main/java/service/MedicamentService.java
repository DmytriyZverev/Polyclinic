package service;

import domain.Medicament;
import java.util.List;
import java.util.Optional;

public interface MedicamentService extends GenericService<Medicament> {

    List<Medicament> getByPrice(Double price);

    Optional<Medicament> sale(Medicament medicament, Integer count);

}
