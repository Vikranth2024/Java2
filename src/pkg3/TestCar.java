package pkg3;
public class TestCar {
	public static void main(String[] args) {
		Garage garage1 = new Garage();
		Car car1 = new Car("Volvo");
		Car car2 = new Car("BMW");
		Car car3 = new Car("Audi");
		garage1.addCar(car1);
		garage1.addCar(car2);
		garage1.addCar(car3);
		System.out.println(garage1.listCars());
		
	}
}

