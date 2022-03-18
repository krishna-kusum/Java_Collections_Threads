
class CountryGreeting implements Runnable{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" says, 'Hello All'");
    }
}

public class ThreadPoolTask2 {
    public static void main(String[] args){

//        creating 5 threads
        Thread task1 = new Thread(new CountryGreeting());
        Thread task2 = new Thread(new CountryGreeting());
        Thread task3 = new Thread(new CountryGreeting());
        Thread task4 = new Thread(new CountryGreeting());
        Thread task5 = new Thread(new CountryGreeting());

//        Running 5 threads
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();
    }
}
