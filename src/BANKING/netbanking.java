package BANKING;

public class  netbanking  {
private static double charge_per_email = 0.5;
public static void  nettransfer(Customer customer, double amt,int pin){
    if (customer.checkpin( pin )) {
        if (customer.sufficentbalancee( amt )) {
            double totalCharge = 0.0;
            totalCharge = charge_per_email * customer.getTransaction_count();
            customer.cashoperation( -(amt + totalCharge) );
            customer.increment_transaction();
            System.out.println( "Cash transferd" + amt + "total charge" + totalCharge );
        } else
            System.out.println( "insuffient balance" );
    }
    else
        System.out.println("invalid pin");
}
}
