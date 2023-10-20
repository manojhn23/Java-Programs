package assignments;
import java.util.*;
public class Pgm37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0 && n/i==i){
				flag=1;
				
			}
		}
		if(flag==1)
			System.out.println("Perfect");
		else
			System.out.println("Not");
	}

}
