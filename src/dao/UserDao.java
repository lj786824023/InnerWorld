package dao;

import entity.User;

import java.util.List;

public interface UserDao {
    boolean login(User user);

    List<User> SelectAll();

    int insert(User user);

    int delete(User user);

    int update(User user);
}