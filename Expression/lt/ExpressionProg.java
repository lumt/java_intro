// Always package first before import
package lt;
// package lt.something needs seperate lines;

import java.util.Arrays;
// if you want to import everything:
// import java.util.*;
// but this is very risky (not recommended)

public class ExpressionProg {

	public static void main(String[] args) {

		// you can have final methods so subclasses cannot override it

		// declare an object by keyword 'new'
		// it is the only way to do so in java
		// creates it on the Heap
		// Objct variables are always pointers so have no * form
		// new returns a pointer just like C++

		// programmers does not have to deallocate memory
		// Java uses garbage collection of objects
		// its job (in s sepearate thread)
		// checks for memory which is no longer accesible by your program
		// detected by the garbage collector and automatically deallocates it

		Expression first = new WholeNumber(5);

		System.out.print("The first number is ");
		System.out.println(first);

		// Will print:
		// The first number is lt.WholeNumber@7852e922

		Expression second = new WholeNumber(5);

		// if they are the same object (not value)
		String equal = first == second ? "equal" : "not equal";

		System.out.printf("The first number is %s to the second\n", equal);

		equal = first.equals(second) ? "equal" : "not equal";

		System.out.printf("The first number is %s to the second\n", equal);

		// Constants are declared with keyword final
		final int NUM_COUNT = 8;
		WholeNumber[] myWholes = new WholeNumber[NUM_COUNT];
		for (int i = 0; i < NUM_COUNT; i++) {
			// loop through array and construct each object
			myWholes[i] = new WholeNumber(i*i);
		}
		System.out.printf(
			"My new array is %s\n",
			Arrays.toString(myWholes));

	}
}