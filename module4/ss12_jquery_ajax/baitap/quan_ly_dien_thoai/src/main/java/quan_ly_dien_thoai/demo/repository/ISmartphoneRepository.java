package quan_ly_dien_thoai.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import quan_ly_dien_thoai.demo.model.Smartphone;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
    @Query(value = "select * from smartphones where id = ?1", nativeQuery = true)
    Smartphone findAllById1(Long id);
}
