package pkg3;

import java.util.ArrayList;

public class Garage{
	ArrayList<Car>cars = new ArrayList<>();
	
	public void addCar(Car car) {
		cars.add(car);
	}
	public ArrayList<Car> listCars(){
		return cars;
	}
	
}

