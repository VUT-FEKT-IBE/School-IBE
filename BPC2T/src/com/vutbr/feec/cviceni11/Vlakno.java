package com.vutbr.feec.cviceni11;

public class Vlakno extends Thread implements Runnable {
	Thread vlakno;

	public static void main(String[] args) {
		Vlakno t1 = new Vlakno();
		t1.start();
		t1.setPriority(MAX_PRIORITY);
	}

	@Override
	public void run() {
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
