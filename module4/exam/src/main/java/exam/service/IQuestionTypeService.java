package exam.service;

import exam.model.QuestionType;

import java.util.List;

public interface IQuestionTypeService {
    List<QuestionType> findAll();
}
