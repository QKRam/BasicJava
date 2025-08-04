	
	public class MethodCall
	{

	int a=8;
	int b=3;	//Global Variable
	int c=12;

	public static void main(String[] args)
	{
	
	MethodCall m=new MethodCall();
	m.displayGraterNumber();

	} 

	public void displayGraterNumber()
	{
if(a>b && a>c)
{

	System.out.println(a+" is greater number");
}
	if(b>a && b>c)
	{
	System.out.println(b+" is greater number");	//Concat=+a...,+ oprator

	}
	if(c>a && c>b)
	{
	System.out.println(c+" is greater number");

	}

	}

}






