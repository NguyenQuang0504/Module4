package repository.Impl;

import model.Person;

import java.util.List;

public interface IPersonRepo {
    void save(Person person);

    List<Person> display();
}
