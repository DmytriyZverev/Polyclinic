package service;

import domain.Assistant;
import java.util.Optional;

public interface AssistantService extends PersonnelService<Assistant> {

    Optional<Assistant> getByCategory(Integer category);

}
