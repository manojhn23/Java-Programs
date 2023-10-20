package assignments;
class GParent{
	void gp() {
		System.out.println("Grand Parent");
	}
}
class Apar extends GParent{
	
}
public class Pgm53b extends Apar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm53b g=new Pgm53b();
		g.gp();
	}
}
