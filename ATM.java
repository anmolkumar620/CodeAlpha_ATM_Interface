import java.util.*;
public class ATM
{
	private static int balance = 1000;
	public static void withdraw(int amount)
	{
		if(amount <= balance) {balance = balance - amount; System.out.println("Amount is withdrawn successfully"); }
		else System.out.println("Insufficient Balance");
	}
	public static void deposit(int amount)
	{
		balance = balance + amount;
		System.out.println("Amount is deposited successfully");
	}
	
	public static void checkBal()
	{
		System.out.println("Balance in your Account is: " + balance);
	}

	public static void main (String args[])
	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while(choice != 4)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            choice = sc.nextInt(); 
            if (choice == 1)
             {
            	System.out.println("Enter Amount to Withdraw : ");
            	int amount = sc.nextInt();
            	withdraw(amount);
            
             } 
             else if (choice == 2) 
             {
            	System.out.println("Enter Amount to Deposit : ");
            	int amount = sc.nextInt();
            	deposit(amount);
            
             } 
             else if (choice == 3) { checkBal();}
             
            } 
	}
}
