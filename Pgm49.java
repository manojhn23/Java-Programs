package assignments;
import java.util.*;
public class Pgm49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int[] a=new int[26]; 
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=97 && s.charAt(i)<=122)
				a[s.charAt(i)-97]+=1;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
				System.out.println((char)(i+97)+" "+a[i]);
		}
	}

}
