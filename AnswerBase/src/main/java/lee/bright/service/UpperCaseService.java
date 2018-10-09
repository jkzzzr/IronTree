package lee.bright.service;

import com.google.common.base.Strings;
import org.springframework.stereotype.Service;

@Service
public class UpperCaseService {

    public String toUpperCaseService(String inputString){
        if (Strings.isNullOrEmpty(inputString)){
            return "";
        }
        return inputString.toUpperCase();
    }
}
