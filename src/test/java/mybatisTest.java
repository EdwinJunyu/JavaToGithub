import mybatis.user;
import mybatis.userMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {
    @Test
    public void testMybatis() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true); //true为自动提交
        //获取mapper接口对象
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        //测试功能
        //提交事务
        //sqlSession.commit();
        int result = mapper.insertUser();
        System.out.println("result:" + result);
    }
    @Test
    public void testCRUD() throws IOException{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        //mapper.updateUser();
        //mapper.deleteUser();
        //user user = mapper.getUserById();
        //System.out.println(user);
        List<user> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }
}
