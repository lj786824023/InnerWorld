package dao;

import entity.User;

public interface UserDao {
    boolean login(User u);
}