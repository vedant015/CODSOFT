import java.util.Scanner;
public class Task3 {
    private double balance;

    public Task3(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if (amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }
}

class ATM{
    private Task3 account;

    public ATM(Task3 account){
        this.account = account;
    }

    public void displayMenu(){
        System.out.println("ATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void transaction(){
        while (true){
            displayMenu();
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();

            switch (select){
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmt = scanner.nextDouble();
                    if (account.withdraw(withdrawAmt)){
                        System.out.println("Transaction successful. New Balance: "+account.getBalance());
                    }else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 2:

            }
        }
    }
}
