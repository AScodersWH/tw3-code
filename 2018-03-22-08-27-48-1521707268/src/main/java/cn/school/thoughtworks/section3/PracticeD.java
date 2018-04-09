package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<String ,Integer>();
        for(String ss:collectionA){
            String kkey = new String();
            int vvaule=0;
            String []s = ss.split("-");

            if(s.length > 1)
            {
                kkey =s[0];
                vvaule = Integer.parseInt(s[1])-1;
            }
            else
            {
                kkey = s[0];
                vvaule = 1;
            }
            Integer ii = map.get(kkey);
            if(ii!=null){
                ii = ii + vvaule;
                map.put(kkey, ii);
                continue;
            }

            map.put(kkey, vvaule);
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
