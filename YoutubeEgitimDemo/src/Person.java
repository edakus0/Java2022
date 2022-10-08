
public class Person extends Customer {

	public String NationalIdentity;
	public String FirstName;
	public String LastName;
	
	public Person() {
		
	}
	
	public Person(int Id, String City, String FirstName, String LastName, String NationalIdentity){
		super(Id,City);
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.NationalIdentity = NationalIdentity;
		
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getFullName() {
		return FirstName + " " + LastName;
	}

}
