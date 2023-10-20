package assignments;
import java.util.*;
public class Pgm43 {
	static boolean prime(int n) {
		if(n==2) {
			return true;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n=sc.nextInt();
		int count=1;
		for(int i=2;i<n;i++) {
			if(prime(i)) {
				count++;
			}
			if(count==2) {
				count=0;
				System.out.print(i+" ");
			}
				
		}

	}

}
