package demo.validate_form_dang_ky.repository;

import demo.validate_form_dang_ky.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
