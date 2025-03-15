public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0){
            this.balance = balance;
        }
        else {
            this.balance = 0;
            System.out.println("invalid balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        if (amount >= 0 ){
            this.balance = amount;
        }
        else {
            System.out.println("invalid");
        }

    }
}
