import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[28];
		int[] arr = new int[30];
		
		for(int i = 0; i < 28; i++) {
			number[i] = sc.nextInt();
		}
		for(int i = 0; i < 30; i++) {
			arr[i] = i+1;
		}
		
		Arrays.sort(number);
		
		int index = 0;
		for(int i = 0; i < 30; i++) {
			if(index < 28 && number[index] == arr[i]) {
				index++; // 존재하면 넘어가기
			}
			else {
				System.out.println(arr[i]); // 존재하지 않는 번호 출력하기
			}
		}
		
	}
}
