package assignments;

public class Pgm58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,3,2,1};
		int left=0,right=0;
		for(int i=0,j=a.length-1;i<j;i++,j--) {
			left+=a[i];
			right+=a[j];
		}
		if(left==right)
			System.out.println("In equilibrium sum : "+left);
		else
			System.out.println("Left sum : "+left+"\nRight sum"+right);

	}
}
