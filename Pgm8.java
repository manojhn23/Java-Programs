package assignments;
import java.util.*;
public class Pgm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		int b=0,rem,rev=1;
		while(n!=0) {
			rem=n%2;
			n=n/2;
			b=b+rem*rev;
			rev=rev*10;
		}
		System.out.println(b);
	}

}

