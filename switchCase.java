import java.util.Scanner;
public class switchCase {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		switch(number){
		default:
			System.out.println(number +"invalid input , please go with 10 50");

		case 10:
			System.out.println(number +"is range 10-50");
			break;
		case 50:
			System.out.println(number +"is range 50-100");
			break;
		case 100:
			System.out.println(number +"is  highest");
			break;
		}
				System.out.println("out of switch block");



			
		}
	}

