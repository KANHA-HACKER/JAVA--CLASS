import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
    private static int accountNumberCounter = 1000;
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Account currentAccount = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank Application ATM Simulation");

        int choice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Select Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. View Transactions");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = scanner.nextLine();
                    int accountNumber = generateAccountNumber();
                    Account newAccount = new Account(name, accountNumber);
                    accounts.add(newAccount);
                    currentAccount = newAccount;
                    System.out.println("Account created successfully. Your account number is: " + accountNumber);
                    break;
                case 2:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts available. Please create an account first.");
                    } else {
                        System.out.println("Available accounts:");
                        for (Account acc : accounts) {
                            System.out.println("Account Number: " + acc.getAccountNumber() + ", Name: " + acc.getName());
                        }
                        System.out.print("Enter account number to select: ");
                        int accNum = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        currentAccount = null;
                        for (Account acc : accounts) {
                            if (acc.getAccountNumber() == accNum) {
                                currentAccount = acc;
                                break;
                            }
                        }
                        if (currentAccount != null) {
                            System.out.println("Account selected: " + currentAccount.getName());
                        } else {
                            System.out.println("Account not found.");
                        }
                    }
                    break;
                case 3:
                    if (checkAccountSelected()) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline after nextDouble()
                        currentAccount.deposit(depositAmount);
                    }
                    break;
                case 4:
                    if (checkAccountSelected()) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline after nextDouble()
                        currentAccount.withdraw(withdrawAmount);
                    }
                    break;
                case 5:
                    if (checkAccountSelected()) {
                        currentAccount.checkBalance();
                    }
                    break;
                case 6:
                    if (checkAccountSelected()) {
                        currentAccount.showTransactionHistory();
                    }
                    break;
                case 7:
                    System.out.println("Thank you for using the Bank Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static boolean checkAccountSelected() {
        if (currentAccount == null) {
            System.out.println("No account selected. Please select an account first.");
            return false;
        }
        return true;
    }

    private static int generateAccountNumber() {
        return accountNumberCounter++;
    }
}
