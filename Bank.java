import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Accounts {
    String name;
    int accountNumber;
    int accountBalance;

    Accounts(String name, int accountNumber, int accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    void addMoney(int money) {
        accountBalance += money;
    }

    void subMoney(int money) {
        if (accountBalance >= money) {
            accountBalance -= money;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + accountBalance);
    }
}

public class Bank {
    public static void main(String[] args) {
        ArrayList<Accounts> bankAccounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Adding accounts loop
        System.out.print("Do you want to add account? (true/false): ");
        boolean bn = sc.nextBoolean();

        while (bn) {
            System.out.print("Enter Name: ");
            String name = sc.next();
            int accountNumber = rand.nextInt(10000);  // Generating random account number
            int accountBalance = 1000;
            Accounts obj = new Accounts(name, accountNumber, accountBalance);
            bankAccounts.add(obj);

            System.out.print("Do you want to add another account? (true/false): ");
            bn = sc.nextBoolean();
        }

        boolean continueOperations = true;

        while (continueOperations) {
            System.out.println("What activities do you want to perform? (remove/addMoney/withDraw/display)");
            String action = sc.next();

            switch (action) {
                case "remove":
                    System.out.print("Enter account name which you want to remove: ");
                    String nameToRemove = sc.next();
                    boolean removed = false;
                    for (int i = 0; i < bankAccounts.size(); i++) {
                        if (bankAccounts.get(i).name.equals(nameToRemove)) {
                            bankAccounts.remove(i);
                            removed = true;
                            System.out.println("Account removed.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Account not found.");
                    }
                    break;

                case "withDraw":
                    System.out.print("Enter account name for withdrawal: ");
                    String nameToWithdraw = sc.next();
                    System.out.print("Enter the amount you want to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    boolean foundWithdraw = false;
                    for (Accounts acc : bankAccounts) {
                        if (acc.name.equals(nameToWithdraw)) {
                            acc.subMoney(withdrawAmount);
                            foundWithdraw = true;
                            break;
                        }
                    }
                    if (!foundWithdraw) {
                        System.out.println("Account not found.");
                    }
                    break;

                case "addMoney":
                    System.out.print("Enter account name for deposit: ");
                    String nameToAdd = sc.next();
                    System.out.print("Enter the amount you want to add: ");
                    int addAmount = sc.nextInt();
                    boolean foundAdd = false;
                    for (Accounts acc : bankAccounts) {
                        if (acc.name.equals(nameToAdd)) {
                            acc.addMoney(addAmount);
                            foundAdd = true;
                            break;
                        }
                    }
                    if (!foundAdd) {
                        System.out.println("Account not found.");
                    }
                    break;

                case "display":
                    System.out.print("Enter account name to display details: ");
                    String nameToDisplay = sc.next();
                    boolean foundDisplay = false;
                    for (Accounts acc : bankAccounts) {
                        if (acc.name.equals(nameToDisplay)) {
                            acc.display();
                            foundDisplay = true;
                            break;
                        }
                    }
                    if (!foundDisplay) {
                        System.out.println("Account not found.");
                    }
                    break;

                default:
                    System.out.println("Invalid action. Please choose a valid operation.");
                    break;
            }

            System.out.print("Do you want to continue performing tasks? (true/false): ");
            continueOperations = sc.nextBoolean();
        }

        System.out.println("Thank you for using the bank system.");
        sc.close();
    }
}
