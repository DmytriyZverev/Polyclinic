package service;

import domain.Nurse;
import java.util.Optional;

public interface NurseService extends PersonnelService<Nurse> {

    Optional<Nurse> getByProfile(String profile);

}
