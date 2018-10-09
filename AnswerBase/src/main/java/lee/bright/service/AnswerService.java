package lee.bright.service;

import com.google.common.base.Strings;
import lee.bright.domain.AnswerDomain;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AnswerService {

    @Resource
    private AnswerDomain answerDomain;

    public String toUpperCaseService(String inputString){
        if (Strings.isNullOrEmpty(inputString)){
            return "";
        }
        return inputString.toUpperCase();
    }

    public boolean insertOrUpdate(String key, String value){
        return answerDomain.insertOrUpdate(key, value);
    }

    public String getValueByKey(String key){
        return answerDomain.getValueByKey(key);
    }
}
