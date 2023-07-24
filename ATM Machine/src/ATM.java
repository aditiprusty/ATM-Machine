import java.util.*;
public class ATM
{
    public static void main(String args[])
    { 
        int balance = 5000, withdraw, deposit;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("***ATM - Bank of Odisha***");
            System.out.println("Enter 1 to Withdraw Money");
            System.out.println("Enter 2 to Deposit Money");
            System.out.println("Enter 3 to view Current Balance");
            System.out.println("Enter 4 to EXIT");
            System.out.print("Select/Enter the operation you want to perform:");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                	System.out.println();
                	System.out.print("Enter amount to be withdrawn:");
	                withdraw = sc.nextInt();
	                if(balance >= withdraw)
	                {
	                    balance = balance - withdraw;
	                    System.out.println("Please collect your amount");
	                    System.out.println("New Balance : "+balance);
	                }
	                else
	                {
	                    System.out.println("Insufficient Balance, balance cannot be negative");
	                    System.out.println("Current Balance : "+balance);
	                }
	                System.out.println("");
	                break;
 
                case 2:
                	System.out.println();
                	System.out.print("Enter amount to be deposited:");
	                deposit = sc.nextInt();
	                balance = balance + deposit;
	                System.out.println("Your amount has been successfully deposited");
	                System.out.println("New Balance : "+balance);
	                System.out.println("");
	                break;
 
                case 3:
                	System.out.println();
                	System.out.println("Current Balance : "+balance);
                	System.out.println();
                	break;
 
                case 4:
                	System.out.println();
                	System.out.println("Thank you for using our services! Have a good day!");
                	System.exit(0);
            }
        }
    }
}