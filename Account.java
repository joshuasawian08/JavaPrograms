interface Bank {
    void getBankName();
    void getInterestRate();
}

class Customer {
    String name = "Rahul";

    void getCustomer() {
        System.out.println("Customer Name: " + name);
    }
}

class Account extends Customer implements Bank {
    int accNo = 101;
    double balance = 5000;

    public void getBankName() {
        System.out.println("Bank: HDFC Bank");
    }
c
    public void getInterestRate() {
        System.out.println("Interest Rate: 5%");
    }

    void getAccountDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account obj = new Account();
        obj.getBankName();
        obj.getInterestRate();
        obj.getCustomer();
        obj.getAccountDetails();
    }
}