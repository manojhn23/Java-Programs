package assignments;
class OverRide{
	void run() {
		System.out.println("Parent Overloading");
	}
}
public class Pgm54b extends OverRide{
	void run() {
		System.out.println("Child Overloading");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRide or=new Pgm54b();
		or.run();
	}
}
