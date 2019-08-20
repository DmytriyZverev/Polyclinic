package dao.impl;

import dao.AssistantDao;
import domain.Assistant;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class AssistantDaoImpl extends GenericDaoImpl<Assistant> implements AssistantDao {

    private static AssistantDao instance;

    private AssistantDaoImpl() {
        super(Assistant.class, (o) -> {
            Assistant assistant = null;
            if (o instanceof Assistant) {
                assistant = (Assistant) o;
            }
            return assistant;
        });

    }

    public static AssistantDao getInstance() {
        if (instance == null) {
            instance = new AssistantDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Assistant> getByCategory(Integer category) {
        return empty();
    }


    @Override
    public Set<Assistant> getAll() {
        return new HashSet<>(super.getAll());
    }


}
