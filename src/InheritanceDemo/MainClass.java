package InheritanceDemo;

class A
{
	//Block
    {
        System.out.println(1);
    }
}
 
class B extends A
{
	//Block
    {
        System.out.println(2);
    }
}
 
class C extends B
{
	// Non Parameterized Construtor
	C(){ 
		
		System.out.println("This is default Constructor");
	}
	
	//Block
    {
        System.out.println(3);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
        //B b = new B();
    }
}

