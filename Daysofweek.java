
import java.util.Scanner;
public class Daysofweek {
public static void main(String[]args){
	//TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of a");
	int number = sc.nextInt();
	
	switch(number){
	case 1:
		System.out.println(number+ "the day is sunday");
	break;
	case 2:
		System.out.println(number+ "the day is monday");
		break;
	case 3:
		System.out.println(number+ "the day is tuesday");
		break;
	case 4:
		System.out.println(number+ "the day is wednesday");
		break;
	case 5:
		System.out.println(number+ "the day is thursday");
		break;
	case 6:
		System.out.println(number+ "the day is friday");
		break;
	case 7:
		System.out.println(number+ "the day is saturday");
		break;
		default:
			System.out.println("invalid input");
			break;
		
			
			}
	}
}
