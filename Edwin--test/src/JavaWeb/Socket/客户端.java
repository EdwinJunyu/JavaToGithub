package JavaWeb.Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class 客户端 {  //先运行服务器，再连接客户端
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);     //host填对方的IP
            Scanner scanner = new Scanner(System.in)) {
            System.out.println("已连接到服务断");
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            System.out.println("请输入要发送给服务端的内容：");
            writer.write(scanner.nextLine() + '\n');
            writer.flush();
            System.out.println("数据已发送！");
            BufferedReader reader = new BufferedReader(new InputStreamReader((socket.getInputStream())));
            System.out.println("收到服务端响应：" + reader.readLine());
        } catch (IOException e) {
            System.out.println("服务器未开启！请稍后再试...");
            //throw new RuntimeException(e);
        }
    }
}
