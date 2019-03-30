package com.bdqn.edu.baseservice;

import com.bdqn.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T>{


    @Autowired
    public UserMapper userMapper;
}
