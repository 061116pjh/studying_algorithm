import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().trim();
		String[] word = sentence.split(" ");
		if(word.length == 1 && word[0].equals("")) {
			System.out.println(0);
		}else {
			System.out.println(word.length);			
		}
	}
}
