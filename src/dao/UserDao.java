package dao;

import entity.User;

import java.util.List;

public interface UserDao {
    boolean login(User u);

    List<User> SelectAll();
}