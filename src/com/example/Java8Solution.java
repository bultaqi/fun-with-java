package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Java8Solution {
	
	// the key thing to note here is the functional interfaces
	// interfaces only having one abstract method allows them to be turned into lamdba expressions
	// Note: the Comparator class with its one implementation of "compareTO" in the Java7Solution and the Condition interface we created with the one "test" method

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
					new Person("Charles", "Chickens", 60),
					new Person("Marie", "Antionette", 46),
					new Person("Jerry", "Clinefeld", 32),
					new Person("Gary", "Vandercheck", 37),
					new Person("Betty", "White", 101)
				);
		
		// Step 1: Sort list by last
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
		// Step 2: Create a method that prints all the elements in the list
		System.out.println("Printing all persons");
		printConditionally(people, p -> true);
		
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("Printing all persons beginning with C");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		}
	
	
		// Predicate is an out of the box functional interface from the Java 8 version
		// Functional Interfaces provide target types for Lambda expressions and method references 
		// The first step in creating a lambda expression is to create an interface for it (unless there is one already to use)
		// Step two is to define a method in that interface with the same signature as the expression 
	
		
		private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
			for (Person p : people) {
				if (predicate.test(p)) {
					System.out.println(p);
				}
			}
		}

		

}
