package Pozoriste;

public class Glavna {

	public static void main(String[] args) {

		Pozoriste p = new Pozoriste(111, "Boljsoj Teatar");
		Pozoriste pr = new Pozoriste(222, "Atelje 666");
		
		Glumac a = new Glumac("Milena_Dravic", p, "kraljica");
		Glumac a1 = new Glumac("Gaga_Nikolic", p, "kralj");
		Glumac a2 = new Glumac("Aljosa_Vuckovic", pr, "sluga");
		Glumac a3 = new Glumac("Marko_Cvorovic", p, "bolesnik");
		Glumac a4 = new Glumac("Gavra_Cubrilovic", pr, "lekar");
		
		System.out.println(a);
		
		Predstava s = new Predstava("Ubistvo na dvoru", p , a);
		Reditelj r = new Reditelj("Vuk_Baralic", p, "Baki");
		
		s.dodajZaposlenog(a1); s.dodajZaposlenog(a3);s.dodajZaposlenog(r);
		
		System.out.println(s);
		System.out.println(s.getBrZaposlenih());
		s.oduzmiZaposlenog(a3);
		System.out.println(s.getBrZaposlenih());
	}

}
