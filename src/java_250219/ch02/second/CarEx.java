package java_250219.ch02.second;

public class CarEx {
	
	public static void main(String[] args) {
		
		Car car = new Car(8, "SONATA", "White", "HYUNDAI");
		Car car1 = new Car(8, "340 M", "Blue", "BMW");
		Car car2 = new Car(8, "C class", "White", "Benz");
		Car car3 = new Car(8, "Y", "Red", "Tesla");
		
		
		System.out.println("name: " + car.name);
		System.out.println("name: " + car1.name);
		System.out.println("name: " + car2.name);
		System.out.println("name: " + car3.name);
	}

}
