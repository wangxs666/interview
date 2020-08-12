package com.interview;

import com.interview.combinations.CombinationsStr;
import org.junit.Test;

import java.util.List;

public class ConbinationsTest {

    @Test
    public void test2() {
        CombinationsStr combinationsStr = new CombinationsStr();
//        Integer[] arr = {2, 3};
//        Integer[] arr = {0, 1};
//        Integer[] arr = {0, 1, 2, 0, 3};
        Integer[] arr = {23, 45}; //implement Stage 2:converting the digits from 0 to 99 into letters

        List<String> list = combinationsStr.letterCombinations(arr);
        System.out.println(list);
    }

}
