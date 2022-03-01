package demo.ung_dung_quan_ly_khach_hang.repository;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;
import demo.ung_dung_quan_ly_khach_hang.model.Provinces;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProvincesRepository extends JpaRepository<Provinces, Integer> {

}
