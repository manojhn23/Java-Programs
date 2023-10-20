package assignments;
import java.util.*;
public class Pgm48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		String low="",up="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
				low+=(char)(s.charAt(i)+32);
			else
				low+=s.charAt(i);
			if(s.charAt(i)>=97 && s.charAt(i)<=122)
				up+=(char)(s.charAt(i)-32);
			else
				up+=s.charAt(i);
		}
		System.out.println(low+"\n"+up);
	}
}
