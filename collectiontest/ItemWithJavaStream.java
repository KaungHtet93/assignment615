package com.pearl.training.collectiontest;

import java.util.*;
import java.util.stream.Collectors;

public class ItemWithJavaStream {

	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
			    new Item("Apple", 1, 2.5),
			    new Item("Banana", 5, 5.0),
			    new Item("Orange", 8, 1.8)
			);
//		double totalRevenue = items.stream()
//			    .mapToDouble(i -> i.quantity * i.price)
//			    .sum();
//		System.out.println("Total Revenue: $" + totalRevenue);
		System.out.println("Total Quantity:"+items.stream().mapToInt(i->i.quantity).sum());
//		// Filter Expensive Items (price > 2.0)
//		List<Item> expensive = items.stream()
//			    .filter(i -> i.price > 2.0)
//			    .collect(Collectors.toList());
//		expensive.forEach(i -> System.out.println(i.name));
//
		// Group by Item Name and Count Total Quantity
		Map<String, Integer> totalQuantities = items.stream()
			    .collect(Collectors.toMap(
			        i -> i.name,
			        i -> i.quantity,
			        Integer::sum // In case of duplicate names
			    ));
		System.out.println(totalQuantities);
		
		// Highest Priced Item
		Optional<Item> maxPriceItem = items.stream()
			    .max(Comparator.comparingDouble(i -> i.price));
		maxPriceItem.ifPresent(i -> System.out.println(i.name + " is the most expensive."));
		
	}
}
