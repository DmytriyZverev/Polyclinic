package dao;

import domain.Personnel;

import java.util.Set;


public interface PersonnelDao <T extends Personnel> extends GenericDao<T> {
    @Override
    Set<T> getAll();
}
