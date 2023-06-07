package JavaSE.草稿;

public class 草稿 {
    public static void main(String[] args) {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";

        // Write a loop here that replaces every occurrence of "cat"
        // in the message with "dog", using indexOf and substring.
        int counter = 0;
        while (message.indexOf("cat")>=0)
        {
            int i = message.indexOf("cat");
            String catReplace1 = message.substring(0,i);
            String catReplace2 = message.substring(i+3);
            message = catReplace1 + "dog" + catReplace2;
            counter++;
        }
        System.out.println(message);
        System.out.println("There are " + counter +" replacements.");

        int fromIndex = 0;
        while(message.indexOf("dogs", fromIndex)>= 0){
            int index = message.indexOf("dogs", fromIndex);
            System.out.println("Found a dogs at index: " + index);
            String firstpart = message.substring(0,index);
            String lastpart = message.substring(index + 4);
            message = firstpart + "dogs and cats" + lastpart;
            System.out.println("replaced at index " + index);
            fromIndex = index + 4;
        }
    }
} //被删这个括号


