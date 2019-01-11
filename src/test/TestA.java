package test;

public class TestA {
    public static void main(String[] args) {
        for (int j = 0; j < 50; j++) {
            System.out.println("运行游戏" + j);
            if (j == 10) {
                A a = new A();
                B b = new B();
                Thread thread1 = new Thread(a);
                Thread thread2 = new Thread(b);
                thread1.start();
                thread2.start();
            }
        }
    }
}
