package jwttoken.practice.user.repository;

import jwttoken.practice.user.domain.Users;
import jwttoken.practice.user.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
    Users findByUsername(String username);
}
