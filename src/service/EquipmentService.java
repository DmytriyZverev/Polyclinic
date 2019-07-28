package service;

import domain.Equipment;
import java.util.List;

public interface EquipmentService extends GenericService<Equipment> {

    List<Equipment> getById(Integer id);

}
