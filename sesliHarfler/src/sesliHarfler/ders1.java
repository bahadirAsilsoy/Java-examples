package sesliHarfler;

public class ders1 {
	public static void main(String[] args) {

		char harf = '�';

		/*
		 * char [] kalin = {'A','I','O','U'}; 
		 * char [] ince  = {'E','�','�','�'};
		 * 
		 * if(harf = ince){ System.out.println("ince harf"); }
		 */

		switch (harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':

			System.out.println("Kal�n sesli harf");

			break;
		default:

			System.out.println("�nce sesli harf");

		}

	}

}
