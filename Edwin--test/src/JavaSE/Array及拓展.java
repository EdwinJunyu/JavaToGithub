package JavaSE;

public class Array及拓展 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};

        //遍历数组array1：
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        //更简洁的方法for-each：
        int [] array2 = {1,2,3,4,5};
        System.out.println("-------------------");
        for (int a: array2) {
            System.out.println(a);
        }

        int [] [] array3 = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        System.out.println("-------------------");
        //打印多维数组
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++){
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        Array及拓展.test("moreThanOneValue参数长度为：",1,2,3,4,5,6,7,8);
    }
    //  ...三个点代表可以输入任意数量的同一类型参数

    public static void test(String str, int... moreThanOneValue){   //其他的参数只能放在可变长参数前面
        System.out.println(str + moreThanOneValue.length);
    }
}
