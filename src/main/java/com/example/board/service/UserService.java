package com.example.board.service;

import com.example.board.dao.UserDao;
import com.example.board.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// 스피링이 관리하는 Bean
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    @Transactional
    public User addUser(String name, String email, String password) {
        User user1 = getUser(email);
        if(user1 != null) {
            throw new RuntimeException("이미 가입된 이메일입니다.");
        }

        User user = userDao.addUser(email, name, password);
        userDao.mappingUserRole(user.getUserId());
        return user;
    }

    @Transactional
    public User getUser(String email) {
        return userDao.getUser(email);
    }

    @Transactional(readOnly = true)
    public List<String> getRoles(int userId) {
        return userDao.getRoles(userId);
    }
}
