import java.util.Scanner;

public class HomeWork_0717_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N =0;
		
		while(true) {
			System.out.print("N=");
			N = sc.nextInt();
			
			for(int i = 1; i<=N; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
			
			for(int i = N-1; i>0; i--) {
				for(int j = 0; j < i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
	}

}
