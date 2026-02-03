//Without Inter Thread Communication ----> Problem
// class Shared{
//     public int data;
//     private boolean available = false;

//     public synchronized void produce(int value){
//         data = value;
//         System.out.println("Produced: " + value);
//     }

//     public synchronized void consume(){
//         System.out.println("Consumed: " + data);
//     }
// }


// public class intthreadCommun{
//     public static void main(String[] args) {
//         Shared obj = new Shared();

//         new Thread(() -> {
//             for(int i=1; i<=5; i++){
//                 obj.produce(i);
//             }
//         }).start();

//         new Thread(() ->{
//             for (int i=1; i<=5; i++){         
//             }
//         }).start();
//     }    
// }


//With Inter Thread Correct Solution ----->
class Shared{
    private int data;
    private boolean available = false;

    public synchronized void produce(int value){
        while(available){
            try{ wait(); } catch(InterruptedException e) {}
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume(int value){
        while(!available){
            try{ wait(); } catch(InterruptedException e) {}
        }
        System.out.println("Consumed: " + value);
        available = false;
        notify();
    }
}

public class intthreadCommun{
    public static void main(String[] args) {
        Shared obj = new Shared();
        
        Thread producer = new Thread(()->{
            for(int i = 1; i<= 5; i++) obj.produce(i);
        });

        Thread consumer = new Thread(() ->{
            for(int i=1; i<=5; i++) obj.consume(i);
        });
        
        producer.start();
        consumer.start();
    }
}