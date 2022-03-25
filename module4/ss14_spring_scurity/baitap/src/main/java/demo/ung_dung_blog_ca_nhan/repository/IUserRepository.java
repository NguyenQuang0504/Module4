package demo.ung_dung_blog_ca_nhan.repository;

import demo.ung_dung_blog_ca_nhan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
