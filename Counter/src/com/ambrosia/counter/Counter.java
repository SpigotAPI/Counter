package com.ambrosia.counter;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int counter;

		System.out.println("Enter a number that we can count up to.");
		counter = scanner.nextInt();

		for (int i = 0; i < counter; i++) {
			System.out.println((i + 1));
		}

		scanner.close();
	}
}