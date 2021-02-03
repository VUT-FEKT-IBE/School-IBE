package cz.vutbr.feec.cviko1;

public class CarBazar {

	public CarBazar(int prize, String brand, int km) {
		super();
		this.brand = brand;
		this.prize = prize;
		this.km = km;
	}

	private int position[];
	private String brand;
	private int prize;
	private int km;
	private boolean abs = false;
	private int id;

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return brand + "[ prize=" + prize + ", km=" + km + ", abs=" + abs + " id " + id + " ]\n";
	}

	public int[] getPosition() {
		return position;
	}

	public void setPosition(int position[]) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
