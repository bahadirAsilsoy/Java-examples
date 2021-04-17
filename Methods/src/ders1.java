
public class ders1 {
	public static void main(String[] args) {

		sayiBulmaca();

	}
	
	public static void sayiBulmaca(){
		
		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {

			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {

			System.out.println("Sayý mevcuttur");

		} else {

			System.out.println("Sayý mevcut deðildir");

		}
		
	}
	
	public static void mesajVer(){
		
	}

}
