package ro.ase.acs.seminar5.factory;

public class OfficeProduct implements Product {
	String productName;
	
	private OfficeProduct() {}
	
	public OfficeProduct(String productName) {
		super();
		this.productName = productName;
	}


	@Override
	public String getDescription() {
		return "this is an office product";
	}

}
