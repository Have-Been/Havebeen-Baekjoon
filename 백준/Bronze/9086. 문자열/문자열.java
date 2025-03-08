import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {
			String str = sc.nextLine();
			System.out.println(str.charAt(0) +""+ str.charAt(str.length()-1));
		}
		
		sc.close();
	}
}