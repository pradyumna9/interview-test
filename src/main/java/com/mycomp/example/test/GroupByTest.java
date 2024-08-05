package com.mycomp.example.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class GroupByTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Orange", "Apple", "Grapes", "Apple", "Orange", "Banana", "Orange");
        Map<String, Long> collectCountMap = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(collectCountMap);
        //sorting based onn count
        Map<String,Long> finalMap = new LinkedHashMap<>();
        collectCountMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByKey()).forEachOrdered(e -> finalMap.put(e.getKey(),e.getValue()));
        System.out.println(finalMap);

    }
}
