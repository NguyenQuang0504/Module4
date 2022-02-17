package service.Impl;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> check(String user, String password);

    Boolean checkRegister(String user);

    void register(String user, String password1);
}
