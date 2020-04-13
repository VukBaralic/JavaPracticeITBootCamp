package DeteIKliker;

public class Main {
	
	
	public static void main(String[] args) {

		Dete a = new Dete("Vuksa" , "Nikic", 12 , 56);
		Dete b = new Dete("Susko" , "Susic", 14 , 23);
		Dete c = new Dete("Jaksa" , "Katic", 9 , 14);
		
		a.dodajBrKlikera(5);
		b.oduzmiBrKlikera(4);
		
		c.getBrKlikera();
		
		System.out.println(a.getBrKlikera());
		
		
		
		System.out.println("Prosek godina je " +  Dete.prosekGodina() );
		
		
		
		
	}

}
