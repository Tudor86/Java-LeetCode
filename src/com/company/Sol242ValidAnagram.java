package com.company;

import java.util.HashMap;
import java.util.Map;

public class Sol242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> hms = new HashMap<>();
        HashMap <Character,Integer> hmt = new HashMap<>();

        for(char c : s.toCharArray())
            if(hms.containsKey(c))
                hms.put(c,hms.get(c) + 1);
            else
                hms.put(c,1);

        for(char c : t.toCharArray())
            if(hmt.containsKey(c))
                hmt.put(c,hmt.get(c) + 1);
            else
                hmt.put(c,1);

        for(Map.Entry<Character,Integer> entry : hms.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(hmt.containsKey(key)){
                Integer value2 = hmt.get(key);
                if(value != value2)
                    return false;
            }
            else
                return false;


        }

        return true;
    }
}