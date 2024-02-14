package com.bridgelabz11;
import java.util.*;

public class PrintArray<T> {
	private T[] inputArray;
	
	public PrintArray(T[] inputArray) {
		this.inputArray=inputArray;
	}
	
	public void toPrint() {
		PrintArray.toPrint(this.inputArray);
		
	}
	public static <E> void toPrint(E[] inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4};
		Character[] charArray= {'H','E','L','L','O'};
		
		new PrintArray(intArray).toPrint();
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);

	}

}
