package assignments;

public class Pgm57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {16,17,4,3,5,2};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
					count++;
			}
			if(count==a.length-i-1) {
				System.out.println(a[i]);
			}
		}
	}
	
}
