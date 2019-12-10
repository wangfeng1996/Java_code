package Lambda.demo06;

public class Demo01_lambda {
    public static void main(String[] args) {
        //传统的创建对象;
        MyCom com = new MyCom();
        int add = com.ADD(30, 20);
        System.out.println(add);
        //匿名内部类创建对象
        new MyCom() {
            @Override
            public int ADD(int a, int b) {
                return a - b;
            }
        };

        new MyCom() {
            @Override
            public int ADD(int a, int b) {
                return a - b;
            }
        };



    }


}

class MyCom implements Com {

    @Override
    public int ADD(int a, int b) {
        return a - b;
    }
}

interface Com {
    int ADD(int a, int b);
}

