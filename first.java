package practices;
//Atm deposit simple ...
class one
{
  int accno;
  String name;
  float amount;
  public void insert(int accno,String name,float amount)
  {
	this.accno=accno;
	this.name=name;
	this.amount=amount;
  }
  public void display()
  {
	  System.out.println("The account details are .."+accno+"/ "+name+"/ "+amount);
  }
  public void checkbalance()
  {
	  System.out.println("balance is "+amount);
  }
  public void deposit(float amt)
  {
	amount+=amt;  
	System.out.println("your amount "+amt+" is deposited");
  }
  public void withdraw(float amt)
  {
	  if(amount<amt)
	  {
		System.out.println("Insufficient Balance");  
	  }
	  else
	  {
		  amount=amount-amt;
		  System.out.println("your amount "+amt+" withdrawn");
	  }
  }
}
public class first
{
	public static void main(String[] args) 
	{
       one obj = new one();
       obj.insert(13212,"vinith",24000);
       obj.display();
       obj.checkbalance();
       obj.deposit(1000);
       obj.checkbalance();
       obj.withdraw(2500);
       obj.checkbalance();
	}
}
