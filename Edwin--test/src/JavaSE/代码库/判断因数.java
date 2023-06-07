package JavaSE.代码库;

public class 判断因数 {
    public static void main(String[] args) {
        System.out.println(isSelfDivisor(129));
    }

    public static boolean isSelfDivisor(int number) {
        // part A
        int n = number;
        while ( n > 0 ){
            int digit = n % 10;
            if(digit == 0 || number % digit != 0)
                return false;
            n /= 10;
        }
        return true;
    }
}

