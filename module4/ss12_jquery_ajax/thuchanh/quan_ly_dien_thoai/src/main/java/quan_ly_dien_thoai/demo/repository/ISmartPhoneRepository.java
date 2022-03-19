package quan_ly_dien_thoai.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quan_ly_dien_thoai.demo.model.SmartPhone;
@Repository
public interface ISmartPhoneRepository extends JpaRepository<SmartPhone, Integer> {
}
