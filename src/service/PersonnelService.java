package service;

import domain.Personnel;

public interface PersonnelService extends GenericService {

    boolean fire(Personnel personnel);

    boolean hire(Personnel personnel);

    boolean promote(Personnel personnel);

}
