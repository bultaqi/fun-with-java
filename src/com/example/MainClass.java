package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
					new Person("Charles", "Chickens", 60),
					new Person("Marie", "Antionette", 46),
					new Person("Jerry", "Clinefeld", 32),
					new Person("Gary", "Vandercheck", 37),
					new Person("Betty", "White", 101)
				);
		
		// Step 1: Sort list by last
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		
		// Step 2: Create a method that prints all the elements in the list
		printAll(people);
		
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		printLastNameBeginningWithC(people);
		
		
		}
	
		private static void printLastNameBeginningWithC(List<Person> people) {
			for (Person p : people) {
				if (p.getLastName().startsWith("C")) {
					System.out.println(p);
				}
			}
		}

		private static void printAll(List<Person> people) {
			for (Person p : people) {
				System.out.println(p);
			}
			
		}

}
