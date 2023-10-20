package assignments;
import java.util.*;
public class Pgm41 {
	static int natural(int n,int sum) {
		sum+=n;
		if(n!=1)
			return natural(n-1,sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int n1=natural(n,sum);
		System.out.println(n1);
	}
}
