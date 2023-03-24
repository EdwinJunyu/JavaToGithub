package 临时软件包.StreamIO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class 读取文件 {
    public static void main(String[] args) {
        System.out.println("--------------------逐个字节读取--------------------------");
        int count = 0;
        try (FileInputStream stream = new FileInputStream("Edwin--test/src/临时软件包/StreamIO流/test1.txt")) {
            int i;
            System.out.println(stream.available()); //查看数据长度
            while ((i = stream.read()) != -1) {   //读取完之后返回的值是-1
                System.out.print((char) i);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n一共有" + count + "个字符");
        System.out.println("---------------------逐个字符串读取-------------------------");

        int i;
        try (FileReader reader = new FileReader("Edwin--test/src/临时软件包/StreamIO流/test2.txt")){
            while((i = reader.read()) != 1)
                System.out.print((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
