
public class CustomerManager {
	Customer _customer;
	CreditManagerInterface _creditManager;

	public CustomerManager(Customer customer, CreditManagerInterface creditManager) {
		
		_customer = customer;
		_creditManager = creditManager;

	}

	public void Save() {

		System.out.println("Musteri kaydedildi : " + _customer.City);
	}

	public void Delete() {

		System.out.println("Musteri silindi : " + _customer.City);
	}

	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
		_creditManager.Save();
	}

}
