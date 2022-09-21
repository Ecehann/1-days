
public class switchBlocks_değişken_sabit {

	public static void main(String[] args) {

		// grade = not
		char grade = 'A';

		switch (grade) {

		case 'A':
		case 'B':
		case 'C':
		case 'D':
			System.out.println("Geçtiniz!");
			break;

		case 'F':
			System.out.println("Kaldınız.");
			break;

		default:
			System.out.println("Geçersiz bir not girdiniz.");
		}
	}

}
