package test;

public class A implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("播放音乐" + i);
        }
    }
}
