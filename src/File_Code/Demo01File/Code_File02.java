package File_Code.Demo01File;

import java.io.File;

/*
    路径：
    绝对路径：

    以盘符开头的路径：--->是一个完整的路径
        windows中是具有盘符的，macos中没有盘符这个概念，linux中也没有盘符这个说法;s
    /Users/wangfeng/Workspace
        相对路径：是一个简化的路径：
        相对值得是相对当前项目的根目录：
        /Users/wangfeng/Workspace/a.txt-->可以简化为：a.txt;

注意：
1、路径不区分大小写的
2、


 */
public class Code_File02 {
    public static void main(String[] args) {
        System.out.println(File.separator+"demo"+File.separator+"code");
    }
}
