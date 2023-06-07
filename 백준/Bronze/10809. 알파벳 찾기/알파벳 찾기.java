import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] result = new int[26]; // 알파벳 갯수 만큼의 길이를 가진 배열 생성
		
		for(int i=0; i<result.length; i++) {
			result[i] = -1; // 배열의 모든 인덱스에 값을 -1로 할당
		}
		
		String word = sc.next(); // 입력 받은 값 word 변수에 저장
		
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i); // word변수의 index번째의 값을 char타입으로 가져온다.
			
			if(result[c - 97] == -1) result[c - 97] = i; // 만약 char - 97(a)가 -1이면 index를 할당
		}
		
		for(int value : result) System.out.print(value + " "); // result 배열의 값을 value로 가져와 공백과 함께 출력
	}
}