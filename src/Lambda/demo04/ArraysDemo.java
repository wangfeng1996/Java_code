package Lambda.demo04;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        Person p1 = new Person(16, "张三");
        Person p2 = new Person(14, "王三");
        Person p3 = new Person(17, "李四");
        Person[] arrays = {p1, p2, p3};

        //年龄的升序进行排序
//        Arrays.sort(arrays, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        //利用lambda进行对匿名内部类的重写
        Arrays.sort(arrays, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        //下面是年龄的升序排序;
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

    }
}
