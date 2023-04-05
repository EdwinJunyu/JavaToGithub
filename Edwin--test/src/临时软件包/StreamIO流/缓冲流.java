package 临时软件包.StreamIO流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class 缓冲流 {
    public static void main(String[] args) {
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream("Edwin--test/src/临时软件包/StreamIO流/test4.txt"))){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
