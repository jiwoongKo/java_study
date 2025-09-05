import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		
		// for-each를 사용해서 String str 문제 해결
		for(char x : str.toCharArray()) {
			// Character라는 클래스에 isLowerCase라는 
			// 매개변수가 소문자인지 확인하는 메소드가 존재
			if(Character.isLowerCase(x)) {
				// 소문자일 경우 answer에 x 매개변수 대문자로 바꿔서 더하기
				answer += Character.toUpperCase(x);
			} else {
				// 대문자일 경우 answer에 x 매개변수 소문자로 바꿔서 더하기
				answer += Character.toLowerCase(x);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
		

	}

}
​
