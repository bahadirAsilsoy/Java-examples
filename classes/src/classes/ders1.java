package classes;

public class ders1 {
	public static void main(String[] args) {
		//classlar referans tiptir
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

	}

}


