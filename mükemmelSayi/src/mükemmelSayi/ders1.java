package mükemmelSayi;

public class ders1 {
	public static void main(String[] args) {

		// mükemmel sayý : tam bölündüðü sayýlarýn toplamý kendisini veren sayýlar
		// 6 --> 1,2,3
		// 28 -->1,2,4,7,14

		int number = 20;
		int toplam = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {

				System.out.println("Sayýmýzýn tam böleni " + i);
				toplam = toplam + i;

			}
		}

		System.out.println("Sayýmýzýn tam bölenlerinin toplamý : " + toplam);

		if (number == toplam) {

			System.out.println("Sayýmýz mükemmel sayýdýr.");

		}

		else {
			System.out.println("Sayýmýz mükemmel sayý deðildir");
		}
	}

}
