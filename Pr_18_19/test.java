package Pr_18_19;

import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws InterruptedException {
        ConnectThread connectThread[] = new ConnectThread[10];

        for(int i = 0; i < 5; i++){
            connectThread[i] = new ConnectThread();
        }

        for(int i = 0; i < 5; i++){
            TimeUnit.SECONDS.sleep(1);
            connectThread[i].start();
        }
    }
}
class ConnectThread extends Thread {
    public void run() {
        System.out.println("Example client message "+ currentThread());
    }
}
