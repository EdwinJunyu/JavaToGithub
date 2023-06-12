package mybatis;

import java.util.List;

public interface userMapper {
    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询用户信息
     */
    user getUserById();

    /**
     * 查询所有用户信息
     */
    List<user> getAllUser();

}
