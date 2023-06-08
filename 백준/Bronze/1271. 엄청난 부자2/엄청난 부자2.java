import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger has = sc.nextBigInteger();
		BigInteger mon = sc.nextBigInteger();
		
		System.out.println(has.divide(mon));
		System.out.println(has.remainder(mon));
	}

}
