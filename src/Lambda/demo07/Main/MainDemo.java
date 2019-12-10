package Lambda.demo07.Main;


import Lambda.demo07.interfaceDemo.*;

public class MainDemo {
    public static void main(String[] args) {
        //无参无返回值
        demo01 d1 = () -> {
            System.out.println("1:" + "Hello world");
        };
        d1.test();
        //一个参数无返回值
        demo02 d2 = (int a) -> System.out.println("2:" + a);
        d2.test(20);
        //两个参数返回值
        demo03 d3 = (int a, int b) -> {
            System.out.println("3:" + (a + b));
        };
        d3.test(2, 3);
        //有返回值无参
        demo04 d4 = () -> {

            return 100;
        };
        int test04 = d4.test();
        System.out.println("4:"+test04);
        //有返回值
        demo05 d5 = (int a) -> {
            return a;
        };
        int test05 = d5.test(30);
        System.out.println("5:" + test05);

        demo06 d6 = (int a, int b) -> {

            return (a + b);
        };
        int test06 = d6.test(3, 9);
        System.out.println("6:" + test06);
    }


}
