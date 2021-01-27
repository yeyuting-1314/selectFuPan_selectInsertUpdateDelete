package select.system.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import select.system.dto.User;

import java.util.List;

/**
 * @author yeyuting
 * @create 2021/1/25
 */
@Repository
@Mapper
public interface UserMapper {

    public User selectByName(String username)  ;

    public User selectById (int id ) ;

    public List<User> selectAll() ;

    public boolean insertOne(User user) ;

    public boolean insertMany(List<User> userList) ;

    public boolean updateOne(User user) ;

    public boolean deleteById(int id) ;

}
