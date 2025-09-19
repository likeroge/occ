package ru.avia.occportal.core.repos;

import org.springframework.stereotype.Component;
import ru.avia.occportal.core.entities.UserDummy;

import java.util.Optional;

/**
 * @author Egor
 * @name UserDummyRepo
 * @date 19.09.2025
 */
public interface UserDummyRepo {
    public UserDummy create(UserDummy userDummy);

    public Optional<UserDummy> findById(Long id);

    public Optional<UserDummy> findByEmail(String email);

    public Iterable<UserDummy> findAll();

    public void deleteById(Long id);
}
