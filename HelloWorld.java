package hoc_java;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

//		int age = 20;
//		String name = "Bao Tran";
//		System.out.println("my age is: " + age + ", name is: " + name);

//		int a = 10;
//		int b = 6;
//
//		int c = Math.min(10, 6);
//		System.out.println("Min = " + c);

		Scanner scanner = new Scanner(System.in);
//		System.out.println("First number: " + Math.pow(2, 3)); // pow tinh so mu
		System.out.println("First number: " + Math.sqrt(49)); // pow tinh so mu
		int firstNumber = scanner.nextInt();
		System.out.println("Second number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Min = " + Math.min(firstNumber, secondNumber));
		scanner.close();
	}

}
