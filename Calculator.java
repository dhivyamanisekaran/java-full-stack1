class result {
	String name;
	int maths=0;
	int java=0;
	int php=0;
	static int sports=70;
	result(){//default constructor
		sports = 70;
	}
	result(String name,int maths){
		this.name = name;
		this.maths = maths;
	}
	result(String name,int maths,int java,int php){
		this.name = name;
		this.maths = maths;
		this.java = java;
		this.php = php;
	}
	void display() {
		System.out.println("name" + name);
		System.out.println("maths" + maths);
		System.out.println("java" + java);
		System.out.println("php" + php);
		System.out.println("sports" + sports);

		
	}
}
public class Calculator {
public static void main(String[] args){
	result s1 = new result();
	System.out.println(s1.maths);
	System.out.println(s1.sports);
	System.out.println(s1.php);
	result s2 = new result("Dhivi",99,89,80);
	result s3 = new result("Akash",98);
	System.out.println();
	s1.display();
	s2.display();
	s3.display();



}
}
