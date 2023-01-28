package 临时软件包.代码库;

public class 颠倒字符串 {
    public static void main(String[] args) {
        String s = "Hello";
        String sReversed = "";
        String ithLetter;

        for(int i=0; i < s.length(); i++) {
            ithLetter = s.substring(i,i+1);
            // add the letter at index i to what's already reversed.
            sReversed = ithLetter + sReversed;
        }
        System.out.println(s + " reversed is " + sReversed);
    }
}

