package classwork_41.car_garage.tests;

import static org.junit.jupiter.api.Assertions.*;

import classwork_41.car_garage.dao.GarageImpl;
import classwork_41.car_garage.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classwork_41.car_garage.dao.Garage;

public class GarageTest {
	Garage garage;
	Car[] cars;

	@BeforeEach
	public void setUp() throws Exception {
		garage = new GarageImpl(5);
		cars = new Car[4];
		cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
		cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
		cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red");
		cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");
		for (int i = 0; i < cars.length; i++) {
			garage.addCar(cars[i]);
		}
	}

	@Test
	public void testAddCar() {
		assertFalse(garage.addCar(cars[0]));
		Car car = new Car("Number5", "Model4", "Company2", 2.0, "Green");
		assertTrue(garage.addCar(car));
		car = new Car("Number6", "Model4", "Company2", 2.0, "Green");
		assertFalse(garage.addCar(car));
	}

	@Test
	public void testRemoveCar() {
		assertEquals(cars[0], garage.removeCar("Number1"));
		Assertions.assertNull(garage.removeCar("Number1"));
	}

	@Test
	public void testFindCarByRegNumber() {
		Car car = garage.findCarByRegNumber("Number4");
		Assertions.assertEquals(cars[3], car);
		Assertions.assertEquals(cars[3].getColor(), car.getColor());
		Assertions.assertEquals(cars[3].getEngine(), car.getEngine());
		assertEquals(cars[3], garage.findCarByRegNumber(new String("Number4")));
		Assertions.assertNull(garage.findCarByRegNumber(new String("Number40")));
	}

	@Test
	public void testFindCarsByModel() {
		Car[] expecteds = { cars[2] };
		Car[] actuals = garage.findCarsByModel(new String("Model3"));
		Assertions.assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testFindCarsByCompany() {
		Car[] expecteds = { cars[2], cars[3] };
		Car[] actuals = garage.findCarsByCompany("Company2");
		Assertions.assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testFindCarsByEngine() {
		Car[] expecteds = { cars[1], cars[3] };
		Car[] actuals = garage.findCarsByEngine(1.9, 2.6);
		Assertions.assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testFindCarsByColor() {
		Car[] expecteds = { cars[0], cars[2] };
		Car[] actuals = garage.findCarsByColor(new String("Red"));
		Assertions.assertArrayEquals(expecteds, actuals);
		assertEquals(0, garage.findCarsByColor(new String("Purple")).length);
	}

}
