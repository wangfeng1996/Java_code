package Lambda.demo06;

public class demo02_lambda {
    public static void main(String[] args) {
        //第一种，匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        //第二种，lambda函数式编程格式
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

}

class MyrRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("启动");
    }
}
