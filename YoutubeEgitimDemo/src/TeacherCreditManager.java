
public class TeacherCreditManager extends BaseCreditManager implements CreditManagerInterface {
	@Override
	public void Calculate() {
		System.out.println("Ogretmen kredisi hesaplandi");
	}
	
	@Override
	public void Save() {
		super.Save();
	}

}
