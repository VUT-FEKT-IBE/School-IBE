package cz.vutbr.feec.cviko1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Map> CarBazar = new ArrayList<Map>();
		CarBazar a1 = new CarBazar(100000, "Skoda", 150000);
		CarBazar a2 = new CarBazar(500000, "Audi", 150000);
		CarBazar a3 = new CarBazar(100000, "Skoda", 150000);
		CarBazar a4 = new CarBazar(500000, "Bmw", 150000);
		a2.setAbs(true);
		a4.setAbs(true);

		Map map = new Map();
		map.addCar(a1);
		map.addCar(a2);
		map.addCar(a3);
		map.addCar(a4);
		map.add();
		map.printing();

		// System.out.print(map);
		/***
		 * System.out.print(a1); System.out.print(a2); System.out.print(a3);
		 * System.out.print(a4);
		 **/

	}

}
