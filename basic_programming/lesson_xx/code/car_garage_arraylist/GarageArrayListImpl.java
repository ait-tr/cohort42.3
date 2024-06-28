package classwork_42.car_garage.dao;

import classwork_42.car_garage.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class GarageArrayListImpl implements Garage {

	// private Car[] cars;
	private List<Car> cars;
	//private int size;
	private int capacity;

	public GarageArrayListImpl(int capacity) {
		// cars = new Car[capacity];
		cars = new ArrayList<>();
		this.capacity = capacity;
	}

	@Override
	public boolean addCar(Car car) {
		//if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
		if (car == null || cars.size() == capacity || cars.contains(car)) {
			return false;
		}
		// cars[size++] = car;
		cars.add(car);
		return true;
	}

	@Override
	public Car removeCar(String regNumber) {
		Car car = findCarByRegNumber(regNumber);
		cars.remove(car);
		return car;
	}


	@Override
	public Car findCarByRegNumber(String regNumber) {
		for (Car car : cars) {
		    if(car.getRegNumber().equals(regNumber)){
				return car;
			}
		}
		return null;
	}

	@Override
	public Car[] findCarsByModel(String model) {
		int count = 0;
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getModel().equals(model)){
				count++;
			}
		}
		Car[] temp = new Car[count];
		int j = 0;
		for (int i = 0; i < cars.size(); i++ ) {
			if(cars.get(i).getModel().equals(model)){
				temp[j] = cars.get(i);
				j++;
			}
		}
		return temp;
	}

	@Override
	public Car[] findCarsByCompany(String company) {
		int count = 0;
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getCompany().equals(company)){
				count++;
			}
		}
		Car[] temp = new Car[count];
		int j = 0;
		for (int i = 0; i < cars.size(); i++ ) {
			if(cars.get(i).getCompany().equals(company)){
				temp[j] = cars.get(i);
				j++;
			}
		}
		return temp;
	}

	@Override
	public Car[] findCarsByColor(String color) {
		int count = 0;
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getColor().equals(color)){
				count++;
			}
		}
		Car[] temp = new Car[count];
		int j = 0;
		for (int i = 0; i < cars.size(); i++ ) {
			if(cars.get(i).getColor().equals(color)){
				temp[j] = cars.get(i);
				j++;
			}
		}
		return temp;
	}

	@Override
	public Car[] findCarsByEngine(double min, double max) {
		int count = 0;
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getEngine() > min && cars.get(i).getEngine() < max){
				count++;
			}
		}
		Car[] temp = new Car[count];
		int j = 0;
		for (int i = 0; i < cars.size(); i++ ) {
			if(cars.get(i).getEngine() > min && cars.get(i).getEngine() < max){
				temp[j] = cars.get(i);
				j++;
			}
		}
		return temp;
	}

}
