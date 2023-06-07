package JavaSE.StreamIO流;

import java.io.*;

public class 文件拷贝 {
    public static void main(String[] args){
        try (FileInputStream in = new FileInputStream("test.text"); //新建对象
        FileOutputStream out = new FileOutputStream("xxx.text")){  //要拷贝的对象路径  写清楚文件类型
        byte[] bytes = new byte[1024];  //一次读取多个字节
        int len;
        while ((len = in.read(bytes)) != -1){
            out.write(bytes, 0, len);
        }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
