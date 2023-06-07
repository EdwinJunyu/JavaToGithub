package JavaSE.test1;
//Write a Java program to print the following grid.
//Expected Output :
//
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
public class Q3 {
    public static void main(String[] args) {
        int count = 0;
        while(true){
            if (count < 100){
                System.out.print("- ");
                count++;
            }
        }
    }
}
