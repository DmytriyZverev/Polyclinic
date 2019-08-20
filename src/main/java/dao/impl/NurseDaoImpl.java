package dao.impl;

import dao.NurseDao;
import domain.Nurse;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class NurseDaoImpl extends GenericDaoImpl<Nurse> implements NurseDao {

    private static NurseDao instance;

    private NurseDaoImpl() {
        super(Nurse.class, (o) -> {
            Nurse nurse = null;
            if (o instanceof Nurse) {
                nurse = (Nurse) o;
            }
            return nurse;
        });

    }

    public static NurseDao getInstance() {
        if (instance == null) {
            instance = new NurseDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Nurse> getByProfile(String profile) {
        return empty();
    }


    @Override
    public Set<Nurse> getAll() {
        return new HashSet<>(super.getAll());
    }

}
