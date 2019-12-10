package File_Code.Demo01File;


import java.io.File;

/*

    文件在 java.io.file类
     主要作用：文件和目录路劲名的抽象表现形式;


     作用：
     1、创建文件夹
     2、删除文件/文件夹
     3、获取文件/文件夹
     4、判断文件/文件夹是否存在
     5、对文件夹、文件进行遍历
     6、获取文件大小

     file类是一个与系统无关的类，任何操作系统都可以使用类中的方法;

    file:文件
    directory：文件夹/目录
    path：路劲


 */
public class Code_File01 {
    public static void main(String[] args) {
        /*
        File类中的的静态方法:


        static string pathSeparator：与系统有关的路劲分隔符，为了方便，他表示为一个字符串
        static char pathSeparatorChar:与系统有关的路劲分隔符

        static string separator：与系统有关的默认名称分隔符，为了方便，他表示为一个字符串
        static char separatorChar:与系统有关的默认名称分隔符

         */


        //路劲分隔符： windows系统是';',linux系统是冒号：；
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar);


        //windows系统是反斜杠 c:\java\demo01 ； linux系统是正斜杠:/Library/Java/JavaVirtualMachines/
        String separator = File.separator;//文件名称分隔符
        System.out.println(separator);

        char separatorChar = File.separatorChar;
        System.out.println(separatorChar);
        //注意事项：以后这个路劲不能写死了，用File.separator+"develop"+File.separator+"java"

        System.out.println(File.separator+"develop"+File.separator+"java");
    }
}
