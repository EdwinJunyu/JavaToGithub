package 临时软件包.代码库;

public class 替换字符串 {
        public static void main(String[] args) {
            String message = "I love cats! I have a cat named Coco. My cat's very smart!";

            // Write a loop here that replaces every occurrence of "cat"
            // in the message with "dog", using indexOf and substring.
            int counter = 0;
            while (message.indexOf("cat")>=0)
            {
                int i = message.indexOf("cat");
                String catReplace1 = message.substring(0,i);
                String catReplace2 = message.substring(i+3); //根据字符串大小来更改数字
                message = catReplace1 + "dog" + catReplace2;
                counter++;
            }
            System.out.println(message);
            System.out.println("There are " + counter +" replacements.");
        }
    }

