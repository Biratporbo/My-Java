// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Threads are running: " + Thread.currentThread().getName());
//     }

//     public class Intro{
//         public static void main(String[] args) {
//             MyThread t1 = new MyThread();

//             t1.start();
//         }
//     }
// }


//MultiThreads Example ---->
// class Task extends Thread{
//     private String taskname;

//     Task(String taskname){
//         this.taskname = taskname;
//     }

//     public void run(){
//         for(int i=1; i<=3; i++){
//             System.out.println(taskname + " running: " + i);
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Intro{
//     public static void main(String[] args) {
//         Task t1 = new Task("Task-1");
//         Task t2 = new Task("Task-2");

//         t1.start();
//         t2.start();
//     }
// }



//Basic of Threads Example---->

//Example-1
// class MyRunnable implements Runnable{
//     public void run(){
//         System.out.println("Thraed running: " + Thread.currentThread().getName());
//     }
// }
//     public class Intro{
//         public static void main(String[] args) {
//             Thread t1 = new Thread(new MyRunnable());
//             t1.start();
//         }
//     }

//Example-2
// class PrintNumbers extends Thread{
//     public void run(){
//         for(int i=1; i<=5; i++){
//             System.out.println(Thread.currentThread().getName() + " ->" + i);
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Intro{
//     public static void main(String[] args) {
//         PrintNumbers t1 = new PrintNumbers();
//         PrintNumbers t2 = new PrintNumbers();

//         t1.setName("Thread-1");
//         t2.setName("Thread-2");

//         t1.start();
//         t2.start();
//     }
// }

//Example-3
// class OrderProccess implements Runnable{
//     private String orderId;

//     OrderProccess(String orderId){
//         this.orderId = orderId;
//     }

//     public void run(){
//         System.out.println("Proceessing order: " + orderId + " by " + Thread.currentThread().getName());
//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println("Order Completed: " + orderId);
//     }
// }

// public class Intro{
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new OrderProccess("ORD-101"));
//         Thread t2 = new Thread(new OrderProccess("ORD-102"));
//         Thread t3 = new Thread(new OrderProccess("ORD-103"));
//         Thread t4 = new Thread(new OrderProccess("ORD-104"));

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
        
//     }
// }

