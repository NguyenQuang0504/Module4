package exam.service;

import exam.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionService {
    Page<Question> findAll(Pageable pageable);

    void save(Question question);

    void delete(Integer id);

    List<Question> findByNameAndType(String search, String type);
}
