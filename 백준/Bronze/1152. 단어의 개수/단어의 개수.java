import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 앞 뒤 불필요한 공백 제거
		String str = sc.nextLine().trim();
		
		if(str.isEmpty()) {
			System.out.println(0);
		}
		else {			
			String[] words = str.split("\\s+");
			System.out.println(words.length);
		}
	}
}