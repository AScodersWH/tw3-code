package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<>();
        for(String ss:collectionA){
            Integer ii=map.get(ss);
            if(ii!=null){
                map.put(ss, ++ii);
                continue;
            }
            map.put(ss, 1);
        }

        for(String s:object.get("value"))
        {
            for(String key:map.keySet())
            {
                if(key == s)
                {
                    int value = map.get(key);
                    value = value - value/3;
                    map.put(key,value);
                }
            }
        }
        return map;
    }
}
