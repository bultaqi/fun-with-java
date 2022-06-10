package com.example2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.example.Person;

public class StandardFunctionalInterfacesExample {
	
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
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("Printing all persons beginning with C");
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));
		
	}
	
	// Functional Interface Consumer<T> represents an operation that accepts a single input argument and returns no result. The functional method being the accept(Object)
		
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

		

}
