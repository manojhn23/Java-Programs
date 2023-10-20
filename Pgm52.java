package assignments;
import java.util.*;
public class Pgm52 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		String []s1=s.split(" ");
		System.out.println(s1.length);
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].length()>s1[j].length()) {
					String temp=s1[j];
					s1[j]=s1[i];
					s1[i]=temp;
				}	
			}
		}
		System.out.println(s1[0]+" "+s1[s1.length-1]);
	}
}
