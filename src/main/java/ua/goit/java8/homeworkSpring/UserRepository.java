package ua.goit.java8.homeworkSpring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM spring_hw.users WHERE username = :username", nativeQuery = true)
    public Optional<User> findUserByUsername(String username);
}
