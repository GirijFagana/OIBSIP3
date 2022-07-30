 import java.util.*;

public class ATM 
{
    
    public static void main(String args[]) {
        int ABalance = 20000, Wd, Dp;
        System.out.println("WELCOME TO SBI ATM SERVISE...!");
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        while (true)
         {
            System.out.println(" 1->  Withdraw");
            System.out.println(" 2->  Deposit");
            System.out.println(" 3->  Check Balance");
            System.out.println(" 4->  Exit");
            System.out.print("Choose the operation you want to perform : ");

            int choice = sc.nextInt();
            switch (choice)
             {
                case 1:
                    System.out.print("Enter money to be Withdraw:");
                    Wd = sc.nextInt();
                    if (ABalance >= Wd) {
                        ABalance = ABalance - Wd;
                        System.out.println("Withdrawl Succesful..");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("\n");
                    System.out.println("NOW YOUR CURRENT AVAILABLE BALANCE IS "+ABalance);
                    System.out.println("\n");
                    System.out.println(" ");
                    break;

                case 2:

                    System.out.println("Enter money to be deposited...");
                    Dp = sc.nextInt();

                    ABalance = ABalance + Dp;
                    System.out.println("\n");
                    System.out.println("Your Money has been successfully depsited...");
                    System.out.println("\n");
                    System.out.println("YOUR ACCOUNT BALANCE IS : " + ABalance);
                    System.out.println("");
                    break;

                case 3:
                System.out.println("\n");
                    System.out.println("YOUR ACCOUNT BALANCE IS : " + ABalance );
                    System.out.println("\n");
                    System.out.println("");
                    break;
                
                case 4:
                   System.exit(0);
                   System.out.println("");
                   break;

                default: 
                    System.out.println("**You Entered Wrong Choice...!**");
                    System.out.println("");
                    break;
            }
        }
    }
} 