package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for(String s:object.get("value"))
        {
            for(String key:collectionA.keySet())
            {
                if(key == s)
                {
                    int value = collectionA.get(key);
                    value = value - value/3;
                    collectionA.put(key,value);
                }
            }
        }
        return collectionA;
    }
}
