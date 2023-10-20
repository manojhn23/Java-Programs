package assignments;
import java.util.*;
public class Pgm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
