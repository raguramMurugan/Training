//To Overcome a NullPointer Exception, Create an Object for Reference
package runtimeexception;

public class Nullpoint {

	public static void main(String[] args) {
		Double[] dou=null;
		dou=new Double[3]; // Object has been created for Null

		dou[1]=5.5;
		System.out.println(dou[1]);
	}

}
