package com.mycomp.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateTest {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple","orange","apple","banana","chiku","orange","apple"));
		//using distinct
	//	List<Integer> listWithoutDuplicates  = numberList.stream().distinct().collect(Collectors.toList());
	//	listWithoutDuplicates.forEach(System.out::println);
		

		//List<String> listOfStringWithoutDuplicates = stringList.stream().distinct().collect(Collectors.toList());
		//listOfStringWithoutDuplicates.forEach(System.out::println);
		
		//using set
		Set<Integer> integerSet = numberList.stream().collect(Collectors.toSet());
		System.out.println(integerSet);
		
		Set<String> stringSet = stringList.stream().collect(Collectors.toSet());
		System.out.println(stringSet);
		
		//count the occurance
		
		Map<Integer,Long> occuranceMap = numberList.stream().collect(Collectors.toMap(Function.identity(),v->1L ,Long::sum));
		System.out.println(occuranceMap);
		Map<String,Long> occuranceStringMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(occuranceStringMap);
		//sorting by value
		Map<String,Long> sortedMap=new HashMap<>();
		occuranceStringMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey())
		.forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));
		System.out.println("Sorted Map:"+sortedMap);
	}
}
