package assignments;
abstract class Abp{
	
	abstract void hello();
}
class Abc extends Abp{
	void hello() {
		System.out.println("abstract class 2");
	}
}

public class Pgm55 extends Abp {
	void hello() {
		System.out.println("Abstract class 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abp p=new Pgm55();
		p.hello();
	}

}
