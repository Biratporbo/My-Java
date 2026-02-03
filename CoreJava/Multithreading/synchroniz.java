//Example-1 Multithread Synchronize Method
// class Counter{
//     private int count = 0;
    
//     public synchronized void increment(){
//         count++;
//     }

//     public int getCount(){
//         return count;
//     }
// }

// public class synchroniz {
//     public static void main(String[] args) throws InterruptedException {
//         Counter counter = new Counter();
        
//         Thread t1 = new Thread(() -> {
//             for(int i=0; i<1000; i++) counter.increment();
//         });

//         Thread t2 = new Thread(() ->{
//             for(int i=0; i<1000; i++) counter.increment();
//         });

//         t1.start();
//         t2.start();
//         t1.join();
//         t2.join();

//         System.out.println("Final count: " + counter.getCount());
//     }
// }


//Example of Race Condition (No Synchronized):
// class Shared{
//     int count = 0;
//     void increment(){
//         count++;
//     }
// }

// public class synchroniz{
//     public static void main(String[] args) throws InterruptedException{
//         Shared obj = new Shared();

//         Thread t1 = new Thread(() -> { for(int i=0; i<1000; i++) obj.increment(); });
//         Thread t2 = new Thread(() -> { for(int i=0; i<1000; i++) obj.increment(); });

//         t1.start();
//         t2.start();
//         t1.join();
//         t2.join();

//         System.out.println("Final Count = " + obj.count); // not always 2000
//     }
// }

//Example of Real-World --->
class BankAccount{
    private int balance = 0;

    public synchronized void withdraw(String user, int amount){
        if(balance >= amount){
            System.out.println(user + " is withdrawing " + amount);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
            balance -= amount;
            System.out.println(user + " is completed withdraw. Remaining Balance: " + balance);
        } else {
            System.out.println(user + " - Insufficient funds!");
        }
    }
}

public class synchroniz{
    public static void main(String[] args){
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw("Allice",5000));
        Thread t2 = new Thread(() -> account.withdraw("Bob", 6000));
        
        t1.start();
        t2.start();
    }
}