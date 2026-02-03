class BankAccount{
    private String accholder;
    private double balance;

    //Constructor create
    public BankAccount(String accholder, double balance) {
        this.accholder = accholder;
        this.balance = balance;
    }

    //Getter Method
    public String getAccholder(){
        return accholder;
    }

    //Setter Method
    public void setAccholder(String accholder){
        this.accholder = accholder;
    }

    //Getter Method
    public double getbalance(){
        return balance;
    }

    //Setter with validation
    public void deposit(double amount){
        if( amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid amount balance");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Birat", 650000);

        //Access from getter and setter
        System.out.println(acc.getAccholder() + " balance: " + acc.getbalance());

        acc.deposit(35000);
        System.out.println("After balance: " + acc.getbalance());
    }
}
