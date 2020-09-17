package org.fahad.codingevents.data;

import org.fahad.codingevents.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
