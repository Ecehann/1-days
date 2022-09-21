package MiniProjeler;


public class AsalSayıBulma {

	public static void main(String[] args) {
		int number = 7;
		//KALANI BULMAK İÇİN.
		//int remainder = number % 2;
		//System.out.println(remainder);
		
		boolean asal = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir.");
				return;
		}
		
		if(number<2) {
			System.out.println("Geçersiz sayı!");
		}
		
		for (int i=2; i<number; i++ ) {
			if(number % 2 ==0) {
				asal = false;
			}
		}
		if (asal) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}

	}

}
