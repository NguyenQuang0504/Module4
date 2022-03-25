package demo.ung_dung_blog_ca_nhan.repository;

import demo.ung_dung_blog_ca_nhan.model.User;
import demo.ung_dung_blog_ca_nhan.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserRoleRepository extends JpaRepository<UserRole, Integer> {
    List<UserRole> findByUser(User user);
}
