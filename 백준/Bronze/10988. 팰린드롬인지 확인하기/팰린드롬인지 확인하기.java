import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 앞뒤 공백 제거
		String str = sc.nextLine().trim();
		
		int left = 0;
		int right = str.length()-1;
		boolean isPalindrome = true;
		
		while (left < right) {
			// 만일 일치하지 않을 경우
			if(str.charAt(left) != str.charAt(right)) {
				// 펠린드롬이 아님
				isPalindrome = false;
				break;
			}
			
			left++;
			right--;
		}
		
		if(isPalindrome) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		sc.close();
	}
}