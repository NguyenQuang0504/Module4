package repository;

import model.User;
import repository.Impl.IUserRepo;

import java.util.ArrayList;
import java.util.List;

public class UserRepo implements IUserRepo {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User("quang10a30504@gmail.com", "123123"));
        users.add(new User("quang11a30504@gmail.com", "123456"));
        users.add(new User("quang12a30504@gmail.com", "456456"));
        users.add(new User("quang13a30504@gmail.com", "111111"));
        users.add(new User("quang14a30504@gmail.com", "222222"));
    }

    @Override
    public List<User> check(String user, String password) {
        List<User> list = new ArrayList<>();
        for (int i = 0;i<users.size();i++){
            if(user.equals(users.get(i).getUsername()) && password.equals(users.get(i).getPassword())){
                list.add(users.get(i));
                return list;
            }
        }
        return null;
    }

    @Override
    public Boolean checkRegister(String user) {
        for (int i = 0;i<users.size();i++){
            if (user.equals(users.get(i).getUsername())){
                return false;
            }
        }
        return true;
    }

    @Override
    public void register(String user, String password1) {
        users.add(new User(user, password1));
    }
}
