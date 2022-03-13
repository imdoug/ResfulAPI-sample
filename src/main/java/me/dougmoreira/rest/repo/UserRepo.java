package me.dougmoreira.rest.repo;

import me.dougmoreira.rest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
