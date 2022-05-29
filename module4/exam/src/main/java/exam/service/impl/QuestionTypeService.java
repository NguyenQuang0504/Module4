package exam.service.impl;

import exam.model.QuestionType;
import exam.repository.IQuestionTypeRepo;
import exam.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeService implements IQuestionTypeService {
    @Autowired
    private IQuestionTypeRepo iQuestionTypeRepo;

    @Override
    public List<QuestionType> findAll() {
        return iQuestionTypeRepo.findAll();
    }
}
