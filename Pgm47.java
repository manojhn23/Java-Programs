package assignments;
import java.util.*;
public class Pgm47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		int v=0,c=0;
		for(int i=0;i<s.length();i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e'|| s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
				v++;
			else
				c++;
		}
		System.out.println("Vowels : "+v+" \nConsonants : "+c);
	}
}
