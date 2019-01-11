package test;

public class B implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("载入图片" + i);
        }
    }
}