import java.util.*;
public class reversethedigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int reverse = 0;
		int originalnumber = number;
		while(number != 0){
			int r = number%10;
			reverse = reverse * 10 +r;
			number = number/10;
			
		}
		System.out.println("reverse number" +reverse);
		if(originalnumber == reverse)
			System.out.println(originalnumber + "the number is palindrome");
		else
			System.out.println(originalnumber +" the number is not palindrome");


			
		
	}

}
