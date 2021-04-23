
public class Hranol extends Ctverec // Cetverec prepsan na Ctverec 		2. chyba
{
	private float hrana;
	boolean zeDreva;
	static int pocetHranolu=0; // final prepsan na static			3. chyba

	// konstruktor se zadanim delky hrany, vysky a materialu
	Hranol(float podstava,float vyska, boolean drevena)
	{
		super(podstava);		// pridan super pro zjisteni podstavy		4. chyba
		hrana=vyska;
		zeDreva=drevena;
		pocetHranolu++;
	}
	
	// vypocet objemu hranolu
	float vypoctiObjem()
	{
		return this.hrana*vypoctiObsah(); // objem zmenen aby pocital objem hranolu 		5.chyba
	}
	
	// nastaveni materialu
	void setDreveny(boolean dreveny)
	{
		zeDreva=dreveny;
	}
	
	// zjisteni materialu
	boolean jeDreveny()
	{
		return zeDreva;
	}
	
	// zjisteni celkoveho poctu existujicich kostek
	static int getPocetHranolu()
	{
		return pocetHranolu;
	}
	
	// zjisteni vysky hranolu
	float getHrana()
	{
		return hrana;
	}
	// nastaveni vysky hranolu
	void setHrana(float delka)
	{
		hrana=delka;
	}

}
