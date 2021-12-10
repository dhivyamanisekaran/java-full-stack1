//package Looping;
import java.util.Scanner;

public class alphabet {
	public static void main(String[]args){
		Scanner s1 = new Scanner(System.in);
		char ch = 'a',ch1 = 'A';
		//System.out.println("Enter first value");
		//a=s1.next().charAt(0);
		do
		{
			System.out.println(ch +" "+ch1);
			ch++;
			ch1++;
		}while(ch <='z');
		
	
	/*for(ch = 'a',ch1= 'A' ;ch<='Z'; ++ch,++ch1)
	 {
	 
		System.out.println(ch+ " "+ch1);
		

}*/
}
}

