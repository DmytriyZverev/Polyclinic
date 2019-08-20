package dao.impl;

import dao.PatientDao;
import domain.Patient;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class PatientDaoImpl extends GenericDaoImpl<Patient> implements PatientDao {

    private static PatientDao instance;

    private PatientDaoImpl() {
        super(Patient.class, (o) -> {
            Patient patient = null;
            if (o instanceof Patient) {
                patient = (Patient) o;
            }
            return patient;
        });

    }

    public static PatientDao getInstance() {
        if (instance == null) {
            instance = new PatientDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Patient> getByDisease(String disease) {
        return empty();
    }


    @Override
    public Set<Patient> getAll() {
        return new HashSet<>(super.getAll());
    }

}
