package com.example.board.dao;

import com.example.board.dto.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// spring이 관리하는 bean
@Repository
public class UserDao {
    @Transactional
    public User addUser(String email, String name, String password) {
        return null;
    }
    @Transactional
    public void mappingUserRole(int userId) {

    }
}
