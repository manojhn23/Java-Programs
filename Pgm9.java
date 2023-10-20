package assignments;
import java.util.*;
public class Pgm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		int rem,no=0,n1=n;
		while(n!=0) {
			rem=n%10;
			no=no+rem*rem*rem;
			n=n/10;
		}
		if(n1==no)
			System.out.println("Armstrong no");
		else
			System.out.println("Not armstrong no");
	}

}
