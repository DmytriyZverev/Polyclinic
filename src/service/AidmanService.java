package service;

import domain.Aidman;
import java.util.Optional;

public interface AidmanService extends PersonnelService<Aidman> {

    Optional<Aidman> getByIncrease(Integer increase);

}
