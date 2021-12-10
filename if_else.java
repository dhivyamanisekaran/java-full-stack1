import java.util.Scanner;
//package ConditionalStatement;
public class if_else {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc. nextInt();
		if(number %2 == 0)
			System.out.println(number + "is even");
		if(number %2 != 0)
			System.out.println(number + "is odd");
	}

}
