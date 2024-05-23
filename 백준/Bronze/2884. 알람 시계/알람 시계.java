import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();

		if(M > 45) {
			M -= 45;
			System.out.println(H + " " + M);
		}
		else if(H > 0 && M < 45) {
			M = 60 + (M - 45);
			System.out.println(--H + " " + M);
		}
		else if(H == 0 && M < 45) {
			M = 60 + (M - 45);
			H = 23;
			System.out.println(23 + " " + M);
		}
		else if(H == 0 && M == 45) {
			System.out.println("0 0");
		}
		else if(M == 45) {
			M -= 45;
			System.out.println(H + " " + M);
		}
		
	}
}