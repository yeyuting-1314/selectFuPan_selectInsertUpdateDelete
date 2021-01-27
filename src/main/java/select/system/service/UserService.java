package select.system.service;

import select.system.dto.User;

import java.util.List;

/**
 * @author yeyuting
 * @create 2021/1/25
 */
public interface UserService {

    public User selectByName(String username) ;

    public User selectById(int id) ;

    public List<User> selectAll() ;

    public boolean insertOne(User user) ;

    public boolean insertMany(List<User> userList) ;

    public boolean updateOne(User user) ;

    public boolean deleteById(int id) ;

}
