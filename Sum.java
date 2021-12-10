
public class Sum {
	public static void main(String[] args){
		int count = 0,num = 555555090;
		while(num != 0){
			num = num/10;
			++count;
		}
		System.out.println("the number of digits"+ count);
	}

}
