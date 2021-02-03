package cz.vutbr.feec.cviko3;

public class Stater {

	public static void main(String[] args) {
		MyCanvas canvas = new MyCanvas();

		Rectangle rec1 = new Rectangle(5);
		rec1.setX(4);
		rec1.setXside(500);
		rec1.setYside(500);
		Rectangle rec2 = new Rectangle(4);
		rec2.setX(4);
		rec2.setXside(400);
		rec2.setYside(400);
		Rectangle rec3 = new Rectangle(5);
		rec3.setX(6);
		rec3.setXside(600);
		rec3.setYside(600);
		Circle circ1 = new Circle(3);
		circ1.setXside(200);
		circ1.setYside(200);
		Circle circ2 = new Circle(4);
		circ2.setXside(800);
		circ2.setYside(800);
		Circle circ3 = new Circle(5);
		circ3.setXside(900);
		circ3.setYside(900);

		Multiple mult = new Multiple();
		mult.addObject(rec1);
		mult.addObject(rec3);
		mult.addObject(circ2);

		canvas.addData(rec2);
		canvas.addData(circ1);
		canvas.addData(circ3);
		canvas.addData(mult);

		canvas.multiplePrint();
		

		
	}

}
