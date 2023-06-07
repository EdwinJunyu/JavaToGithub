package JavaSE.代码库;

import java.util.*;

public class ToDoList
{
    public static void main(String[] args)
    {
        // Rewrite this code to use an ArrayList instead of an array
        //String[] toDoList = new String[3];
        //toDoList[0] = "Do homework";
        //toDoList[1] = "Help make dinner";
        //toDoList[2] = "Call grandma";
        ArrayList<String>  toDoList= new ArrayList<>();
        toDoList.add("Do homework");
        toDoList.add("Help make dinner");
        toDoList.add("Call grandma");

        // changing element 1
        toDoList.set(1, "Order pizza");

        System.out.println(toDoList.size() + " things to do!");
        System.out.println("Here's the first thing to do: "
                + toDoList.get(0) );

        // remove item 0 and move everything down
        //  (this can be done in 1 command with ArrayList)
        System.out.println("Here's the next thing to do: "
                + toDoList.get(1) );

        // Why is an ArrayList better than an array for a toDoList?
        // Answer: ArrayList can extend their size.
    }
}

