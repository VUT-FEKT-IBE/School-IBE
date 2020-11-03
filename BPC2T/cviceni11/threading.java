package com.vutbr.feec9;

public class threading extends Thread implements Runnable {
	Thread vlakno;
	public static boolean flag = false;

	public static void main(String[] args) {
		function f = new function();
		threading t1 = new threading();
		t1.start();
		t1.setPriority(MAX_PRIORITY);
		System.out.println("zapnuto " + t1.isAlive());
		if (t1.isAlive() == true) {
			threading t2 = new threading();
			threading t3 = new threading();
			t2.setPriority(MIN_PRIORITY);
			t3.setPriority(MIN_PRIORITY);
			t2.start();
			t3.start();
			System.out.println("zapnuto " + t2.isAlive());
			System.out.println("zapnuto " + t3.isAlive());
			f.press2Continue();
			t2.run();
			t3.run();
			if (t2.isAlive() == false && t3.isAlive() == false) {
				System.out.println("ukonceno " + t2.isAlive());
				System.out.println("ukonceno " + t3.isAlive());
				t1.run();
			}
		}
		if (t1.isAlive() == false) {
			System.out.println("ukonceno " + t1.isAlive());
		}
		System.out.println("rovnice");
		t1.setPriority(MAX_PRIORITY);
		t1.runRovnice();
	}

	@Override
	public void run() {
		// TODO Auto-generated method st

		try {
			// System.out.println("ukonceno " + this.isAlive());
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			// System.out.println("ukonceno " + this.isAlive());
		}

	}

	public void runRovnice() {
		// TODO Auto-generated method stub
		double x = 10;
		double y;
		while (true) {
			x = ((x * 1103515245 + 12345)) % 232;
			y = x / 2;
			try {
				System.out.println("x= " + x + " y= " + y);
				Thread.sleep(1000);

			} catch (InterruptedException ie) {
				// System.out.println("ukonceno " + this.isAlive());
			}
		}

	}

}
