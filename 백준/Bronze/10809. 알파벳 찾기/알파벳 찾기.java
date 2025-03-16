import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 알파벳 a~z 위치를 저장할 배열
		int[] position = new int[26];
		for(int i = 0; i < 26; i++) {
			// 모든 위치를 -1로 초기화
			position[i] = -1;
		}
		
		for(int i = 0; i < str.length(); i++) {
			// a는 아스키 코드값으로 97, a~z의 배열 인덱스 구하기
			int index = str.charAt(i) - 'a';
			
			// 처음 등장하는 경우에만 저장
			if(position[index] == -1) {
				position[index] = i;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(position[i] + " ");
		}
		
		sc.close();
	}
}