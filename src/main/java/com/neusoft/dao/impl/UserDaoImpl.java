package com.neusoft.dao.impl;

//import com.neusoft.dao.UserDao;
//import com.neusoft.po.User;

import org.springframework.stereotype.Component; import com.neusoft.dao.UserDao;
import com.neusoft.po.User;

@Component
public class UserDaoImpl implements UserDao { @Override
public User getUser() {
    return new User(1, "test", "111");
}
}
//public class UserDaoImpl implements UserDao {
//    @Override
//    public User getUser() {
//        return new User(1, "test", "111");
//    }
//}