package JavaWeb;         //lombok测试

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class test {
    int sid;
    String name;
    String sex;

    public static void main(String[] args) {
        test student = new test(123, "Edwin", "male");
        System.out.println(student.getName());
        System.out.println(student.getSid());
    }
}

