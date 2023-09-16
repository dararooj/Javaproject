package Thread;

public class MyThread1 extends Thread {

    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
            MyThread1 a = new MyThread1();
            a.start();
//        System.out.println("parent thread");
   }
}