import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int result = N / 4;
		for(int i = 0; i < result; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}