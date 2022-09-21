package Loops_Döngülerler;

public class whileLoop {

	public static void main(String[] args) {

		// While

		int a = 0;
		while (a < 10) {
			System.out.println(a);
			a++;
		}
		System.out.println("While Düngüsü Bitti");

		int b = 2;
		while (b < 10) {
			System.out.println(b);
			b += 2;
		}
		System.out.println("While çift Düngüsü Bitti");

		int c = 1;
		while (c < 10) {
			System.out.println(c);
			c += 2;
		}
		System.out.println("While tek Düngüsü Bitti");

		
		
		// do-while
		int j = 2;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While çift Döngüsü Bitti");

		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k < 10);
		System.out.println("Do-While Döngüsü Bitti");

		// sayı işlemden büyük olsa bile (11>10) döngünün çalıştığına
		// dair sanımlanan sayı çıktı olarak verilir (11))

		int l = 11;
		do {
			System.out.println(l);
			l++;
		} while (l < 10);
		System.out.println("Do-While Döngüsü Bitti");

	}
}
