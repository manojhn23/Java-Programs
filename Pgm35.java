package assignments;
import java.util.*;

public class Pgm35 {
	static int factorial(int n,int fact) {
		if(n==0) 
			return 1;
		fact=fact*n;
		if(n!=1) 
			return factorial(n-1,fact);
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no : ");
		int n=sc.nextInt();
		int fact=1;
		int res=factorial(n,fact);
		System.out.println(res);

	}

}
