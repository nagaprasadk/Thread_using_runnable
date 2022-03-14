public class Main implements Runnable{


    public void run() {
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String args[]) {
        Main t2= new Main();
        Thread t1=new Thread(t2);
        t1.start();
    }
}
