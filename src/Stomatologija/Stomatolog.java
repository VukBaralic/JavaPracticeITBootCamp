package Stomatologija;

public class Stomatolog {

	public static void main(String[] args) {
		
		Pacijent p1 = new Pacijent("marko marko" , "333555");
		Pacijent p2 = new Pacijent("aaa aaa" , "5666665");
		Pacijent p3 = new Pacijent("mare mare" ,"8889999");
		
		Ordinacija o = new Ordinacija("Osmeh", 2);
		
		o.postaviPacijenta(p1); o.postaviPacijenta(p2);
		
		System.out.println(o);
		
		o.getBrStolica();
		
	}
	
	
	
}
