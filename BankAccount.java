import java.io.*;
import java.util.Scanner;
class Account
{
	String name;
	long accno;
	double amt;
	Account(String a,long b,double c)
	{
		this.name=a;
		this.accno=b;
		this.amt=c;
	}
	public void account_creat()
	{
		System.out.println("-----Bank Detail-----");
		System.out.println("Name         :"+name);
		System.out.println("Account no   :"+accno);
		System.out.println("Amount       :"+amt);
	}
	public void deposit_amount(int val)
	{
		amt=amt+val;
		System.out.println("Amount Balance:"+amt);
	}
	public void withdraw_amount(int valu)
	{
		if(amt-valu<=500)
		{
			System.out.println("Insufficiant balance.....");
		}
		else
		{
			amt=amt-valu;
			System.out.println("Collect your Cash:"+valu);
			System.out.println("Avalable Cash:"+amt);
		}
	}
}
class BankAccount
{
	public static void main(String[] args) 
	{
		int choice,i,amt;
		Scanner in = new Scanner(System.in);
		System.out.print("\n---------------------------");
		System.out.print("\n\tState Bank");
		System.out.print("\n---------------------------");
		System.out.print("\n1.Account Creation");
		System.out.print("\n2.Deposit");
		System.out.print("\n3.Withdraw");
		System.out.print("\n4.Balance Enquiry");
		System.out.println("\n----------------------------");

		Account o = new Account("raja",121174025478L,500);
		do
		{
			System.out.println("Enter your choice");
			choice=in.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Account Created.....");
				o.account_creat();
				break;

				case 2:
				System.out.println("Deposit");
				System.out.println("Enter your amount to deposit");
				amt=in.nextInt();
				o.deposit_amount(amt);
				break;

				case 3:
				System.out.println("Enter Amount to Withdraw");
				amt=in.nextInt();
				o.withdraw_amount(amt);
				break;

				case 4:
				System.out.println("Balance Enquiry");
				o.account_creat();
				break;
			}
			System.out.println("Do you want to Continue...press 1");
			i=in.nextInt();
		}
		while(i==1);
		System.out.println("Thank You");
		
	}
}
