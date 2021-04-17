package switchDemo;

public class ders1 {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldýnýz");
			break;
		default:
			System.out.println("Lütfen geçerli bir not giriniz");

			break;
		}

	}

}
