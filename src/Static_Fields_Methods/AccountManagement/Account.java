package Static_Fields_Methods.AccountManagement;

public class Account {

    private long accountNo;
    private String customerName;
    private double balance;

    public Account(long accountNo, String customerName, double balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance +=amount;
    }

    public void withdraw(double amount){
        if(amount<balance)
            balance -=amount;
        else
            System.out.println("There is no suffient balance in you account");
    }

    public void showAccountInfo(){
        System.out.println("------ Acoount Details ------\n");
        System.out.println("Account Number : "+ accountNo);
        System.out.println("Account Holder Name : "+ customerName);
        System.out.println("Account Balance : "+ balance);
    }

}
