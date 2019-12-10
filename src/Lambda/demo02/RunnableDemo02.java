package Lambda.demo02;

/**
 * 使用lambada表达式进行线程代码的函数式编程;
 * lambada 表达式的基本格式：
 * 1、一些参数
 * 2、一个箭头
 * 3、一段代码
 * <p>
 * 格式：
 * （参数列表）->（一些重写方法的代码);
 * 介绍说明格式：
 * // 这个就是下面的run方法
 * （）：接口中抽象方法的参数列表，没有参数就空着，
 * 有就写着，多个用逗号分开
 * <p>
 * ——>:传递的意思，把参数传递给方法体；
 * <p>
 * //这个就是下面的方法体
 * {}：重写接口的抽象方法的方法体;
 */
public class RunnableDemo02 {
    public static void main(String[] args) {
        /*
            下面是lambada的表达格式;
         */
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "123");

        }, "线程1:").start();
    }
}
