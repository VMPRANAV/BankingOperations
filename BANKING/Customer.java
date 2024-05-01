package BANKING;

import BANKING.*;
public class Customer{
   
    private int accno=1234567890;
    private int pin =4321;
    private String name;
    private double account_balance;
    private int transaction_count;
    public Customer(String name, double initialBalance) {
        this.name = name;
        this.account_balance = initialBalance;
        this.transaction_count= 0;
    }
    public boolean checkpin(int  enter_pin){
        if(enter_pin==pin)
            return true;
        else
            return false;
    }
public boolean checkAccountno(int enteracc_no){
    if(enteracc_no==accno)
        return true;
    else
        return false;
}
public double getAccount_balance() {
        return account_balance;
    }
    public String getName(){
        return name;
    }

    public int  getTransaction_count() {
        return transaction_count;
    }
    public void cashoperation(double amount ){
        account_balance += amount;

    }
    public void increment_transaction()
    {
        ++transaction_count;

    }
    public  boolean sufficentbalancee(double amt){
   if( account_balance >= amt)
       return  true;
   else return false;
    }

    public void  customer_details(){
        System.out.println("Name :"+name);
        System.out.println("Account Balance: "+account_balance);
        System.out.println("Transcatiion count: "+(transaction_count));}
}

