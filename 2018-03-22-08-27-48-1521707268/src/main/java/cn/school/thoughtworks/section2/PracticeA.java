package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<String ,Integer>();
        for(String ss:collection1){
            Integer ii=map.get(ss);
            if(ii!=null){
                map.put(ss, ++ii);
                continue;
            }
            map.put(ss, 1);
        }
        return map;
    }
}
