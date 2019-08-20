package dao.impl;

import dao.DoctorDao;
import domain.Doctor;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class DoctorDaoImpl extends GenericDaoImpl<Doctor> implements DoctorDao {

    private static DoctorDao instance;

    private DoctorDaoImpl() {
        super(Doctor.class, (o) -> {
            Doctor doctor = null;
            if (o instanceof Doctor) {
                doctor = (Doctor) o;
            }
            return doctor;
        });

    }

    public static DoctorDao getInstance() {
        if (instance == null) {
            instance = new DoctorDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Doctor> getBySpecialty(String specialty) {
        return empty();
    }


    @Override
    public Set<Doctor> getAll() {
        return new HashSet<>(super.getAll());
    }


}
