package bankSystemTask;

public class Registration {
	
	//private int id;
	 String name;
	 String mobilenum;
	 String DOB;
	 String type;
	 String accountnum;
	 long balance;
	
	Registration(String name,String mobilenum,String DOB,String type,String accountnum,long balance)
	{
	    this.name=name;
	    this.mobilenum=mobilenum;
	    this.DOB=DOB;
	    this.type=type;
	    this.accountnum=accountnum;
	    this.balance=balance;
	}
	 void display()
	 {
		 System.out.println(name+" "+mobilenum+" "+DOB+" "+type+" "+accountnum+" "+balance);  
	 }
	
}
