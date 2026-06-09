public class Program {
        public static void main(String[] args) {
            try {
                FeeBasedBankAccount account1 = new FeeBasedBankAccount("AAA", 30.0);
                System.out.printf("Account %s - balance: %.2f\n", account1.getAccountNumber(), account1.getBalance());
                account1.deposit(125);
                System.out.printf("Account %s - balance: %.2f\n", account1.getAccountNumber(), account1.getBalance());
                account1.withdraw(30);
                System.out.printf("Account %s - balance: %.2f\n", account1.getAccountNumber(), account1.getBalance());
                account1.deposit(10);
                System.out.printf("Account %s - balance: %.2f\n", account1.getAccountNumber(), account1.getBalance());
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n");
            }

            try {
                ControlledBankAccount account2 = new ControlledBankAccount("BBB", 30.0, 20, 5);
                System.out.printf("Account %s - balance: %.2f\n", account2.getAccountNumber(), account2.getBalance());
                account2.deposit(125);
                System.out.printf("Account %s - balance: %.2f\n", account2.getAccountNumber(), account2.getBalance());
                account2.withdraw(105);
                System.out.printf("Account %s - balance: %.2f\n", account2.getAccountNumber(), account2.getBalance());
                account2.applyMonthlyUpdate();
                System.out.printf("Account %s - balance: %.2f\n", account2.getAccountNumber(), account2.getBalance());
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n");
            }

            try {
                ControlledBankAccount account3 = new ControlledBankAccount("CCC", 30.0, 20, 5);
                System.out.printf("Account %s - balance: %.2f\n", account3.getAccountNumber(), account3.getBalance());
                account3.deposit(125);
                System.out.printf("Account %s - balance: %.2f\n", account3.getAccountNumber(), account3.getBalance());
                account3.withdraw(106);
                System.out.printf("Account %s - balance: %.2f\n", account3.getAccountNumber(), account3.getBalance());
                account3.applyMonthlyUpdate();
                System.out.printf("Account %s - balance: %.2f\n", account3.getAccountNumber(), account3.getBalance());
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n");
            }
        }
    }