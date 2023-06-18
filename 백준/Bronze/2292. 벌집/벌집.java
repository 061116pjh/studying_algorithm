import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;	// N번까지의 최단 루트
		int range = 2;	// 한 둘레에 6의 배수만큼 방이 있는 규칙
		
		if(N == 1) {
			System.out.println("1");	// 1번 방을 찾으면 1을 출력
		}else {
			while(range <= N) {	// 방의 개수가 N을 초과하면 종료
				range = range + (count * 6); // 방의 개수는 이전 방의 개수 + 6의 배수이다
				count++; // 한 둘레안에 없으면 다음 둘레로 넘겨준다.
			}
			System.out.println(count); // 최단 루트 출력
		}
	}

}