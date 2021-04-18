import java.util.*;
public class LineComparison {
	double LineLength()
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt(); 
		int x2=sc.nextInt();
		int y1=sc.nextInt();
		int y2=sc.nextInt();
	    int x=(x2-x1)*(x2-x1);
	    int y=(y2-y1)*(y2-y1);
		double length= Math.sqrt(x+y);
		return length;
	}
	
	void equal()
	{
		System.out.println("Enter Coordinates of the First Line");
		String p=String.valueOf(LineLength());
		System.out.println("Enter Coordinates of the second Line");
		String q=String.valueOf(LineLength());
		if(p.equals(q))
		{
			System.out.println("Lines are equal");
		
		}
		else
		{
		System.out.println("Line are not equal");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Line Comparison Computation Program ");
		LineComparison lc=new LineComparison();
		Scanner sc=new Scanner(System.in);
		lc.equal();
	}
	

}
