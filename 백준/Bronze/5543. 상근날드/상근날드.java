import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] H = new int[3];
		int[] D = new int[2];
		
		for(int i=0; i<H.length; i++) {
			H[i] = sc.nextInt();
		}
		for(int i=0; i<D.length; i++) {
			D[i] = sc.nextInt();
		}
		
		
		int Hmin = H[0];
		int Dmin = D[0];
		for(int i=1; i<H.length; i++) {
			if(Hmin > H[i]) Hmin = H[i];
		}
		if(Dmin > D[1]) Dmin = D[1];
		
		System.out.println(Hmin+Dmin-50);
	}

}
