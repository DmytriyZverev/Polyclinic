package dao;

import domain.Nurse;
import java.util.Optional;

public interface NurseDao extends PersonnelDao<Nurse> {

    Optional<Nurse> getByProfile(String profile);

}
