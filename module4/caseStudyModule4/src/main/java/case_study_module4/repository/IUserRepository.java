package case_study_module4.repository;

import case_study_module4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from user where User_Name=?1", nativeQuery = true)
    User findByUserName(String userName);
}
