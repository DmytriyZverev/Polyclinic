package service;

import domain.Assistant;

public interface AssistantService extends PersonnelService {

    Assistant getByCategory(Integer category);

}
