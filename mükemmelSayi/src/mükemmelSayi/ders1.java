package m�kemmelSayi;

public class ders1 {
	public static void main(String[] args) {

		// m�kemmel say� : tam b�l�nd��� say�lar�n toplam� kendisini veren say�lar
		// 6 --> 1,2,3
		// 28 -->1,2,4,7,14

		int number = 20;
		int toplam = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {

				System.out.println("Say�m�z�n tam b�leni " + i);
				toplam = toplam + i;

			}
		}

		System.out.println("Say�m�z�n tam b�lenlerinin toplam� : " + toplam);

		if (number == toplam) {

			System.out.println("Say�m�z m�kemmel say�d�r.");

		}

		else {
			System.out.println("Say�m�z m�kemmel say� de�ildir");
		}
	}

}
