package 临时软件包;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> map = new HashMap<>();  //哈希map
        map.put(1,"小明"); //映射只能一一对应,不能重复
        map.put(2, "小红");

        System.out.println("1的映射是" + map.get(1));
        System.out.println("2的映射是" + map.get(2));

        //boolean containsKey(Object key)
        System.out.println("检测值是否存在2：" + map.containsKey(2));
        System.out.println("检测值是否存在3：" + map.containsKey(3));
        //boolean containsValue(Object value)
        System.out.println(map.containsValue("小明"));
    }
}
