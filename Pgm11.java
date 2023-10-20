package assignments;
import java.util.*;
public class Pgm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int n=sc.nextInt();
		int n1=n,rem,rev=0;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(n1==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}

}
