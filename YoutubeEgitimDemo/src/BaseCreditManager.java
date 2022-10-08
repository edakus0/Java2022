
public abstract class BaseCreditManager implements CreditManagerInterface {
	@Override
	public abstract void Calculate();

	@Override
	public void Save() {
		System.out.println("Kaydedildi");
		
	}

}
