public class Account {
    private String id, name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int debit(int amount){
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid, Enter a correct amount\n Your Balance: ");
        return balance;
    }
    public int credit(int amount){
        if (amount > 0 && amount < balance)
            balance -= amount;
        else
            System.out.println("Invalid, Enter a correct amount");
        return balance;
    }
    public int transferTo(Account another, int amount){
        if (amount > 0 && amount < balance) {
            another.balance += amount;
            balance -= amount;
        }
        else
            System.out.println("Unable to make the transaction");
        return balance;
    }

    @Override
    public String toString() {
        return "Account info: \n" +
                "ID : " + id +
                "\nName : " + name +
                "\nBalance : " + balance +
                "\n";
    }
}
