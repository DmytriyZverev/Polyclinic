package service;

import domain.Equipment;

public interface EquipmentService extends GenericService {

    Equipment getById(Integer id);

}
