import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];

		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		int min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min){
				min = a[i];
			}
		}
		System.out.print(min + " " + max);
	}
}