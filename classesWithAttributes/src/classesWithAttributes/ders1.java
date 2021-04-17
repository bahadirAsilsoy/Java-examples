package classesWithAttributes;

public class ders1 {
	public static void main(String[] args) {

		Product product = new Product(1,"Laptop", "Asus Tuf Laptop", 3000, 100, "Kýrmýzý");
		product.setId(1);
		product.setName("Laptop");
		product.setDescription(" Asus Tuf Laptop");
		product.setPrice(3000);
		product.setStockAmount(100);
		product.setRenk("kýrmýzý");
		product.setKod("Hawlikod");
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getName());
	}

}
