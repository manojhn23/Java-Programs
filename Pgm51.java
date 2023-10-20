package assignments;
import java.util.*;
public class Pgm51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		System.out.println("Enter the parts : ");
		int n=sc.nextInt();
		if(s.length()%n!=0)
			System.out.println("Invalid input or not divided into equal parts");
		else {
			int part=s.length()/n;
			for(int i=0;i<s.length();i++) {
				if(i%part==0)
					System.out.println();
				System.out.print(s.charAt(i));	
			}
		}

	}

}
