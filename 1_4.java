import java.util.*;

// 풀이 1 : StringBuilder 이용
// 풀이 2 : ArrayList 활용해서 뒤집기

public class Main {
	public ArrayList<String> solution(int n, String[] str) {
			ArrayList<String> answer = new ArrayList<> () ; // ArrayList에 뒤집은 값 리턴
			
			for(String x : str) { // String 배열이므로 for each에서 바로 str로 받을 수 있음
				String tmp = new StringBuilder(x).reverse().toString(); // StringBuilder 생성자, 단어 x로 객체 생성
				// 이후 reverse로 뒤집고 그 객체를 toString()으로 String 화
				// 왜 StringBuilder를 생성할까?
				// 일반적으로 String 연산이 많아지면 객체 연산이 많아지는데, StringBuilder는 메모리 관리부분에서 유리함
				
				answer.add(tmp);
			}
			
			return answer;
		}
		
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) { // for loop 돌면서 string 배열에 하나씩 넣기
			str[i] = sc.next();
		}
		
		for(String x : T.solution(n,  str)) { // string 배열 리턴 ArrayList에서 받아온 return 값
			System.out.println(x);
		}
	}

}
