package assignments;

public class Pgm19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print(a+" ");
					a++;
				}
					
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
