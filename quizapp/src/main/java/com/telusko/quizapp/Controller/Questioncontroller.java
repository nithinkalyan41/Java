package com.telusko.quizapp.Controller;


import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class Questioncontroller {
            @Autowired
            QuestionService questionService;

            @GetMapping("allquestions")
            public ResponseEntity<List<Question>> getAllQuestion(){
                return questionService.getAllQuestions();
            }
            @GetMapping("category/{category}")
            public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
                return questionService.getQuestionByCategory(category);
            }
            @PostMapping ("add")
            public ResponseEntity<String> addQuestion(@RequestBody Question question){
                 return questionService.addQuestion(question);
            }
}
