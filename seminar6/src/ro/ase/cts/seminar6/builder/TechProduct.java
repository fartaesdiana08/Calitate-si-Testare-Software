package ro.ase.cts.seminar6.builder;

public class TechProduct implements Product{
	
	int id;
	String productName;
	String manufacturer;
	String model;
	String displayType;
	float price;
	
	private TechProduct() {
	}
	
	private TechProduct(int id) {
		super();
		this.id = id;
	}

	@Override
	public String getDescription() {
		return "this is a tech product";
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public String getDisplayType() {
		return displayType;
	}

	public float getPrice() {
		return price;
	}
	
	public static class TechProductBuilder{
		private TechProduct product;
		
		public TechProductBuilder() {
			product=new TechProduct();
		}
	}
}