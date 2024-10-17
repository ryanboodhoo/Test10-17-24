public class Savings extends Account{
    @Override
    public AccountType getAccountType() {
        return AccountType.Savings;
    }

    @Override
    public double getTransactionFee(AccountType accountType) {
        return 10.0;
    }
    }
