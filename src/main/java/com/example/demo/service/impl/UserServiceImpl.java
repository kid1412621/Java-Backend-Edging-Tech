package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.exception.ApplicationException;
import com.example.demo.model.TUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addTwo(boolean isTry) {
        userDao.save(TUser.builder().username("u1").email("hhh").mobile("26").build());
        if (isTry) {
            throw new ApplicationException("oops...");
        }
        userDao.save(TUser.builder().username("u2").email("g").mobile("425").build());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW) // this means this method implements an independent logical transaction
    public void editById(long id) {
        Optional<TUser> u = userDao.findById(id);
        TUser user = u.get();
        user.setUsername("changed!!!");
        userDao.save(user);
    }
}
