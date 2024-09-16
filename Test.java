public class Test
{
    public static void main(String[] args)
    {
        BankAccount savings = new BankAccount( "Pranav", 59423 , 32546323,  "Hello");
        savings.logIn("Pranav", "Hello");
        System.out.println(savings.getBalance());
        savings.deposit(500);
        System.out.println(savings.getBalance());



    }

}