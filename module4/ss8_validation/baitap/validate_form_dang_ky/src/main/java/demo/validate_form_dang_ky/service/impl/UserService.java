package demo.validate_form_dang_ky.service.impl;

import demo.validate_form_dang_ky.model.User;
import demo.validate_form_dang_ky.repository.IUserRepository;
import demo.validate_form_dang_ky.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
