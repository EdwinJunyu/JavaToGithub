package JavaSE.图书管理系统;

import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class GUI {
    public static void main(String[] args) {
        Frame frame = new Frame();   //直接创建一个新的窗口
        frame.setTitle("图书管理系统");   //设置窗口标题
        frame.setSize(500, 300);   //设定窗体大小
        frame.setBackground(Color.WHITE);   //设置窗口背景颜色
        frame.setResizable(false);    //设置窗口大小是否固定
        frame.setAlwaysOnTop(true);    //设置窗口是否始终展示在最前面
        frame.setVisible(true);    //默认情况下窗体是不可见的，我们如果要展示出来，还需要设置窗体可见性

        //frame.setLayout(null); //默认布局
        //现在我们想要分两个区域，上半部分区域是流式布局，下半部分区域采用网格布局，那么我们就可以先将窗口采用网格布局，并在上下各添加一个面板：
        GridLayout layout = new GridLayout();   //先设置整个窗口的布局
        layout.setRows(2);     //设置行数为2，一会就会分成两行了
        frame.setLayout(layout);

        Panel top = new Panel();     //接着我们创建一下上半部分的面板和下半部分的面板
        top.setBackground(Color.PINK);   //添加一个背景颜色方便区分
        frame.add(top);

        Label label = new Label("Hello World");   //添加标签只需要创建一个Label对象即可
        label.setLocation(20, 50);   //注意，必须设定标签的位置和大小，否则无法展示出来
        label.setSize(100, 20);
        frame.add(label);    //使用add方法添加组件到窗口中
        //frame.setLocation(100, 200);   //setLocation可以调整窗口位置
        label.setFont(new Font("Songti SC", Font.BOLD, 15)); //设置字体

        Panel bottom = new Panel();
        bottom.setBackground(Color.ORANGE);
        frame.add(bottom);

        TextField field = new TextField();   //TextField是文本框
        field.setBounds(20, 100, 200, 25);
        frame.add(field);
        Button button = new Button("点击登录"); //Button是按钮组件
        frame.add(button);
        button.setBounds(20, 150, 100, 50);
        //点击按钮直接获取文本框中的文本内容，只需要调用getText方法即可
        button.addActionListener(e -> System.out.println("输入的用户名是："+field.getText()));
        frame.add(button);

        //窗口自适应居中
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  //获取到屏幕尺寸
        int x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);   //居中位置就是：屏幕尺寸/2 - 窗口尺寸/2
        int y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);

        frame.setLocation(x, y);   //位置设置好了之后再展示出来
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {   //windowClosing方法对应的就是窗口关闭事件
                frame.dispose();    //当我们点击X号关闭窗口时，就会自动执行此方法了
                //使用dispose方法来关闭当前窗口
            }

            @Override
            public void windowClosed(WindowEvent e) {   //对应窗口已关闭事件
                System.out.println("窗口已关闭！");   //当窗口成功关闭后，会执行这里重写的内容
                System.exit(0);    //窗口关闭后退出当前Java程序
            }
        });
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {    //监听键盘输入事件，当我们在窗口中敲击键盘输入时会触发
                System.out.print(e.getKeyChar());   //可以通过KeyEvent对象来获取当前事件输入的对应字符
            }
        });
        interface KeyListener extends EventListener {
            public void keyTyped(KeyEvent e);   //当一个按键按下之后触发（感觉跟下面这个没啥区别）
        }

        //滚动鼠标
        frame.addMouseWheelListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println(e.getScrollAmount());    //获取滚动数量
            }
        });
    }
}
