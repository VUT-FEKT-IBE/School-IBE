package cz.vutbr.feec.utko.tin.cv1;

public class Mapa {
	private Auto auto1;
	private Auto auto2;
	private Auto auto3;
	private Auto auto4;
	
	public void vypisVsechnaAuta(){
		System.out.println(auto1.toString());
		System.out.println(auto2.toString());
		System.out.println(auto3.toString());
		System.out.println(auto4.toString());
		
	}

	public Auto getAuto1() {
		return auto1;
	}

	public void setAuto1(Auto auto1) {
		this.auto1 = auto1;
	}

	public Auto getAuto2() {
		return auto2;
	}

	public void setAuto2(Auto auto2) {
		this.auto2 = auto2;
	}

	public Auto getAuto3() {
		return auto3;
	}

	public void setAuto3(Auto auto3) {
		this.auto3 = auto3;
	}

	public Auto getAuto4() {
		return auto4;
	}

	public void setAuto4(Auto auto4) {
		this.auto4 = auto4;
	}

}
