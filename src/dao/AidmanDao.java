package dao;

import domain.Aidman;

public interface AidmanDao extends GenericDao {

    Aidman getByIncrease(Integer increase);

}
