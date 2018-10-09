package lee.bright.controller;

import lee.bright.service.AnswerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/answer")
public class AnswerController {

    @Resource
    private AnswerService answerService;

    @ResponseBody
    @RequestMapping("/insert")
    public String insertOrUpdate(@RequestParam("key") String key,
                                 @RequestParam("value") String value){
        return answerService.insertOrUpdate(key, value)? "true":"false";
    }

    @ResponseBody
    @RequestMapping("/get")
    public String getValueByKey(String key){
        return answerService.getValueByKey(key);
    }
}
