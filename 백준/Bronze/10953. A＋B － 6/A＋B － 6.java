import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		for(int i=0; i<idx; i++) {
			String[] num = sc.next().split(",");
			System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));
		}
	}

}
