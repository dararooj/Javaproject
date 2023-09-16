package Thread;

public class MyThread2 implements  Runnable{
    @Override
    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        MyThread2 m1=new MyThread2();
        Thread t1 =new Thread(m1);
        t1.start();
}
}
