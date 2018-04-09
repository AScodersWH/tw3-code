package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> collectionT = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<String ,Integer>();
        for(String s:collection2.get("value"))
        {
            map.put(s,1);
        }
        for(String ss : collection1){
            Integer i = map .get(ss);
            if(i!=null)
            {
                collectionT.add(ss);
            }
        }
        return collectionT;
    }
}
