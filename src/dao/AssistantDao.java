package dao;

import domain.Assistant;
import java.util.Optional;

public interface AssistantDao extends PersonnelDao<Assistant> {

    Optional<Assistant> getByCategory(Integer category);

}
