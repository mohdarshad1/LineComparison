import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to line comparison problem\n");
	    LineCompare();	
		}
		
	
	public static double lengthCalculator() {
		Scanner sc=new Scanner(System.in);
		int x1,y1;
		int x2,y2;
		Double Length;
		
		System.out.println("Enter the first coordinate (x1,y1) of line");
		x1=sc.nextInt();
		y1=sc.nextInt();
		
		System.out.println("Enter the second coordinate (x2,y2) of line1");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		Length=Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) );
		
		return Length;
	}
	
	public static void LineCompare() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter deatails of line 1");
		Double Length1= lengthCalculator();
		
		System.out.println("Please enter deatails of line 2");
		Double Length2= lengthCalculator();
		
		if(Length1.compareTo(Length2)==0) {
			
			System.out.println("Lines are equal");
			}
			
			else {
				
				if(Length1.compareTo(Length2)>0)
					System.out.println("line 1 is bigger than line 2");
				
				else System.out.println("line 2 is bigger then line 1");
		}

	}
}
