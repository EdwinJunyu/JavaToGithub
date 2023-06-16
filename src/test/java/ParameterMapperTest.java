import mybatis.ParameterMapper;
import mybatis.SqlSessionUtils;
import mybatis.user;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ParameterMapperTest {
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlsession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        //List<user> list = mapper.getAllUser;  //找不到.getAllUser方法

    }
}
