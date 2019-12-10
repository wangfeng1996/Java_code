package Lambda.demo05;

public class MainDemo {
    public static void main(String[] args) {
//        SUM_01(new sumDemo() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        });
        //使用lambda表达式简化匿名内部类
        SUM_01((int a, int b) -> {
            return a + b;
        });
    }
    public static void SUM_01(sumDemo number) {
        int result = number.add(30, 40);
        System.out.println(result);
    }

}

