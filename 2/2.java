import java.util.*;


public class Main {
	public int solution(int n, int[] arr) {
			int answer = 1, chk = arr[0];
			for(int i=1; i<n; i++) {
				if (arr[i] > chk) {
					answer += 1;
					chk = arr[i];
				}
			}
			
			return answer;
		}
		
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n]; // 동적 배열 생성
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(T.solution(n,  arr));
	}

}
​
