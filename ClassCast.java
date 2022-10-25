package runtimeexception;

class A {
	
}

class B extends A{
	
	int a=5;
}

class C extends A
{
	
}

class ClassCast extends B{

	public static void main(String[] args) {
		
		A a=new A();
		A b=new B();
		A c=new C();
		
		//B bb=(B)c; B and C are two different Class, Cannot be casted as it throws ClassCastException
		B BB=(B)b; // We can type-casting the B object with B reference as it is having Parent reference.
		System.out.println("Successfully Casted:"+" "+BB.a);
	}
	

}
