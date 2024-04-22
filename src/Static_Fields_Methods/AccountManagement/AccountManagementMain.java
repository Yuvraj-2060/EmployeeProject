package Static_Fields_Methods.AccountManagement;

public class AccountManagementMain {
    public static void main(String[] args) {

        // Create few accounts
        Account a1 = new Account(123456789,"Yuvraj Singh", 50000 );
        Account a2 = new Account(123456788,"David Gueta", 40000 );
        Account a3 = new Account(123456787,"Robin Kumar", 70000 );

        // Display the no. of accounts created
        a1.showAccountInfo();
        a2.showAccountInfo();
        a3.showAccountInfo();
        Account.noOfAccounts();

        // Do the basic operations(deposit/withdraw)
        a1.deposit(10000);
        a1.withdraw(5000);
        a1.showAccountInfo();
    }
}
