package cz.vutbr.feec.cviko7;

public class Jug {
	// volume of one jug
	private int volume;
	// maximal volume of jug
	private int maxVolume;

	public Jug(int maxVolume) {
		super();
		this.maxVolume = maxVolume;
	}

	// empty Jug
	public void empty() {
		this.volume = 0;
	}

	// fill jug with amount
	public int fill(int amount) {
		int actualVolume = amount + this.volume;
		// if jug overflow set max and return rest
		if (actualVolume > this.maxVolume) {
			this.volume = this.maxVolume;
			return actualVolume - maxVolume;
		}
		// else set amount and return 0
		this.volume = amount;
		return 0;
	}

	// pour full jug
	public void pour() {
		this.volume = this.maxVolume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public void setMaxVolume(int maxVolume) {
		this.maxVolume = maxVolume;
	}

	@Override
	public String toString() {
		return "" + this.volume;
	}

}
