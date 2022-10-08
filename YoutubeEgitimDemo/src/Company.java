
public class Company extends Customer {
	
	public String CompanyName;
	public String TaxNumber;
	
	public Company() {
		
	}
	
	public Company(int Id, String City, String CompanyName, String TaxNumber) {
		super(Id,City);
		this.CompanyName = CompanyName;
		this.TaxNumber = TaxNumber;
		
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}
	
	

}
