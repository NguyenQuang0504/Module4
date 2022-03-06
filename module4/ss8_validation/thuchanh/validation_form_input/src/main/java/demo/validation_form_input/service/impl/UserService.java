package demo.validation_form_input.service.impl;

import demo.validation_form_input.model.User;
import demo.validation_form_input.repository.IUserRepository;
import demo.validation_form_input.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public void save(User users) {
        iUserRepository.save(users);
    }
}
