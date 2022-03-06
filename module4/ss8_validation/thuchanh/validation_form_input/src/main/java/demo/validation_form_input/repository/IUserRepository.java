package demo.validation_form_input.repository;

import demo.validation_form_input.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
