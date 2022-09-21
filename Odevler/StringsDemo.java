
public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = " Bugün Hava Çok Güzel. ";
		
		System.out.println(mesaj);
		
		/*System.out.println("Top Karakter : " + mesaj.length());
		System.out.println("4. karakter : " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Mükemmel haber!"));
		System.out.println(mesaj.startsWith("C"));
		System.out.println(mesaj.endsWith(" "));
		System.out.println(mesaj.indexOf("B"));
		System.out.println(mesaj.lastIndexOf('l')); //????????????????
		
		char[] karakter = new char [5];
		mesaj.getChars(0, 5, karakter, 0);
		System.out.println(karakter); */
		
		String yeniMesaj = mesaj.replace('a', 'e');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(3,6));
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		for (String kelime : mesaj.split(mesaj)) {
			System.out.println(kelime); //yazdrımadı???????????
		}

	}

}
