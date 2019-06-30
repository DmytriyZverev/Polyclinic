package service;

public interface GenericService {

    Object save(Object object);

    Object update(Object object);

    Object[] getAll();

    Object getByName(String Name);

    void delete(Object object);

    void deleteAll();

    void deleteByName(String Name);
}
