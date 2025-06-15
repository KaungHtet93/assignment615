package com.pearl.training.collectiontest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowercaseCheckCondiition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("JaVa", "STreAM", "ApII");

		List<String> upper = words.stream()
		    .map(String::toLowerCase)
		    .collect(Collectors.toList());

		System.out.println(upper); // [JAVA, STREAM, API]
		// Check Match Condtion
		
		boolean hasLongWord = words.stream()
			    .anyMatch(word -> word.startsWith("e"));
		System.out.println("After Checking Match=>");
			System.out.println(hasLongWord); // true

	}

}
