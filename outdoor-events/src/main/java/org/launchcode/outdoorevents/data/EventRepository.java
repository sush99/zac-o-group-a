package org.launchcode.outdoorevents.data;

import org.launchcode.outdoorevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
