import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 

		int min = 60 * A + B;
		min += C;

		int hour = (min / 60) % 24;
		int min2 = min % 60;
		
		System.out.println(hour + " " + min2);
		
	}
}
