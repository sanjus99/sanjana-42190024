package bankingaccount;
import java.util.*;

public class account {
	//Details of account
		
		String accountnumber;
		String accountholdername;
		String password;
		int mobileno;
		double balance;
		List<String> transactionhistory;
		
		//constructor
		
		account(String accountnumber,String accountholdername,String password,int mobileno,double initialdeposit)
		{
			this.accountnumber=accountnumber;
			this.accountholdername = accountholdername;
			this.password = password;
			this.mobileno = mobileno;
			this.balance = initialdeposit;
			this.transactionhistory = new ArrayList<>();
			addTransaction("Account created with inital deposit of: " + initialdeposit);
		}
		
		// for deposit
		
		void deposit(double amount)
		{
			balance += amount;
			addTransaction("Deposited: " +amount);
		}
		
		//withdraw
		
		void withdraw(double amount)
		{
			if(amount <= balance)
			{
				balance -= amount;
				addTransaction("Amount withdrawn: " +amount);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		
		//authenticate
		public boolean authenticate(String password)
		{
	        return this.password.equals(password);
		}
		
		//checking balance
		
		double getbalance()
		{
			return balance;
		}
		
		//transaction
		
		void Transactionhistory()
		{
			for(String transaction : transactionhistory)
			{
				System.out.println(transaction);
			}
		}
		
		void addTransaction(String transactiondetails)
		{
			transactionhistory.add(transactiondetails);
		}
	}

