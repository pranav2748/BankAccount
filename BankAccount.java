public class BankAccount
  { //instance variables 
    private String name;
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;
//constructor 
  public BankAccount(String name, int accountNum, double balance, String password){
    this.name = name;
    this.accountNum = accountNum;
    this.balance = balance;
    this.password = password;
    this.loggedIn = false;
  }
  //mutator method- change the value of a private instance variable 
  // change the value of loggedIn but only if username and password is correct 
  public boolean logIn(String username, String password)
  {
    if (username.equals(this.name) && password.equals(this.password))
    {
      loggedIn = true;
      return true;
    }
    else
    {
      return false;
    }
  }

  //accessor method
  public double getBalance()
  {
    if (loggedIn == true)
    {
      return balance;
    }
    else
    {
      throw new IllegalStateException( "Not logged in");
    }

  }
  public double deposit(double amount)
  {
    if (loggedIn == true)
    {
      balance += amount ;
      return balance;
    }
    else 
    {
      throw new IllegalStateException( "Not logged in");
    }
  }
  public double withdrawl(double amount)
  {
    if (loggedIn == true)
    {
      balance -= amount;
      return balance;

    }
    else 
    {
      throw new IllegalStateException( "Not logged in");
    }
  }

public void logOut()
{

}

  public String toString()
  {
    if (loggedIn == false)
    {
      return "Account Number: " + this.accountNum;
    }
    else
    {
      return "Balance: " + this.balance + "Account Number: " + this.accountNum;
    }
  


  }

  }


