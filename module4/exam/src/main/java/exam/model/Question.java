package exam.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Khong duoc de trong")
    @Size(min = 5, max = 100, message = "Do dai khong hop le")
    private String title;

    @NotEmpty
    @Size(min = 10, max = 500, message = "Do dai khong hop le")
    private String question;

    private String answer;

    @NotEmpty(message = "Khong duoc de trong")
    private String date;

    @NotEmpty(message = "Khong duoc de trong")
    private String status;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_question_type", nullable = false)
    private QuestionType questionType;
    public Question() {
    }

    public Question(Integer id, String title, String question, String answer, String date, String status, QuestionType questionType) {
        this.id = id;
        this.title = title;
        this.question = question;
        this.answer = answer;
        this.date = date;
        this.status = status;
        this.questionType = questionType;
    }

    public Question(Integer id, @NotEmpty(message = "Khong duoc de trong") @Size(min = 5, max = 100, message = "Do dai khong hop le") String title, @NotEmpty @Size(min = 10, max = 500, message = "Do dai khong hop le") String question, @NotEmpty(message = "Khong duoc de trong") String date, @NotEmpty(message = "Khong duoc de trong") String status, QuestionType questionType) {
        this.id = id;
        this.title = title;
        this.question = question;
        this.date = date;
        this.status = status;
        this.questionType = questionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String  getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
