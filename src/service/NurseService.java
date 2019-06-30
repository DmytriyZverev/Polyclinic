package service;

import domain.Nurse;

public interface NurseService extends PersonnelService {

    Nurse getByProfile(String profile);

}
