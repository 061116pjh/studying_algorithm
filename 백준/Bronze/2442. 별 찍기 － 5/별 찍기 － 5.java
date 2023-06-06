import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		for(int i=0; i<idx; i++) {
			for(int j=idx-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print('*');
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}
}