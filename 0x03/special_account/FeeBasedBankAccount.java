import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {

    private int transactionCount;

    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
        this.transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        transactionCount++;
        applyFee();
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        transactionCount++;
        applyFee();
    }

    private void applyFee() throws InvalidOperationException {
        try {
            super.withdraw(0.10);
        } catch (InvalidOperationException e) {
            // ignore fee failure
        }
    }
}