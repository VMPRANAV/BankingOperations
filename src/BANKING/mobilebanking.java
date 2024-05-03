package BANKING;

public class mobilebanking {
private static double charge_per_sms = 0.5;
private static int permittedCount =2;

public  static void mobileTransfer(Customer customer,double amt,int pin) {
 if (customer.checkpin( pin )) {
  if (customer.sufficentbalancee( amt )) {
   double totalCharge = 0.0;

   if (customer.getTransaction_count() > permittedCount){

    totalCharge = (charge_per_sms * 2) * customer.getTransaction_count();}
   else{
    totalCharge = (charge_per_sms) * customer.getTransaction_count();}
   customer.cashoperation( -(amt + totalCharge) );

   System.out.println("Transferred: " + amt + ". Total charge: " + totalCharge);
   customer.increment_transaction();
  } else
   System.out.println( "Insufficent balance" );
 }
 else
  System.out.println("wrong pin");
}
}
