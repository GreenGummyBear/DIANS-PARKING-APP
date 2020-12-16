package parkingfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import parkingfinder.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);

}
<<<<<<< HEAD
=======

>>>>>>> main
