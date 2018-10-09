package lee.bright.controller;

import lee.bright.service.UpperCaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AnswerController {

    @Resource
    private UpperCaseService upperCaseService;

    @ResponseBody
    @RequestMapping("/answer")
    public String answerToUpperCase(@RequestParam("key") String inputString){
        return upperCaseService.toUpperCaseService(inputString);
    }
}
