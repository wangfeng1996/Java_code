package Lambda.demo01;

import Lambda.demo01.RunnableDemo;

public class RunnableMain {
    public static void main(String[] args) {
        //创建实现类对象
        RunnableDemo runnableDemo = new RunnableDemo();
        //创建thread对象,并且开启新的线程；
        new Thread(runnableDemo, "线程1:").start();

        new Thread(new RunnableDemo(), "线程2:").start();
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        th.start();


    }
}
