package bankingaccount;

import java.util.*;

public class bank {
	Map<String, account> accounts = new HashMap<>();
	Scanner in = new Scanner(System.in);
	
	//creating account
	
	void createaccount()
	{
		System.out.print("Enter Name: ");
		String name = in.nextLine();
		//.nextLine();
		
		System.out.print("Enter password: ");
		String password = in.nextLine();
		
		in.nextLine();
		System.out.print("Enter Mobile no. : ");
		int mobileno = in.nextInt();
		
		System.out.print("Enter initial deposit: ");
		double initialdeposit = in.nextDouble();
		
		String accountnumber = "ACC";
	    account account = new account(accountnumber, name, password,mobileno, initialdeposit);
	    accounts.put(accountnumber, account);
	    System.out.println("Account created! Account Number: " + accountnumber);	
	}
	
	void login() 
	{
		System.out.print("Enter account number: ");
		String accountnumber = in.nextLine();
		in.nextLine();
		System.out.print("Enter password: ");
		String password = in.nextLine();
		
		account account = accounts.get(accountnumber);
	    if (account != null && account.authenticate(password)) {
	        System.out.println("Login successful!");
	        manageAccount(account);
	    } 
	    else 
	    {
	        System.out.println("Invalid Credentials");
	    }
	
	}
	
	void manageAccount(account account)
	{
		while(true)
		{
			System.out.println(" \nAccount Menu: ");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.View Balance");
			System.out.println("4.View Transaction History");
			System.out.println("5.Logout");
			System.out.println();
			System.out.println("Enter your choice: ");
			
			// get choice
			
			int choice = in.nextInt();
			//.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Amount to Deposit: ");
				account.deposit(in.nextDouble());
				System.out.println("Balance: " );
				break;
				
			
			case 2:
			{
				System.out.println("Enter Amount To Withdraw:");
				account.withdraw(in.nextDouble());
				break;
			}
			
			case 3:
			{
				System.out.println("Balance: " + account.getbalance());
                break;
			}
                
            case 4:
            {
            	account.Transactionhistory();
                break;
            }
                
            case 5:
            {
            	System.out.println("Logged out.");
                return;
            }
               
            default:
                System.out.println("Invalid choice.");
			}
		}
	}
}