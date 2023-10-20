package assignments;

public class Pgm17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j)
					System.out.print(j+1+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
