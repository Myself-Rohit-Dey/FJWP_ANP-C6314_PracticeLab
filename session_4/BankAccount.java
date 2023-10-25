package session_4;

interface BankOperations {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

//subclass inherits interface
class BankAccount implements BankOperations {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;
    
    //Parameterized constructor
    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }
    
    //getter methods
    public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getBankName() {
		return bankName;
	}
	
	//overriding abstract getBalance method which implemented from BanlOperations interface
	@Override
    public double getBalance() {
        return accountBalance;
    }
	
	//overriding abstract deposit method which implemented from BanlOperations interface
    @Override
    public void deposit(double amount) {
    	System.out.println("Amount to be deposited:"+amount);
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited Rs." + amount);
            System.out.println("Account Balance: Rs." + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    //overriding abstract withdraw method which implemented from BanlOperations interface
    @Override
    public void withdraw(double amount) {
    	System.out.println("Amount to be Withdrawn:"+amount);
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn Rs" + amount);
            System.out.println("Account Balance: Rs." + accountBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    //displaying Account details
    public void display() {
    	System.out.println("Account Holder:"+getAccountHolderName());
    	System.out.println("Bank: "+getBankName());
    	System.out.println("Account Balance:"+getBalance());
    }

    public static void main(String[] args) {
        // Created three bank accounts with different account holders and initial balances
        BankAccount acc1 = new BankAccount("Amit Sarkar", "ICICI", 1000.0);
        BankAccount acc2 = new BankAccount("Sumit Karar", "HDFC", 1500.0);
        BankAccount acc3 = new BankAccount("Ramit Jana", "SBI", 2000.0);

        // Deposit and withdraw money for each account with account balance, account holder name and bank name
        acc1.display();
        acc1.deposit(500.0);
        acc1.withdraw(200.0);
        System.out.println("");
        
        acc2.display();
        acc2.deposit(1000.0);
        acc2.withdraw(800.0);
        System.out.println("");
        
        acc3.display();
        acc3.deposit(200.0);
        acc3.withdraw(3000.0);
    }
}

/*
Output:

Account Holder:Amit Sarkar
Bank: ICICI
Account Balance:1000.0
Amount to be deposited:500.0
Deposited Rs.500.0
Account Balance: Rs.1500.0
Amount to be Withdrawn:200.0
Withdrawn Rs200.0
Account Balance: Rs.1300.0

Account Holder:Sumit Karar
Bank: HDFC
Account Balance:1500.0
Amount to be deposited:1000.0
Deposited Rs.1000.0
Account Balance: Rs.2500.0
Amount to be Withdrawn:800.0
Withdrawn Rs800.0
Account Balance: Rs.1700.0

Account Holder:Ramit Jana
Bank: SBI
Account Balance:2000.0
Amount to be deposited:200.0
Deposited Rs.200.0
Account Balance: Rs.2200.0
Amount to be Withdrawn:3000.0
Invalid withdrawal amount or insufficient balance.

*/

