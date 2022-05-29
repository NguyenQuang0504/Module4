package exam.repository;

import exam.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestionRepo extends JpaRepository<Question, Integer> {
    @Query(value = "select * from question where title like %?1% and id_question_type =?2", nativeQuery = true)
    List<Question> searchBy(String search, String type);
}
