public class Checking extends Account {
    @Override
    public AccountType getAccountType() {
        return AccountType.Checking;
    }

    @Override
    public double getTransactionFee(AccountType accountType) {
        return 5.0;
    }
}
