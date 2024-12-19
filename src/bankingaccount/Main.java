package bankingaccount;
import java.util.*;

public class Main {
	public static void main(String[] args) {
			bank bank = new bank();
			Scanner in = new Scanner(System.in);
			while(true)
			{
				System.out.println("\nBanking System Menu: ");
				System.out.println("1.Create Account");
				System.out.println("2.Login");
				System.out.println("3.Exit");
				System.out.println();
				System.out.println("Enter Your choice: ");
				
				//get choice
				int choice = in.nextInt();
				in.nextLine();
				switch(choice)
				{
				case 1:
				{
					bank.createaccount();
					break;
				}
				
				case 2:
				{
					bank.login();
					break;
				}
				
				case 3:
				{
					System.out.println("Thank you");
					return;
				}
				
				default:
					System.out.println("Invalid choice");
				}
			}
		}
	}


