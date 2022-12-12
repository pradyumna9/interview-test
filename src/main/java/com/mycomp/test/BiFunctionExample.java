package com.mycomp.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

	@Override
	public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
		return Stream.of(l1,l2).flatMap(List::stream).distinct().collect(Collectors.toList());
	}
	public static void main(String[] args) {
		BiFunction biFunction = new BiFunctionExample();
		List<Integer> l1 = Arrays.asList(1,8,9,7,5,2,1);
		List<Integer>l2 = Arrays.asList(5,78,98,21,90,21);
		System.out.println("Traditional Approach:"+biFunction.apply(l1, l2));
		
		//Annonymous InnerClass Approach
		
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
			
			@Override
			public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
				// TODO Auto-generated method stub
				return Stream.of(l1,l2).flatMap(List::stream).distinct().collect(Collectors.toList());
			}
		}; 
		System.out.println("Annonymous Approach:"+biFunction2.apply(l1, l2));
		
		//Lambda Approach
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction3 = (l3,l4) -> Stream.of(l3,l4).flatMap(List::stream).distinct().collect(Collectors.toList());
		Function<List<Integer>,List<Integer>> sortFunction = x->{
			return x.stream().sorted().collect(Collectors.toList());
		};
		System.out.println("TLambda Approach:"+biFunction3.andThen(sortFunction).apply(l1, l2));
	}

}
