package com.vutbr.feec3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		zbozi[] z1 = new zbozi[4];
		z1[0] = new potravina("rohlik", 1.5, 8);
		z1[1] = new naradi("roh", 1.5, 7);
		z1[2] = new potravina("rohliaaddk", 1.5, 6);
		z1[3] = new potravina("rohsddslik", 1.5, 5);

		for (int i = 0; i < z1.length; i++) {
			System.out.println(z1[i].getNazev() + " " + z1[i].getCena());
			if (z1[i] instanceof potravina) {
				potravina potravina = (potravina) z1[i];
				System.out.println(potravina.getTrvanlivost() + potravina.getJednotka());

			}

		}
	}

}
