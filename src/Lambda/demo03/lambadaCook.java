package Lambda.demo03;

public class lambadaCook {
    public static void main(String[] args) {
        cookFood(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        cookFood(() -> {
            System.out.println("吃饭了");
        });

    }

    public static void cookFood(Cook food) {
        food.makeFood();
    }
}
