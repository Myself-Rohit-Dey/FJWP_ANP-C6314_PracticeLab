package session_5;

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;
    
    //Parameterized Constructor of the BankAccount class
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    //getter and setter methods for accountHolderName variable
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    
    //getter and setter methods for accountNumber variable
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    //getter and setter methods for balance variable
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
    	System.out.println("Amount to be deposited: Rs."+amount);
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amount) {
    	System.out.println("Amount to be withdrawl: Rs."+amount);
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    
    //display method
    public void display() {
    	System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Balance: Rs." + getBalance());
    }

    public static void main(String[] args) {
    	int balance;
    	String status;
    	BankAccount account1 = new BankAccount("Amit Kumar", 987654321, 6000);
        BankAccount account2 = new BankAccount("Ramit Kumar", 657654321, 4000);
        
        account1.display();
        account1.deposit(1000);
        account1.withdraw(2000);
        balance = account1.getBalance();
        status = (balance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("Account Balance: " + account1.getBalance());
        System.out.println("Status: " + status);
        System.out.println("");
       
        account2.display();
        account2.deposit(1000);
        account2.withdraw(2000);
        balance = account2.getBalance();
        status = (balance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("Account Balance: " + account2.getBalance());
        System.out.println("Status: " + status);
    }
}

/*
Output:

Account Holder: Amit Kumar
Account Number: 987654321
Account Balance: Rs.6000
Amount to be deposited: Rs.1000
Deposited Rs.1000
Amount to be withdrawl: Rs.2000
Withdrawn Rs.2000
Account Balance: 5000
Status: Minimum Balance Maintained

Account Holder: Ramit Kumar
Account Number: 657654321
Account Balance: Rs.4000
Amount to be deposited: Rs.1000
Deposited Rs.1000
Amount to be withdrawl: Rs.2000
Withdrawn Rs.2000
Account Balance: 3000
Status: Minimum Balance not Maintained
*/
