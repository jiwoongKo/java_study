import java.util.*;


public class Main {
	public void solution(int n) {
			int a= 1, b=1, c;
			System.out.print(a + " " + b + " ");
			
			for(int i=2; i<n; i++) {
				c = a + b;
				System.out.print(c + " ");
				// (a, b) -> (b, c) 
				// a의 값, b의 값 이동
				a = b;
				b = c;
			}
		}
		
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		T.solution(n);
		
	}

}
