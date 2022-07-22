import java.util.Scanner;

public class HomeWork_0717_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Range, Num;
		
		while (true) {
			System.out.println("========開始========");
			System.out.println("請輸入一個想查詢因數的整數:");
			Num = sc.nextInt();
			if (Num != 0) {
				System.out.println("請輸入想查詢的最大範圍:");
				Range = sc.nextInt();
				if (Num <= Range) {
					System.out.println("1～" + Range + "中" + Num + "的因數:");
					System.out.print("1");
					for (int i = 2; i <= Range; i++) {
						if ((Num % i) == 0) {
							System.out.print(",");
							System.out.print(i);
						}
					}
					System.out.println("");
					System.out.println("========結束========");
				} else {
					System.out.println("範圍不可小於" + Num);
					System.out.println("========結束========");
				}
			} else {
				System.out.println("請勿輸入0！");
				System.out.println("========結束========");
			}
		}
	}

}
