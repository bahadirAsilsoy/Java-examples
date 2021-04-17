package sesliHarfler;

public class ders1 {
	public static void main(String[] args) {

		char harf = 'Ü';

		/*
		 * char [] kalin = {'A','I','O','U'}; 
		 * char [] ince  = {'E','Ý','Ö','Ü'};
		 * 
		 * if(harf = ince){ System.out.println("ince harf"); }
		 */

		switch (harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':

			System.out.println("Kalýn sesli harf");

			break;
		default:

			System.out.println("Ýnce sesli harf");

		}

	}

}
