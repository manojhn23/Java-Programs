package assignments;
import java.util.*;
public class Pgm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time : ");
		float t=sc.nextFloat();
		if(t>=6.00f && t<12.00f)
			System.out.println("Good Mornng !");
		else if(t>=12.00f && t<18.00f)
			System.out.println("Good Afternoon !");
		else if(t>=18.00f && t<21.00f)
			System.out.println("Good Evening !");
		else
			System.out.println("Good Night !");
	}

}
