import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 중복된 나머지 값을 제거하기 위해 set 사용
		Set<Integer> number = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			
			//42로 나눈 나머지 추가
			number.add(num % 42);
		}
		
		System.out.println(number.size());
	}
}
