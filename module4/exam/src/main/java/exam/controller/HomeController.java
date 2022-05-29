package exam.controller;

import exam.model.Question;
import exam.model.QuestionType;
import exam.service.IQuestionService;
import exam.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private IQuestionService iQuestionService;
    @Autowired
    private IQuestionTypeService iQuestionTypeService;
    @GetMapping("/home")
    public String home(@PageableDefault(size = 5)Pageable pageable, ModelMap modelMap){
        Page<Question> listQuestion = iQuestionService.findAll(pageable);
        modelMap.addAttribute("listQuestion", listQuestion);
        List<QuestionType> questionTypes = iQuestionTypeService.findAll();
        modelMap.addAttribute("questionType", questionTypes);
        return "display";
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap){
        Question question = new Question();
        modelMap.addAttribute("question1", question);
       List<QuestionType> questionTypes = iQuestionTypeService.findAll();
       modelMap.addAttribute("questionType", questionTypes);
        return "create";
    }
    @PostMapping("/save")
    public String save(@Validated @ModelAttribute(name = "question1")Question question, BindingResult bindingResult, ModelMap modelMap)
    {
        if (bindingResult.hasFieldErrors()){
            List<QuestionType> questionTypes = iQuestionTypeService.findAll();
            modelMap.addAttribute("questionType", questionTypes);
            return "create";
        }
        else {
            iQuestionService.save(question);
            return "redirect:/home";
        }
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        iQuestionService.delete(id);
        return "redirect:/home";
    }
    @GetMapping("/search")
    public String search(@RequestParam String search, @RequestParam String type, ModelMap modelMap){
        List<Question> questionList = iQuestionService.findByNameAndType(search, type);
        modelMap.addAttribute("listQuestion", questionList);
        List<QuestionType> questionTypes = iQuestionTypeService.findAll();
        modelMap.addAttribute("questionType", questionTypes);
        return "display_search";
    }
}
