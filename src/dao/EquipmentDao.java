package dao;

import domain.Equipment;

public interface EquipmentDao extends GenericDao {

    Equipment getById(Integer id);

}
