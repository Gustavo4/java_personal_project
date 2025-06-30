package com.java.personal;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> fruits = Arrays.asList("apple", "banana", "grapes");
//
//        fruits.sort(Comparator.reverseOrder());
//        fruits.forEach(System.out::println);
        int[] A = {1,2,3,4};
        var result = 1;

        Set<Integer> seen = new HashSet<>();
        for (int num: A) {
            if (num > 0) {
                seen.add(num);
            }
        }

        for (int i = 0; i <= A.length + 1; i++) {
            if (!seen.contains(i)) {
                result = i;
            }
        }

        System.out.println(result);
    }
}