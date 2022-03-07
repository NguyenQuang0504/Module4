package demo.validate_bai_hat.repository;

import demo.validate_bai_hat.model.TheSong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITheSongRepository extends JpaRepository<TheSong, Integer> {

}
