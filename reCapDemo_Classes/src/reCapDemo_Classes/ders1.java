package reCapDemo_Classes;

public class ders1 {
	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3,4);
		int csonuc = dortIslem.Cikar(5,6);
		float bsonuc = dortIslem.Bolme(5,2);
		int casonuc = dortIslem.Carpma(9,10);
		System.out.println("Toplama i�leminin sonucu = " + sonuc);
		System.out.println("��karma i�leminin sonucu = " + csonuc);
		System.out.println("B�lme i�leminin sonucu = " + bsonuc);
		System.out.println("�arpma i�leminin sonucu = " + casonuc);
	}

}
