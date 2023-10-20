package assignments;
import java.util.*;
public class Pgm42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bal=10000,wd,d;
		System.out.println("------ATM machine-----");
		System.out.println("Press 0 to continue ");
		int e=sc.nextInt();
		do {
		System.out.println("Choose the choice below given : ");
		System.out.println("1: Check Balance ");
		System.out.println("2: Withdraw ");
		System.out.println("3: Deposit");
		System.out.println("4: Exit ");
		System.out.println("Enter the choice : ");
		int n=sc.nextInt();
		switch(n) {
		case 1: System.out.println("Balance : "+bal);
				break;
		case 2: System.out.print("Enter the money :");
				wd=sc.nextInt();
				if(bal>=wd) {
					bal=bal-wd;
					System.out.println("Collect your money !!");
				}
				else
					System.out.println("Insufficient Balance");
				break;
		case 3: System.out.print("Enter the money : ");
				d=sc.nextInt();
				bal=bal+d;
				System.out.println("Amount addd Successully !!!");
				break;
		case 4: System.exit(0);
				break;
		default:System.out.println("Invalid input");
		}
		System.out.println();
		}while(e!=4);
	}
}
