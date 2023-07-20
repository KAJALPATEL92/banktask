package bankSystemTask;
public class RegisterPin {
	String pin;
	String reg;
	
	public RegisterPin(String pin, String reg) {
		// TODO Auto-generated constructor stub
		this.pin=pin;
		this.reg=reg;
	}
	void pindisplay()
	{
		System.out.println(pin+" "+reg);
	}
}
