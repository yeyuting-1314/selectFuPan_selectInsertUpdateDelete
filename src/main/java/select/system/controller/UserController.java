package select.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import select.base.Result;
import select.constants.BaseEnums;
import select.system.dto.User;
import select.system.service.UserService;
import select.util.Results;

import java.util.List;

/**
 * @author yeyuting
 * @create 2021/1/25
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    UserService userService ;

    @GetMapping("/selectByName")
    public Result selectByName(@RequestParam("userName") String username){
        return Results.successWithData(userService.selectByName(username) , BaseEnums.SUCCESS.code()) ;
    }

    @GetMapping("/selectById")
    public Result selectByName(@RequestParam("id") int id ){
        return Results.successWithData(userService.selectById(id) , BaseEnums.SUCCESS.code()) ;
    }

    @GetMapping("/selectAll")
    public Result selectAll(){
        return Results.successWithData(userService.selectAll() , BaseEnums.SUCCESS.code()) ;
    }
    @PostMapping("/insertOne")
    public Result insertOne(@RequestBody User user){
        return Results.successWithData(userService.insertOne(user) , BaseEnums.SUCCESS.code()) ;

    }
    @PostMapping("/insertMany")
    public Result insertMany(@RequestBody List<User> userList){
        return Results.successWithData(userService.insertMany(userList) , BaseEnums.SUCCESS.code()) ;
    }

    @PostMapping("/updateOne")
    public Result updateOne(@RequestBody User user){
        return Results.successWithData(userService.updateOne(user) , BaseEnums.SUCCESS.code()) ;
    }
    @PostMapping("/deleteById")
    public Result deleteById(@RequestParam int id){
        return Results.successWithData(userService.deleteById(id) , BaseEnums.SUCCESS.code()) ;
    }

}
