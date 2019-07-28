package dao;

import domain.Equipment;
import java.util.List;

public interface EquipmentDao extends GenericDao<Equipment> {
    List<Equipment> getById(Integer id);

}
