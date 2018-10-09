package lee.bright.domain;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AnswerDomain {

    private HashMap<String, String> map = new HashMap<>();

    public boolean insertOrUpdate(String key, String value){
        try {
            map.put(key, value);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public String getValueByKey(String key){
        return map.get(key);
    }
}
