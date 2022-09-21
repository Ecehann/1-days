
public class Datatypes {

	public static void main(String[] args) {
		
		String metinsel = "Selamm";
		System.out.println(metinsel);
		
		int tamSayi = 12;
		System.out.println(tamSayi);
		
		double ondalikSayi = 10.2;
		System.out.println(ondalikSayi);
		
		boolean evetMi = true;
		boolean hayirMi = false;
		System.out.println(evetMi);
		System.out.println(hayirMi);
		
		char karakter = 'B';
		System.out.println(karakter);
		
			byte kucukSayilar = 127;
			short ortaSayilar = 32767;
			int geneldeKullanilan = 2147483647;
			long buyukSayilar = -2147483648; 
				// primitive types'ta long aralığı -9223372036854775808 to +9223372036854775807
				//göstermesine rağmen int ile aynı aralığı kabul ediyor. neden?
		
			System.out.println(kucukSayilar);
			System.out.println(ortaSayilar);
			System.out.println(geneldeKullanilan);
		
		
	}

}
