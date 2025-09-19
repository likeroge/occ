package ru.avia.occportal.infrastructure.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.avia.occportal.core.entities.UserDummy;
import ru.avia.occportal.core.repos.UserDummyRepo;

/**
 * @author Egor
 * @name JpaUserDummyRepository
 * @date 19.09.2025
 */

@Repository
public interface JpaUserDummyRepository extends UserDummyRepo, JpaRepository<UserDummy, Long> {
}
