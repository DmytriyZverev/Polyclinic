package dao.impl;

import dao.AidmanDao;
import domain.Aidman;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class AidmanDaoImpl extends GenericDaoImpl<Aidman> implements AidmanDao{

    private static AidmanDao instance;

    private AidmanDaoImpl() {
        super(Aidman.class, (o) -> {
            Aidman aidman = null;
            if (o instanceof Aidman) {
                aidman = (Aidman) o;
            }
            return aidman;
        });

    }

    public static AidmanDao getInstance() {
        if (instance == null) {
            instance = new AidmanDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Aidman> getByIncrease(Integer increase) {
        return empty();
    }


    @Override
    public Set<Aidman> getAll() {
        return new HashSet<>(super.getAll());
    }


}
