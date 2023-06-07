import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[10][10]; // 10행 10열의 2차원 배열 생성
		int x = 0, y = 0, max = 0; // x, y, max 초기화
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				array[i][j] = sc.nextInt(); // 2차원 배열에 차례로 값을 하나씩 대입
				if(max < array[i][j]) { // max의 값보다 입력받은 값이 크다면
					max = array[i][j]; // max에 값을 저장
					x = i; // x 좌표 저장
					y = j; // y 좌표 저장
				}
			}
		}
		System.out.println(max); // 최댓값 출력
		System.out.println((x+1)+ " " + (y+1)); // 행, 열 모두 한줄씩 추가했기 때문에 +1하여 출력
	}

}
