import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// InputStreamReader: 바이트 -> 문자 변환
		// BufferedReader: 문자 반환
		// System.in: 바이트로 반환해줌
		// 그러므로 InputStreamReader를 사용해주어야 함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// readLine()을 사용하려면 예외처리를 무조건 해주어야 한다.
		try {
			// br은 String으로 반환되기 때문에 int로 형변환
			int num = Integer.parseInt(br.readLine());
			
			// 문자열을 토큰으로 나누어 문자열을 구분자 기준으로 분리하는 데 사용되는 클래스
			// "10 20" 이면 공백을 제외하고 "10"과 "20"으로 분리하기 위해 사용
			StringTokenizer st;
			
			for(int i = 0; i < num; i++) {
				// 공백 기준으로 문자열을 나눔
				st = new StringTokenizer(br.readLine(), " ");
				// nextToken(): 다음 토큰을 반환
				// 처음 입력값은 개수이기 때문에 다음 문자열(nextToken())부터 더함
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(a+b + "\n");
			}
			br.close();
			
			// 버퍼에 담아놓았던 문자열 출력
			bw.flush();
			// 버퍼 닫기
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}