package BANKING;

public class regularbanking {
    public static void withdraw(Customer customer,double amt,int enterAccNo) {
        if (customer.checkAccountno( enterAccNo )) {
        if (amt > 0) {
            customer.cashoperation( -amt );
            customer.increment_transaction();
            System.out.println("withdraw amount"+amt);
        }
         else if (customer.sufficentbalancee( amt )) {
            System.out.println("Withdraw  amount is greater than the balance");else
            System.out.println( "Entered amount is invalid" );
    }else
            System.out.println("Invalid Account number");
    }
    public static void deposit( Customer customer,double amt ,int enterAccNo) {
        if (customer.checkAccountno( enterAccNo )) {
            if (amt > 0) {
                customer.cashoperation( amt );
                customer.increment_transaction();
                System.out.println("deposited amount"+amt);
            } else
                System.out.println( "Entered amount is invalid" );
        }
        else
            System.out.println("Invalid Account no");
    }
}
