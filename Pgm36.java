package assignments;
import java.util.*;
public class Pgm36 {
	static int prime(int m) {
		if(m==2)
			return m;
		else {
			for(int i=2;i<m;i++) {
				if(m%i==0) {
					return -1;
				}
			}
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=2,p=0;
		int count=-1;
		while(n!=count) {
			if(p==-1) {
				p=prime(j++);		
			}	 
			else{
				p=prime(j++);
				count++;
			}	
		}
		System.out.println(j-2);
	}
}
