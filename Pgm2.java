package assignments;
import java.util.*;
public class Pgm2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three no.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("Largest no : "+a);
		else if(b>a && b>c)
			System.out.println("Largest no : "+b);
		else
			System.out.println("Largest no : "+c);
	}

}
