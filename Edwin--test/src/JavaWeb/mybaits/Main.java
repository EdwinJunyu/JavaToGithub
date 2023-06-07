package JavaWeb.mybaits;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("Edwin--test/src/JavaWeb/mybaits/mybaits-config.xml"));
        try(SqlSession session = sqlSessionFactory.openSession(true)){
            System.out.println("hi");
        }
    }
}
