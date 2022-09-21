
public class recapDemo1_özet {

	public static void main(String[] args) {

		int sayi1 = 65;
		int sayi2 = 60;
		int sayi3 = 55;
		
		int enBuyuk = sayi1;
		
		//elimdeki sayıların en büyüğünü nasıl bulurum?
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
			
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük = " + enBuyuk);

	}

}
