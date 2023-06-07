package JavaWeb.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务器 {  //先运行服务器，再连接客户端
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)){
            System.out.println("正在等待客户端连接...");
            //while (true){  //使远方客户端多次连接
                Socket socket = server.accept();
                System.out.println("客户端已连接，IP地址为： " + socket.getInetAddress().getHostAddress());
                System.out.println("读取客户端数据：");
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println(reader.readLine());
                OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
                writer.write("收到\n");
                writer.close();
                writer.flush();
            //}
        } catch (IOException e) {
            System.out.println("===================================");
            System.out.println("服务器已关闭");
            //throw new RuntimeException(e);
        }
    }
}
