package assignments;
import java.util.*;

public class Pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		System.out.print("Enter the no.");
		int n=sc.nextInt();
		if(n==2)
			flag=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) 
			System.out.println("Prime no");
		else
			System.out.println("Not a prime no");

	}

}
