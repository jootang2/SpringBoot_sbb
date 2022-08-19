package com.mysite.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionRepository questionRepository;

    @RequestMapping("/question/list")
    public String list(Model model){
        List<Question> questionList = questionRepository.findAll();
        model.addAttribute("questionList" , questionList);
        return "question_list";
    }

}