package JavaSE.test1;
//Write a Java program to find the duplicate values of an array of string values.
public class Q13 {
    public static void dupStringValueQ12(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[i] + " is duplicate values.");
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] test = {"hi","Hello" ,"Hello", "World" ,"World", "!"};
        Q13.dupStringValueQ12(test);
    }
}
