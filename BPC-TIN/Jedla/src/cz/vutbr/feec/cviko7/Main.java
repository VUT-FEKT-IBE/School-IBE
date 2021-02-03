package cz.vutbr.feec.cviko7;
/**
 * 
 * @author jedla
 * @category School project
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugs start = new Jugs(4, 3);
		Graph g = new Graph();
		System.out.println("Jug A max volume: " + start.getA().getMaxVolume() + " Jug B max volume: "
				+ start.getB().getMaxVolume());
		System.out.println("Jug A | Jug B | Operation");
		g.find(2, start);

	}

}
