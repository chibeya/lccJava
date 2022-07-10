
public class HomeWork_0710 {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		int num;
		
		System.out.print("請輸入數字:");
		num = scan.nextInt();
		if(num!=0) {
			if( (num % 2)==0 ) {
				System.out.println(num +"是偶數");
			}else {
				System.out.println(num +"是奇數");
			}
		}else {
			System.out.println("請勿輸入0");

		}

	}

}
