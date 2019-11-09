/**
 * @author Abhishek Jain
 */

class ThreadUsingRunnableInterface implements Runnable{
    public void run() {
        System.out.println("Printing Hello from class - ThreadUsingRunnableInterface");
    }
}

class ThreadUsingThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Printing Hello from class - ThreadUsingThreadClass");
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        System.out.println("##### Java Thread creation using Thread class & Runnable interface ####");
        ThreadUsingRunnableInterface threadUsingRunnableInterface = new ThreadUsingRunnableInterface();
        Thread thread1 = new Thread(threadUsingRunnableInterface, "threadUsingRunnableInterface");
        thread1.start();

        ThreadUsingThreadClass threadUsingThreadClass = new ThreadUsingThreadClass();
        Thread thread2 = new Thread(threadUsingThreadClass, "threadUsingThreadClass");
        thread2.start();
    }
}
