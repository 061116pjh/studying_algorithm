import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int numA, numB;
		
		int con = 0;
		while(num1 != 0) {
			con = con * 10 + num1 % 10;
			num1 /= 10;
		}
		numA = con;
		con = 0;
		while(num2 != 0) {
			con = con * 10 + num2 % 10;
			num2 /= 10;
		}
		numB = con;
		
		if(numA > numB) {
			System.out.println(numA);
		}else {
			System.out.println(numB);
		}
	}
}
