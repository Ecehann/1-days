package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
	String ortaMetin = "İlginizi Çekebilir";
	String altMetin = "Vade Süresi";
	
	System.out.println(ortaMetin);
	System.out.println(altMetin);
	
	//integer (tam sayılarda)
	int vade = 12;
	
	//ondalıklı sayılarda
	double dolarDun = 18.14;
	double dolarBugun = 18.10;
	
	Boolean dolarDustuMu = true;
	//Boolean dolarDustuMu = false;
	
	String okYonu = "";
	
	if (dolarBugun<dolarDun) {
		okYonu = "down.svg";
		System.out.println(okYonu);
	} else if(dolarBugun>dolarDun) {
		okYonu = "up.svg";
		System.out.println(okYonu);
	}
	else {
		okYonu = "equal.svg";
		System.out.println(okYonu);
	}
	//array
	
	String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emeklilik"};
	
	for (int i = 0; i < krediler.length; i++) {
		System.out.println(krediler[i]);
	}
	
	
	
	
	
	
	
	
	}}
