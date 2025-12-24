package lab_01;

import java.util.Scanner;

public class bai01 {

//	Bài 1:
//		Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//		In ra màn hình với định dạng:
//		<tên_sinh_viên> có điểm = <điểm>
//		Ví dụ: "Eric" có điểm = 9.6
//		<tên sinh viên>: Eric
//		<điểm> : 10
//
//		Gợi ý:
//		- Chạy spring tool suite để tạo dự án java
//		- tạo class Lab1Bai1
//		- tạo hàm main
//		- Đọc kết quả từ bàn phím:
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine();
//		- In kết quả với println:
//		System.out.println("Your name is: " + name);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Student name is: ");
		String studentName = scanner.nextLine();
		System.out.println("Point: ");
		int point = scanner.nextInt();
		System.out.println("Your name student is: " + studentName + ", point = " + point);
		scanner.close();
	}

}
