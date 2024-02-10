
abstract class AbsClass

{
	public static void function()
	{
		
		System.out.println("This is static method of abstract class");
	}
}

public class AbstractStatic extends AbsClass {
	
	public static void main(String[] args) {
		
		AbsClass ab= new AbstractStatic();			
		AbsClass.function();
		ab.function();		
		
	
		
	}
}
