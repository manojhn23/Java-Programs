package assignments;
import java.util.*;
public class Pgm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int sq=0;
		for(int i=1;i<=n;i++) {
			sq+=i*i;
		}
		System.out.println("Squa"
				+ "res : "+sq);
	}

}
