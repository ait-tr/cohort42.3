package classwork_41.car_garage.dao;

import classwork_41.car_garage.model.Car;

import java.util.function.Predicate;


public class GarageArrayListImpl implements Garage {

	private Car[] cars;
	private int size;

	public GarageArrayListImpl(int capacity) {
		cars = new Car[capacity];
	}

	@Override
	public boolean addCar(Car car) {
		if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
			return false;
		}
		cars[size++] = car;
		return true;
	}

	@Override
	public Car removeCar(String regNumber) {
		for (int i = 0; i < size; i++) {
			if (regNumber.equals(cars[i].getRegNumber())) {
				Car temp = cars[i];
				cars[i] = cars[--size];
				cars[size] = null;
				return temp;
			}

		}
		return null;
	}

	@Override
	public Car findCarByRegNumber(String regNumber) {
		for (int i = 0; i < size; i++) {
			if (cars[i].getRegNumber().equals(regNumber)) {
				return cars[i];
			}
		}
		return null;
	}

	@Override
	public Car[] findCarsByPredicate(Predicate<Car> predicate) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (predicate.test(cars[i])) {
				count++;
			}
		}
		Car[] res = new Car[count];
		for (int i = 0, j = 0; j < res.length; i++) {
			if (predicate.test(cars[i])) {
				res[j++] = cars[i];
			}
		}
		return res;
	}

}
