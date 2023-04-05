package 临时软件包.StreamIO流;

import java.io.File;

public class 文件对象 {
    public static void main(String[] args) {
        File file1 = new File("/");
        System.out.println(file1.getFreeSpace() / 1024 / 1024 / 1024 + "G");  //查看系统内存

        File file2 = new File("test1.txt");
        System.out.println("test1.txt的绝对路径为 " + file2.getAbsolutePath());
        System.out.println(file2.getClass());
    }
}
