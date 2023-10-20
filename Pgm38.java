package assignments;
import java.util.*;


public class Pgm38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int n,gcd=0;
		if(x>y)
			n=x;
		else
			n=y;
		for(int i=1;i<=n;i++) {
			if(x%i==0 && y%i==0)
				gcd=i;	
		}
		System.out.println(gcd);
		
	}

}
