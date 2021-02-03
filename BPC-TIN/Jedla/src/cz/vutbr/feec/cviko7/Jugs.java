package cz.vutbr.feec.cviko7;

public class Jugs {
	// parent important for find trace back from result
	private Jugs parent = null;
	// else probably not important but useful for tracking graph tree
	private Jugs pourA = null;
	private Jugs pourB = null;
	private Jugs spillA = null;
	private Jugs spillB = null;
	private Jugs emptyA = null;
	private Jugs emptyB = null;
	// two jug
	private Jug A; // 4 litr
	private Jug B; // 3 litr
	// operation only for better print how to end in the same result without much
	// thinking
	private String operation = "Start";

	public Jugs(int maxJugA, int maxJugB) {
		super();
		this.A = new Jug(maxJugA);
		this.B = new Jug(maxJugB);

	}

	// empty first or second jug 0 is A jug 1 is B jug
	public void emptyJug(int whichOne) {
		if (whichOne == 0) {
			this.A.empty();
		} else if (whichOne == 1) {
			this.B.empty();
		}
	}

	// pour full jug one or two jug 0 is A jug 1 is B jug
	public void pourJug(int whichOne) {
		if (whichOne == 0) {
			this.A.pour();
		} else if (whichOne == 1) {
			this.B.pour();
		}
	}

	// spill from one jug to another jug 0 is A jug 1 is B jug
	public void spillJug(int whichOne) {
		int volume;
		// from a to b
		if (whichOne == 0) {
			volume = this.A.getVolume();
			this.A.empty();
			volume = this.B.fill(volume);
			this.A.fill(volume);
		} else if (whichOne == 1) { // from b to a
			volume = this.B.getVolume();
			this.B.empty();
			volume = this.A.fill(volume);
			this.B.fill(volume);
		}
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Jug getA() {
		return A;
	}

	public void setA(Jug a) {
		A = a;
	}

	public Jug getB() {
		return B;
	}

	public void setB(Jug b) {
		B = b;
	}

	public Jugs getParent() {
		return parent;
	}

	public void setParent(Jugs parent) {
		this.parent = parent;
	}

	public Jugs getPourA() {
		return pourA;
	}

	public void setPourA(Jugs pourA) {
		this.pourA = pourA;
	}

	public Jugs getPourB() {
		return pourB;
	}

	public void setPourB(Jugs pourB) {
		this.pourB = pourB;
	}

	public Jugs getSpillA() {
		return spillA;
	}

	public void setSpillA(Jugs spillA) {
		this.spillA = spillA;
	}

	public Jugs getSpillB() {
		return spillB;
	}

	public void setSpillB(Jugs spillB) {
		this.spillB = spillB;
	}

	public Jugs getEmptyA() {
		return emptyA;
	}

	public void setEmptyA(Jugs emptyA) {
		this.emptyA = emptyA;
	}

	public Jugs getEmptyB() {
		return emptyB;
	}

	public void setEmptyB(Jugs emptyB) {
		this.emptyB = emptyB;
	}

	@Override
	public String toString() {
		return "  " + A + "   |   " + B + "   | " + operation;
	}
}
