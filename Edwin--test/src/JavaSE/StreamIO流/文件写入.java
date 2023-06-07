package JavaSE.StreamIO流;

import java.io.FileWriter;
import java.io.IOException;

public class 文件写入 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Edwin--test/src/临时软件包/StreamIO流/test3.txt", true)){ // true为可追加写入属性
            writer.write("--------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
