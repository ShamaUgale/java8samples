package Lambdas;/*

java.util.function is a package having predefined FI

 */


class MyRunnable implements Runnable{

    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("Child-0 thread");
        }
    }

}



public class LamdasWithMutiThreadExample {

    public static void main(String[] args){ // 1st thread - main thread
        System.out.println("Creating thread without using lambdas");

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start(); // -- 2nd thread - child thread
        for (int i = 0; i < 10; i++){
            System.out.println("Main thread");
        }

        System.out.println("Creating thread using lambdas");

        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child-1 thread");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();


    }
}
