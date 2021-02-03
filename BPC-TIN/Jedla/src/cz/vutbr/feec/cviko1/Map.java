package cz.vutbr.feec.cviko1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {

	List<CarBazar> database = new ArrayList<CarBazar>();
	private int CARID = 0;

	public Map() {
		super();
	}

	private CarBazar a1;

	@Override
	public String toString() {
		return "Map [a1=" + a1 + "a2=" + a2 + "a3=" + a3 + "a4=" + a4 + "]";
	}

	public int numberOfCars() {
		return database.size();
	}

	public void addCar(CarBazar car) {
		database.add(car);
		car.setId(CARID);
		CARID++;
	}

	public void add() {
		Scanner myObj = new Scanner(System.in);
		int prize, km;
		String brand;
		System.out.println("Input brand of car");
		brand = myObj.nextLine();
		System.out.println("Input prize");
		prize = myObj.nextInt();
		System.out.println("Input km");
		km = myObj.nextInt();
		CarBazar carr = new CarBazar(prize, brand, km);
		database.add(carr);
		carr.setId(CARID);
		CARID++;
	}

	public void printing() {
		for (int i = 0; i < database.size(); i++) {
			System.out.print(database.get(i));
		}
	}

	public CarBazar getA1() {
		return a1;
	}

	public void setA1(CarBazar a1) {
		this.a1 = a1;
	}

	public CarBazar getA2() {
		return a2;
	}

	public void setA2(CarBazar a2) {
		this.a2 = a2;
	}

	public CarBazar getA3() {
		return a3;
	}

	public void setA3(CarBazar a3) {
		this.a3 = a3;
	}

	public CarBazar getA4() {
		return a4;
	}

	public void setA4(CarBazar a4) {
		this.a4 = a4;
	}

	private CarBazar a2;
	private CarBazar a3;
	private CarBazar a4;
}
