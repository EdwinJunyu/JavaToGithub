package JavaWeb;         //lombok测试

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class lombok测试 {
    int sid;
    String name;
    String sex;

    public static void main(String[] args) {
        lombok测试 student = new lombok测试(123, "Edwin", "male");
        System.out.println(student.getName());
        System.out.println(student.getSid());
    }
}

