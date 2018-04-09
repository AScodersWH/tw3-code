package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<String ,Integer>();
        for(String ss:collection1){
            String key = new String();
            int vaule=0;
            Integer ii = map.get(ss);
            String []s = ss.split("-");
            if(s.length > 1)
            {
                key =s[0];
                vaule = Integer.parseInt(s[1]);
            }
            else
            {
                key = s[0];
                vaule = 1;
            }

            if(ii!=null){
                ii = ii + vaule;
                map.put(key, ii);
                continue;
            }
            map.put(key, vaule);
        }
        return map;
    }
}
