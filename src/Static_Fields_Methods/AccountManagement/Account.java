package Static_Fields_Methods.AccountManagement;

public class Account {

    private long accountNo;
    private String customerName;
    private double balance;
    static int  noOfAccount;

    public Account(long accountNo, String customerName, double balance) {
        noOfAccount++;
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance +=amount;
    }

    public void withdraw(double amount){
        if(amount <= 0)
            throw new IllegalArgumentException("Withdrawal amount must be positive");

        if(amount <= balance)
            balance -= amount;
        else
            throw new IllegalArgumentException("Insufficient balance in your account");
    }


    public void showAccountInfo(){
        System.out.println("------ Acoount Details ------\n");
        System.out.println("Account Number : "+ accountNo);
        System.out.println("Account Holder Name : "+ customerName);
        System.out.println("Account Balance : "+ balance);
    }
    public static void noOfAccounts(){
        System.out.println("\nThe no. of account created is: "+ noOfAccount+"\n");
    }

}
