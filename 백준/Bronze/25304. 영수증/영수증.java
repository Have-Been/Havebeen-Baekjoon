import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			int money = sc.nextInt();
			int count = sc.nextInt();
			result += money * count;
		}
		
		if(result == X) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}