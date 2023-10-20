package assignments;
import java.util.*;
public class Pgm6 {
	static boolean prime(int n) {
		if(n==2)
			return true;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the range : ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(prime(i)){
				System.out.println(i);
			}
		}
		
	}

}
