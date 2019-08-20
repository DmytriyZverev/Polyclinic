package dao;

import domain.Aidman;
import java.util.Optional;

public interface AidmanDao extends PersonnelDao<Aidman> {
    Optional<Aidman> getByIncrease(Integer increase);

}
