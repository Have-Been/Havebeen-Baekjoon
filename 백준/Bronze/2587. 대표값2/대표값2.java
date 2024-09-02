import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		int avg = 0;
		for(int i = 0; i < 5; i++) {
			avg += arr[i];
		}
		System.out.println(avg/5);
		
		Arrays.sort(arr);
		System.out.println(arr[2]);
	}
}
