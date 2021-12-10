import java.util.Scanner;
public class Daysofmonth {
	public static void main(String[] args){
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter month number:");
		n = scanner.nextInt();
		switch(n){
		case 1:
			System.out.println("january has 31 days");
			break;
		case 2:
			System.out.println("february has 28 days");
			break;
		case 3:
			System.out.println("march has 30 days");
			break;
		case 4:
			System.out.println("april has 31 days");
			break;
		case 5:
			System.out.println("may has 30 days");
			break;
		case 6:
			System.out.println("june has 31 days");
			break;
		case 7:
			System.out.println("july has 30 days");
			break;
		case 8:
			System.out.println("august has 31 days");
			break;
		case 9:
			System.out.println("september has 30 days");
			break;
		case 10:
			System.out.println("october has 31 days");
			break;
		case 11:
			System.out.println("november has 30 days");
			break;
		case 12:
			System.out.println("december has 31 days");
			break;
			default:
				System.out.println("enter a number 1-12");
				break;
		}
	}
}
	
				












	


