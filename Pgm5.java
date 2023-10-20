package assignments;
import java.util.*;

public class Pgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. : ");
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		if(n==1)
			System.out.println(n1);
		else {
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<n-2;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		}
	}

}
