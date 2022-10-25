package runtimeexception;

public class IndexOut {

	public static void main(String[] args) {
		
		Integer[] integer= {1,2,3,4};
		try { 
		for(int i=0; i<5;i++) // Array length is 4, but it is asking to print 5.
		{
			System.out.println(integer[i]);
		}
		}
		catch(IndexOutOfBoundsException io)
		{
			System.out.println("Kindly Check the Array Length, Length exceeding the limit");
		}
	}

}
