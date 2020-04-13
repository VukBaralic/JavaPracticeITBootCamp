package DeteIKliker;

public class Dete {

	private String ime;
	private String prezime;
	private int godine;
	private int brKlikera;
	
	
	public Dete(String ime, String prezime, int godine, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.brKlikera = brKlikera;
		Deca++; sumaGodina = sumaGodina + godine;
	}


	public Dete(int godine) {
		
		this.godine = godine;
	}


	public int getBrKlikera() {
		return brKlikera;
	}


	public void dodajBrKlikera(int brKlikera) {
		this.brKlikera = this.brKlikera + brKlikera;
	}

	public void oduzmiBrKlikera(int brKlikera) {
		this.brKlikera = this.brKlikera - brKlikera;
	}
	

	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public int getGodine() {
		return godine;
	}
	
	public static double Deca;		
	public static double sumaGodina;
	
	public static double prosekGodina() {
		double prosek = sumaGodina / Deca;
		return prosek;
	}
	
}
