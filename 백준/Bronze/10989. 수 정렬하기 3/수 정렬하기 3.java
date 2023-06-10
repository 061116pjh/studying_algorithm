import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int idx = Integer.parseInt(reader.readLine());
		int[] Arr = new int[idx];
		for(int i = 0; i<Arr.length; i++) {
			Arr[i] = Integer.parseInt(reader.readLine());
		}
		Arrays.sort(Arr);
		for(int item : Arr) {
			sb.append(item).append("\n");
		}
		System.out.println(sb);
	}

}
