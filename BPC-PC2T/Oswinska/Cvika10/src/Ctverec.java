class Ctverec {

	private float hrana;

	// vypocet obsahu ctverce
	float vypoctiObsah() // zmena na float  11. chyba
	{
		return hrana*hrana;
	}
	// zjisteni delky hrany ctverce
	float getHrana()
	{
		return hrana;
	}
	// nastaveni delky hrany ctverce
	void setHrana(float delka){			
		hrana=delka;
	}
	// konstruktor se zadanim delky hrany ctverce
	Ctverec(float hrana){				
		this.hrana=hrana;	// pridano this. 		1. chyba
	}
}
