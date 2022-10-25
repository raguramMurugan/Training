package runtimeexception;

public class NegativeArray {

	public static void main(String[] args) {
		try {
		int [] num=new int[-2];
		
		num[-1]=0;
		System.out.println(num[-1]);
		}
		catch(NegativeArraySizeException na)
		{
			System.out.println("Array Value should not be in Negative. Kindly give Postive input");
		}
	}

}
