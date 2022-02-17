package repository.Impl;

import model.User;

import java.util.List;

public interface IUserRepo {
    List<User> check(String user, String password);

    Boolean checkRegister(String user);

    void register(String user, String password1);
}
