package service;

import domain.Personnel;

import java.util.Set;

public interface PersonnelService<T extends Personnel> extends GenericService<T> {

    boolean fire(T personnel);

    boolean hire(T personnel);

    boolean promote(T personnel);

    @Override
    Set<T> getAll();
}
