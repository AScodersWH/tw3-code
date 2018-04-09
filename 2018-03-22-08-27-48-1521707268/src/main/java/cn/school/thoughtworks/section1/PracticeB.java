package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> collectionT = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<String ,Integer>();
        for(String s:collection2.get(0))
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
