package lab_01;

import java.util.Scanner;

public class bai02 {
//	
//	Bài 2: Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//	Tính toán và in ra console:
//	- chu vi hình chữ nhật
//	- diện tích hình chữ nhật
//	- cạnh nhỏ nhất của hình chữ nhật
//	Gợi ý:
//	chu vi = (dài + rộng) x 2
//	diện tích = dài x rộng
//	cạnh nhỏ nhất = Math.min(dài, rộng)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chieu dai hinh chu nhat: ");
		int length = scanner.nextInt();
		System.out.println("Chieu rong hinh chu nhat: ");
		int wight = scanner.nextInt();
		int perimeter = (length + wight) * 2;
		int area = length * wight;
		int min = Math.min(wight, length);
		System.out.println("Chu vi hinh chu nhat: " + perimeter);
		System.out.println("Dien tich hinh chu nhat: " + area);
		System.out.println("Canh nho nhat la: " + min);
		scanner.close();
	}

}
