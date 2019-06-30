package dao;

import domain.Nurse;

public interface NurseDao extends GenericDao {

    Nurse getByProfile(String profile);

}
