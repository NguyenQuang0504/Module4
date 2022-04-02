package case_study_module4.repository;

import case_study_module4.model.User;
import case_study_module4.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserRoleRepository extends JpaRepository<UserRole, Integer> {
    List<UserRole> findByUser(User user);
}
