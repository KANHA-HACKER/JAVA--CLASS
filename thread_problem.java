/*class myrumble implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}
public class thread_problem {
    public static void main(String[] args) {
        myrumble myRumble = new myrumble();
        Runnable obj = myRumble;
        Thread t1 =new Thread(obj);
        t1.start();
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}*/
 class withdrawl extends Thread {
    static int totbalance = 10000;
    int amount;
    // Constructor to initialize the amount to withdraw
    withdrawl(int amount) {
        this.amount = amount;
    }
    public void run() {
        if (totbalance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            totbalance -= amount;
            System.out.println("Remaining balance: " + totbalance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ". Insufficient balance.");
        }
    }
 }
 public class thread_problem {
    public static void main(String[] args) {
       // myrumble myRumble = new myrumble();
        //Runnable obj = (Runnable) myRumble;
        //Thread t1 =new Thread(obj);
        //t1.start();
        //System.out.println(Thread.currentThread().getName() + " is running.");
        withdrawl w1 = new withdrawl(500);
        withdrawl w2 = new withdrawl(600);
        w1.start();
        w2.start();
        try {
            w1.join();
            w2.join();
        } catch (Exception e) {
            e.printStackTrace();
           
        }
    }
}

 //code to 