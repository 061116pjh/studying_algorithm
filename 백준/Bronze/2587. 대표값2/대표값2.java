import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Arr = new int[5];
		int sum = 0;
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = sc.nextInt();
			sum += Arr[i];
		}
		System.out.println(sum/5);
		Arrays.sort(Arr);
		System.out.println(Arr[Arr.length/2]);
	}

}
