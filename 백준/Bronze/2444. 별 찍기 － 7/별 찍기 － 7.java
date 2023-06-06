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
		for(int i=0; i<idx-1; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int k=idx-1; k>i; k--) {
				System.out.print("*");
			}
			for(int j=idx-2; j>i; j--) {
				System.out.print("*");				
			}
			System.out.println();			
		}
		
	}
}
