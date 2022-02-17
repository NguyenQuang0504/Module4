package service;

import model.User;
import repository.Impl.IUserRepo;
import repository.UserRepo;
import service.Impl.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private IUserRepo iUserRepo = new UserRepo();
    @Override
    public List<User> check(String user, String password) {
        return iUserRepo.check(user, password);
    }

    @Override
    public Boolean checkRegister(String user) {
        return iUserRepo.checkRegister(user);
    }

    @Override
    public void register(String user, String password1) {
        iUserRepo.register(user, password1);
    }
}
