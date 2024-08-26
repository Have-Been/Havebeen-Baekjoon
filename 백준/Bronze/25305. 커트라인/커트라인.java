
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int studentNum = sc.nextInt();
		// 상 받는 사람의 수
		int prize = sc.nextInt();
		// 학생들의 점수
		int[] score = new int[studentNum];
		// 상 받는 사람의 점수를 저장
		int[] prizeScore = new int[prize];
		
		// 학생들의 점수 저장
		for(int i = 0; i < studentNum; i++) {
			score[i] = sc.nextInt();
		}
		
		Integer[] scoreArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(scoreArr, Collections.reverseOrder());
		
		System.out.println(scoreArr[prize-1]);
		
	}
}