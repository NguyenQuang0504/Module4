package thuchanhscurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thuchanhscurity.model.AppUser;
import thuchanhscurity.model.UserRole;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    List<UserRole> findByAppUser(AppUser appUser);
}
