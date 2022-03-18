class HumanGreeting extends Thread{
    public HumanGreeting(String threadName) {
        this.setName(threadName);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" says, 'Hello All'");
    }
}


public class ThreadPoolTask1 {
    public static void main(String[] args){

//        creating 5 threads
        HumanGreeting task1 = new HumanGreeting("ThreadA");
        HumanGreeting task2 = new HumanGreeting("ThreadB");
        HumanGreeting task3 = new HumanGreeting("ThreadC");
        HumanGreeting task4 = new HumanGreeting("ThreadD");
        HumanGreeting task5 = new HumanGreeting("ThreadE");

//        running 5 threads
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();
    }
}
