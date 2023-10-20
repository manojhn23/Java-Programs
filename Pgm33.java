package assignments;

public class Pgm33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,4,3,6,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Minimum : "+a[0]+"\nMaximun : "+a[a.length-1]);

	}

}
