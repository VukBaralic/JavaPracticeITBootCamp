package Pozoriste;

public class Pozoriste {

	private int id;
	private String naziv;
	
	public int getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public Pozoriste(int id, String naziv) {
		this.id = id;
		this.naziv = naziv;
	}
	@Override
	public String toString() {
		return  naziv + "[" + id + "]";
	}
	
	
	
}
