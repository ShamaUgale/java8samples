package Anonymous;

/**
 * Anonymous inner classes can be replaced with lambda expressions ionly if they have single abstract methods
 *
 * Anonymous Inner class != Lambdas
 */


public class AnonymousClassExample {

    public static void main(String[] args) {
         Runnable r = new Runnable() {

             public void run() {
                 for (int i = 0; i < 10; i++) {
                    System.out.println("Child - 1 Thread");
                 }
             }
         };

        Runnable r2 = () -> {
             for (int i = 0; i < 10; i++) {
                    System.out.println("Child - 1 Thread");
                }
        };

         Thread t = new Thread(r);
         t.start();

         for (int i = 0; i < 10; i++){
             System.out.println("Main-1 Thread");
         }
        Thread t2 = new Thread(r2);
        t2.start();

        for (int i = 0; i < 10; i++){
            System.out.println("Main-2 Thread");
        }

    }
}
