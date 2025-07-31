import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toUpperCase(); // 대문자로 통일
        int[] alphabet = new int[26]; // 알파벳 빈도수 배열

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            alphabet[ch - 'A']++; // 'A'는 0번 인덱스
        }

        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 'A');
            } else if (alphabet[i] == max) {
                result = '?'; // 최대값이 여러 개면 ?
            }
        }

        System.out.println(result);
    }
}