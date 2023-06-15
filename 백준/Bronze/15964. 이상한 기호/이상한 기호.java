import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int temp1 = A+B;
		int temp2 = A-B;
		
		System.out.println(temp1*temp2);
	}

}