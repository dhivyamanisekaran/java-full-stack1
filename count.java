
public class count {
	public static void main(String[] args){
		int number = 989999;
		int r;
		int sum = 0;
		while (number > 0){
			r = number %10;
			sum = sum+r;
			number = number / 10;
		}
		System.out.println("the value of a"+ sum);
	}

}
