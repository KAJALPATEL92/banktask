package bankSystemTask;
import java.util.Scanner;
import java.util.HashMap;
public class TestBankSystem {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		//private int id;
		 String name;
		 String mobilenum;
		 String DOB;
		 String type;
		 String accountnum;
		 long balance;
		
		
			System.out.println("Enter Your Name"); 
		    name = myObj.nextLine();
		    System.out.println("Enter Your Mobilenum"); 
		    mobilenum = myObj.nextLine();
		    System.out.println("Enter Your DOB"); 
		    DOB = myObj.nextLine();
		    System.out.println("Enter a Type of Account Saving/Current"); 
		    type = myObj.nextLine();
		    System.out.println("Enter Your Account Number"); 
		    accountnum = myObj.nextLine();
		    System.out.println("Please Enter your Balance"); 
		    balance = myObj.nextLong();
			//System.out.println(name+mobilenum+DOB+type);
		    HashMap<String,String> Registration = new HashMap<String,String>();
		    
		    
		    Registration reg=new Registration(name, mobilenum,DOB,type,accountnum,balance); 
		   // reg.display();
		    Registration.put(name, accountnum);
		    
		    
		    
		    System.out.println("----------------------------------------");
		    System.out.println("Register Your PIN");
		    String accountnum1;
		    System.out.println("Enter a Accountnum"); 
		    accountnum1 = myObj.next();
		    if(accountnum1.equals(accountnum))
		    {
		    	String pin;
			    String confirmpin;
			    System.out.println("Enter Your Pin"); 
			    pin = myObj.next();
			    System.out.println("Enter Your Confirm pin"); 
			    confirmpin = myObj.next();
			    
			    if(pin.equals(confirmpin))
			    {
			    	RegisterPin rp=new RegisterPin(pin,accountnum);
				    //rp.pindisplay();
				    
				    System.out.println("----------------------------------------");
				    System.out.println("Please Choose any one option");
				    System.out.println("1.You Want to Deposit press 1");
				    System.out.println("2.You Want to Withdraw press 2");
				    String option;
				    option = myObj.next();
				   
				   String num ="1";

				    if (option.equals(num)) {  // this works as expected
				    	long deposite;
					    System.out.println("Please Enter your Deposit Amount"); 
					    deposite = myObj.nextLong();
					    Deposite depo=new Deposite();
					    for (String i : Registration.keySet()) {
					        System.out.println("Your Name is "+i);
					        System.out.println("Your Account Number is: "+Registration.get(i));
					      }
					    depo.bal(balance,deposite);
				    } else {
				    	long withdraw;
					    System.out.println("Please Enter your Withdraw Amount");
					    withdraw = myObj.nextLong();
					    Withdraw w=new Withdraw();
					    for (String i : Registration.keySet()) {
					        System.out.println("Your Name is "+i);
					        System.out.println("Your Account Number is: "+Registration.get(i));
					      }
					    w.bal(balance,withdraw);
				    }
				    
			    }
			    else
			    {
			    	System.out.println("Please Check your Pin");
			    }
		    }
		    else
		    {
		    	System.out.println("You Entered Wrong Account Number");
		    }
		    
		   // RegisterPin rp=new RegisterPin(pin,accountnum);
		   // rp.pindisplay();
		    
		    
		    
		
	}

}
