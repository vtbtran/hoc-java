package hoc_java;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
//		int age = 20;
//		String name = "Bao Tran";
//		System.out.println("my age is: " + age + ", name is: " + name);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name is: ");
		String name = scanner.nextLine();
		System.out.println("Your age is: ");
		int age = scanner.nextInt();
		System.out.println("My name is: " + name + ",age: " + age);
		scanner.close();
	}

}
