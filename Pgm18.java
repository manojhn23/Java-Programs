package assignments;

public class Pgm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>0;i--) {
			for(int j=0;j<n;j++) {
				if(j<i)
					System.out.print(j+1+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
