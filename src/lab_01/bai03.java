package lab_01;

import java.util.Scanner;

public class bai03 {
//	Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//	Tính và xuất ra thể tích của hình lập phương.
//	Gợi ý:
//	thể tích = cạnh x cạnh x cạnh = cạnh^3 = Math.pow(canh, 3)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao canh cua 1 khoi lap phuong: ");
		int side = scanner.nextInt();
		double volume = Math.pow(side, 3);
		System.out.println("The tich hinh lap phuong: " + volume);
		scanner.close();
	}

}
