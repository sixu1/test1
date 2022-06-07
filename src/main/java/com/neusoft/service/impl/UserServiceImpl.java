package com.neusoft.service.impl;

//import com.neusoft.dao.UserDao;
//import com.neusoft.po.User;
//import com.neusoft.service.UserService;
//
//public class UserServiceImpl implements UserService {
//    private UserDao userDao;
//
//    @Override
//    public User getUser() {
//        return userDao.getUser();
//    }
//
//    public UserDao getUserDao() {
//        return userDao;
//    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//}
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.stereotype.Component;
import com.neusoft.dao.UserDao; import com.neusoft.po.User;
import com.neusoft.service.UserService;


@Component("userService")
public class UserServiceImpl implements UserService { @Autowired
private UserDao userDao;


    @Override
    public User getUser() { return userDao.getUser();
    }
// 注意：UserDao属性自动注入，所以就可以不用get/set方法了
}
