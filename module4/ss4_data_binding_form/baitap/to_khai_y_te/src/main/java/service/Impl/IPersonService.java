package service.Impl;

import model.Person;

import java.util.List;

public interface IPersonService {
    void save(Person person);

    List<Person> display();
}
