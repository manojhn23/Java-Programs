package assignments;
import java.util.*;
public class Pgm46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ' && (s.charAt(i)<65 && s.charAt(i)>90) || (s.charAt(i)<48 && s.charAt(i)>57) || (s.charAt(i)<97 && s.charAt(i)>122))
				count++;
		}
		System.out.println(count);
	}
}
