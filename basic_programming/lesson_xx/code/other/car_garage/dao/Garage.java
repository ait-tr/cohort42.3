package classwork_41.car_garage.dao;

import classwork_41.car_garage.model.Car;
import java.util.function.Predicate;


public interface Garage {
	boolean addCar(Car car);

	Car removeCar(String regNumber);

	Car findCarByRegNumber(String regNumber);

	default Car[] findCarsByModel(String model) {
		return findCarsByPredicate(c -> model.equals(c.getModel()));
	}

	default Car[] findCarsByCompany(String company) {
		return findCarsByPredicate(c -> company.equals(c.getCompany()));
	}

	default Car[] findCarsByEngine(double min, double max) {
		return findCarsByPredicate(c -> c.getEngine() >= min && c.getEngine() < max);
	}

	default Car[] findCarsByColor(String color) {
		return findCarsByPredicate(c -> color.equals(c.getColor()));
	}

	Car[] findCarsByPredicate(Predicate<Car> predicate);
}
