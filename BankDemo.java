class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankDemo {
    public static void main(String[] args) {
        double balance = 1000;
        double withdraw = 1500;

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance"
                );
            }

            balance = balance - withdraw;
            System.out.println("Remaining balance: " + balance);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

