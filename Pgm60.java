package assignments;

public class Pgm60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {6,5,1,2,4,3};
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int a:arr)
			System.out.println(a);
	}

}
