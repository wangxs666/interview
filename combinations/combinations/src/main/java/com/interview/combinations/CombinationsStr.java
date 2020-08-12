package com.interview.combinations;

import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class CombinationsStr {
    public List<String> letterCombinations(Integer[] digitsArr) {

        String digits = StringUtils.join(digitsArr);
        List<String> list = new ArrayList<String>();
        if(digits.length() == 0)
            return list;

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        int idx = 0;
        while(idx < digits.length() && (digits.charAt(idx) - 48 == 0 || digits.charAt(idx) - 48 == 1)){
            idx++;
        }
        if (idx == digits.length()) {
            return list;
        }

        for(int i = 0; i < map.get(digits.charAt(idx) - 48).length(); i++){
            list.add(map.get(digits.charAt(idx) - 48).substring(i,i+1));
        }
        for(int i = idx + 1; i < digits.length(); i++){
            if (digits.charAt(i) - 48 == 0 || digits.charAt(i) - 48 == 1){
                continue;
            }
            String str = map.get(digits.charAt(i) - 48);
            int len = list.size();
            for(int k = 0; k < len; k++){
                String s = list.get(0);
                list.remove(0);
                for(int m = 0; m < str.length(); m++){
                    list.add(s + str.substring(m,m+1));
                }
            }
        }
        return list;
    }
}
