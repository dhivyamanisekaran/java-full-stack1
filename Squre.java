import java.util.Scanner;
public class Squre {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		number = 555;
		int sum = 0;
		while(number> 0){
			int r = number % 10;
			sum = sum + (r*r);
			number = number/10;
		}
		System.out.println(sum);
		
	}

}
