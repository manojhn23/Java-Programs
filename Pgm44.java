package assignments;
import java.util.*;
public class Pgm44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no : ");
		int n=sc.nextInt();
		double t;
		double sqrt=n/2;
		if(n==1)
			sqrt=1;
		else{
			do {
				t=sqrt;
				sqrt=(t+(n/t))/2;
			}while(t-sqrt!=0);
		}
		System.out.println(sqrt);
	}
}
