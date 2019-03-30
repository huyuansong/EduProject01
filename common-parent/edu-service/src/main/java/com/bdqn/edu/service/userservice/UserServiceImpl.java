package com.bdqn.edu.service.userservice;

import com.bdqn.edu.baseservice.BaseServiceImpl;
import com.bdqn.edu.mapper.UserMapper;
import com.bdqn.edu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {


    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void save(User entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void update(User entity) {

    }
}
