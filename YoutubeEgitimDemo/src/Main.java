
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Person(), new TeacherCreditManager());
		customerManager.GiveCredit();
		
	/*	CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		//instance oluşturma
		Customer customer = new Customer();
		customer.Id = 1;
		customer.City = "Karabuk";
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.TaxNumber = "100000";
		company.CompanyName = "Arçelik";
		company.Id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		
		Person person = new Person();
		person.FirstName = "";
		person.NationalIdentity = "";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		
	*/

}
}
