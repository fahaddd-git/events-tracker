package org.fahad.codingevents.data;

import org.fahad.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {

}
