package assignments;
import java.util.*;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println(a-b);
		else
			System.out.println(b-a);
	}

}
