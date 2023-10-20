package assignments;

public class Pgm32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		int[] rev=new int[a.length];
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			rev[j--]=a[i];
		}
		for(int n:rev) {
			System.out.print(n+" ");
		}

	}

}
