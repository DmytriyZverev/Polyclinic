package dao;

import domain.Assistant;

public interface AssistantDao extends GenericDao {

    Assistant getByCategory(Integer category);

}
