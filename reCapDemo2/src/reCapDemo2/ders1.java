package reCapDemo2;

public class ders1 {
	public static void main(String[] args) {

		double[] myList = { 1.2, 1.3, 4.3, 5.6 };

		double total = 0;
		double max = myList[0];

		for (double number : myList) {

			if (max < number) {

				max = number;

			}

			total = total + number;
			System.out.println(number);

		}

		System.out.println("Sayýlarýn toplamý: " + total);

		/*
		 * Benim yaptýðým :( 
		 * if (max < myList[1]) {
		 * 
		 * max = myList[1]; }
		 * 
		 * if (max < myList[2]) {
		 * 
		 * max = myList[2]; }
		 * 
		 * if (max < myList[3]) {
		 * 
		 * max = myList[3]; }
		 */

		System.out.println("En büyük sayý : " + max);

	}
}
