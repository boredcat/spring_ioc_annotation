package com.evan.demo1;

/*
spring的bean管理的注解
传统方法：需要去xml
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component("userService")
@Service("userService")
public class UserService {

    @Value("rice")
    private String something;

//    @Autowired
//    @Qualifier("userDao")
    @Resource(name="userDao")
    private UserDao userDao;

    public String sayHello(String name){
        return "hello "+name;
    }

    public void eat(){
        System.out.println("eat:"+something);
    }

    public void save(){
        System.out.println("Service中的保存用户");
        userDao.save();
    }
}
