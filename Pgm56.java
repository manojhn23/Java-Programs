package assignments;

public class Pgm56 {
	private String name;
	private int age;
	void setName(String a) {
		this.name=a;
	}
	void setAge(int b) {
		this.age=b;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm56 p=new Pgm56();
		p.setName("Hello");
		p.setAge(30);
		System.out.println(p.getName());
		System.out.println(p.getName());

	}

}
