package runtimeexception;

public class Arithmet {

	public static void main(String[] args) {
		
	try {
		int a=5;
		int b=0;
		System.out.println(a/b);
	    }
	catch(ArithmeticException ae){
		System.out.println("You have entered Zero, Kindly check the Value");
		}
	
	}
}

