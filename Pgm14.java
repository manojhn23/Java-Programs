package assignments;
import java.util.*;
public class Pgm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no : ");
		int n=sc.nextInt();
		int a=1;
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			a=a*2+1;
		}
	}

}
