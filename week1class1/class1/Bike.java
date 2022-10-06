package week1.class1;

public class Bike {
	
	public void applyBrake() {
		System.out.println("Applied Brake");
	}
	
	public void soundHorn() {
		System.out.println("Sound Horn");
		
	}

	public static void main(String[] args) {
		Bike b= new Bike();
		b.applyBrake();
		b.soundHorn();
		Car c= new Car();
		c.applyBrake();
		c.soundHorn();

	}

}
