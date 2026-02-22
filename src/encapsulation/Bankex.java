package encapsulation;

class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    final double rate=5;
    private double interest;

    BankAccount(int accountNumber, String accountHolderName){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        balance=0;
    }

    public int getAcNumber(){
        return accountNumber;
    }
    public String getAcHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance>0){
            this.balance=balance;
        }
    }
    public void setAccountHolderName(String accountHolderName){
        if(accountHolderName.length()>0){
            this.accountHolderName=accountHolderName;
        }
    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    void withdraw(double amount){
        if(balance>0 && amount<=balance){
            balance-=amount;
        }
    }

    public double getInterestRate(){
         interest=((balance*rate)/100);
         return interest;
    }

}

public class Bankex {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1222,"rahul");
        acc.setBalance(10000);
        acc.setAccountHolderName("raj");
        acc.deposit(1000);
        acc.withdraw(3001);

        System.out.println(acc.getAcHolderName()+" "+acc.getAcNumber()+" "+acc.getBalance()+" "+acc.getInterestRate());

    }
    
}
