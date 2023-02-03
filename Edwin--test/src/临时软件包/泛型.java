package 临时软件包;

import java.util.Arrays;

public class 泛型 <T, U extends Number>{    //T和U代表任意未明确的参数（其他字母也行）<A-->Z>
                                            //extands 可以限制<T>的类型 如Number类型下不能为String
    String name;
    T tValue;
    U uValue;

   public 泛型(String name, T tValue, U uValue){
       this.name = name;
       this.tValue = tValue;
       this.uValue = uValue;
   }

    //泛型方法：
   public static <X> X test(X newValue){
        return newValue;
   }

    public static void main(String[] args) {
        泛型<Integer, Double> Test = new 泛型<>("Edwin", 1, 2.0);
        //<>填入包装类的类型， <?>表示任意类型
        System.out.println(Test.test("hello"));


        //拓展 排序方法
        Integer[] arr = {1,3,2,4,2,5,6,7,9,2,9,100,88,97};
        Arrays.sort(arr, (o1, o2) -> o2 - o1);  //默认的sort是从大到小，通过这种方法实现从小到大。
        System.out.println(Arrays.toString(arr));
    }

}
