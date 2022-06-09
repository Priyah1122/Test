package test;

public class Test  extends TestA{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Test");
		System.out.println("Test changes");
		Test t=new Test();
		t.show();
		System.out.println("New change");

	}

}

class TestA 
{
void show()
{
	System.out.println("This is show method");
}

}
