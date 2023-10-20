package assignments;

public class Pgm59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,1,1},{2,2,2},{3,3,3}};
		int [][]b= {{1,1,1},{2,2,2},{3,3,3}};
		int [][]c=new int[a.length][b[0].length];
//		System.out.println(a.length+" "+b[0].length);
		if(a.length!=b[0].length)
			System.out.println("Multiplication not done");
		else {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b[0].length;j++) {
					for(int k=0;k<c.length;k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
