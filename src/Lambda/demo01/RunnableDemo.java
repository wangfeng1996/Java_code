package Lambda.demo01;
/*
    函数式的编程思想：只要能够完成结果，谁去做，怎么做都是可以的
    注重的是结果，不注重过程；

 */
/*
     使用runnable接口的方式实现多线程程序
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
//        System.out.println("123");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            System.out.println("123");
        }

    }
}
