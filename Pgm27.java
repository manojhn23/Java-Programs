package assignments;

public class Pgm27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
