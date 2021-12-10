import java.util.Scanner;
public class NumberDigits {
	// 879
	// 8 7 9
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int r=0;
		while(number != 0){
			r = number % 10;
			System.out.println(r);
			number = number / 10;
		}

	}

}
