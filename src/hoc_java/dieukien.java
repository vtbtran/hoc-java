package hoc_java;

import java.util.Scanner;

public class dieukien {

	public static void main(String[] args) {
//		int score = 9;
//		if (score > 5) {
//			System.out.println("Du diem qua mon");
//		} else {
//			System.out.println("Tach roi");
//		}
//		System.out.println("run here " + (score > 5));

//		
//		Bài tập: Viết chương trình tính thuế
//		Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
//		- dưới 10M: không đóng thuế
//		- từ 10M tới 15M: thuế 10%
//		- từ 15 tới 30M : thuế 20%
//		- trên 30M: thuế 50%
//		Ví dụ: nhập vào 25M -> in ra kết quả "thuế 20%"
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thue: ");
		int tax = scanner.nextInt();

		if (tax < 10) {
			System.out.println("khong dong thue");
		} else if (10 <= tax && tax <= 15) {
			System.out.println("thue 10%");
		} else if (15 < tax && tax <= 30) {
			System.out.println("thue 20%");
		} else {
			System.out.println("thue 50%");
		}
	}
}
