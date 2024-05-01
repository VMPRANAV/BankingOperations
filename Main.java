import BANKING.*;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner s =new Scanner( System.in);
        Scanner scan = new Scanner( System.in);
        String c;
        System.out.print("Enter your name\n");
        String name = s.nextLine();
        Customer customer=new  Customer(name,1000);
        do{

            System.out.print("1.Regular Banking\n2.Mobile banking\n 3. Net Banking\n");
            int ch = scan.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter the choice in regular banking\n 1.Withdraw\n2.Deposit");

                    int ch1 = s.nextInt();
                    if(ch1==1){
                        System.out.print("enter the amount\n enter the account no");

                        int  amt = s.nextInt();
                        int accno = s.nextInt();
                        regularbanking.withdraw(customer,(double) amt,accno );
                        break;
                    }
                    if(ch1==2){
                        System.out.print("enter the amount\n enter the account no");

                        int  amt = s.nextInt();
                        int accno = s.nextInt();
                        regularbanking.deposit(customer,(double) amt,accno );
                        break;
                    }
                    else
                        System.out.println("invalid choice");
                    break;
                case 2:
                    System.out.print("enter pin\n enter amount\n");
                    int pin = s.nextInt();
                    int  amt1 = s.nextInt();
                    mobilebanking.mobileTransfer(customer,amt1,pin);
                    break;
                case 3:
                    System.out.print("enter pin\n enter amount\n");
                    int pin1 = s.nextInt();
                    int  amt2 = s.nextInt();
                    netbanking.nettransfer(customer,amt2,pin1);
                    break;
                default:
                    System.out.println("Invalid choice ");

            }
            customer.customer_details();
            System.out.println("do you want to continue[Y/N]");
            c = s.next();
        }while(c.equalsIgnoreCase("Y"));
    }

}
