package Inheritance;

public class B extends A{
	
	int x=20;
	public void m1()
	{
		System.out.println("B Class");
	}
	
	public static void main(String[] str)
	{
		A a= new B();
		a.m1();
		System.out.print(a.x);
		
	}

}

/*
: If a parent reference variable is holding the reference of the child class and we have the �value� 
variable in both the parent and child class, it will refer to the parent class �value� variable, whether it is holding child class object reference.

*/

