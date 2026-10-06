package sayed.java;
class Atmm {
	void withdraw() {
		System.out.println(" withdraw logic");
	}
	void depoiste() {
		System.out.println(" depositte logic");
	}
}
public class Demooo extends Atmm{

	public static void main(String[] args) {
		Demooo  ff = new Demooo();
ff.withdraw();
ff.depoiste();
	}
}