package assignments;
import java.util.*;
public class Pgm45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		int i;
		for(i=0;;i++) {
			try {
				s.charAt(i);
			}
			catch(Exception e) {
				break;
			}
		}
		System.out.println(i);
	}
}

