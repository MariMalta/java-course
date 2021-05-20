package entities;

public class Account {

    private int accountNumber;
    public String name;
    private double amount;

    public Account(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Account(int accountNumber, String name, double amount){
        this.accountNumber = accountNumber;
        this.name = name;
        depositValue(amount);
    }

    public double getAmount() {
        return amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depositValue(double amountDeposit){
        amount += amountDeposit;
    }

    public void withdraw(double amountWithdraw){
        amount -= amountWithdraw + 5.0;
    }
    public String toString(){
        return "Account: " + accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", amount);
    }
}
