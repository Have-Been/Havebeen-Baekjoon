import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int reverseA = 0;
		int reverseB = 0;
		
		while(a != 0) {
			// 마지막 숫자 가져오기
			int num = a % 10;
			// 숫자 뒤집기
			reverseA = reverseA * 10 + num;
			// 마지막 자리 제거
			a /= 10;
		}
		
		while(b != 0) {
			int num = b % 10;
			reverseB = reverseB * 10 + num;
			b /= 10;
		}
		
		if(reverseA > reverseB) {
			System.out.println(reverseA);
		}
		else if(reverseA < reverseB) {
			System.out.println(reverseB);
		}
		
		sc.close();
		 
		
	}
}