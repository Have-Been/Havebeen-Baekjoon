import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		String input = sc.nextLine();
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			sum += input.charAt(i) - '0';
		}
		
		System.out.println(sum);
		sc.close();
	}
}