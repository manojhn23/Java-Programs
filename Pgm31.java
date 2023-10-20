package assignments;

public class Pgm31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		int firsthalf=1;
		int secondhalf=(num*num)+1;
		int noSpace=0;
		for(int noLine=num; noLine>=1; noLine--) {
			for(int noSpaceC=noSpace; noSpaceC>=1; noSpaceC--) {
				System.out.print(" ");
			}
			for(int firstHC=1; firstHC<=noLine; firstHC++) {
				if(firstHC==noLine)
					System.out.print(firsthalf++);
				else
					System.out.print((firsthalf++)+"*");
			}
			for(int secondHC=1; secondHC<=noLine; secondHC++) {
				System.out.print("*"+(secondhalf++));
			}
			System.out.println();
			noSpace+=2;
			secondhalf=(secondhalf-1)-((noLine-1)*2);
		}
	}
}
