package classesWithAttributes;

public class Product {
	
	public Product (int _id, String _name, String _description,double _price,int _stockAmount,String _renk){
		
		System.out.println("Yap�c� blok �al��t�");
		this._id = _id;
		this._name = _name;
		this._description = _description;
		this._price = _price;
		this._stockAmount = _stockAmount;
		this._renk = _renk;
	}

	// attribute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	// getter
	public int getId() {
		return _id;
	}

	public String getName() {
		return this._name.substring(0, 1);
	}

	public String getDescription() {
		return _description;
	}

	public double getPrice() {
		return _price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public String getRenk() {
		return _renk;
	}

	public String getKod() {
		return _kod;
	}

	// setter
	public void setId(int id) {
		_id = id;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setDescription(String _description) {
		this._description = _description;
	}

	public void setPrice(double _price) {
		this._price = _price;
	}

	public void setStockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public void setRenk(String _renk) {
		this._renk = _renk;
	}

	public void setKod(String _kod) {
		this._kod = _kod;
	}

}
