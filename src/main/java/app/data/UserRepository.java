package app.data;

import org.springframework.data.repository.Repository;

/**
 * Created by Nikita.D.Brylyakov on 18.08.2017.
 */

public interface UserRepository extends Repository<User, Integer> {

    User findUserByLogin(String login);
}
