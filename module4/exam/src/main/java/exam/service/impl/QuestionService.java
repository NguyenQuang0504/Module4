package exam.service.impl;

import exam.model.Question;
import exam.repository.IQuestionRepo;
import exam.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
    private IQuestionRepo iQuestionRepo;

    @Override
    public Page<Question> findAll(Pageable pageable) {
        return iQuestionRepo.findAll(pageable);
    }

    @Override
    public void save(Question question) {
        iQuestionRepo.save(question);
    }

    @Override
    public void delete(Integer id) {
        iQuestionRepo.deleteById(id);
    }

    @Override
    public List<Question> findByNameAndType(String search, String type) {
        return iQuestionRepo.searchBy(search, type);
    }
}
