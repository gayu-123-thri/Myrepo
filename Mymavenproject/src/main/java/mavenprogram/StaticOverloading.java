package mavenprogram;

public class StaticOverloading 

{
	static float f;
	static float g;
	static float h;
	public static void cal()
	{
		int m=5;
		int n=8;
		int d=m-n;
		System.out.println("dif is :" +d);
	}
	public static void cal(int a, float b)
	{
		float c=a+b;
		System.out.println("Sum is :" +c);
	}
	//public static float cal2()
	//{
    //h=f*g;
	//return(h); 
	//}
	public static void main(String[] args) 
	{
		StaticOverloading.cal();
		StaticOverloading.cal(7,9f);
	//	System.out.println("mul is :" +StaticOverloading.cal2());
	}

}
