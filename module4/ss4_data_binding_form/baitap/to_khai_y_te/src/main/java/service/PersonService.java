package service;

import model.Person;
import repository.Impl.IPersonRepo;
import repository.PersonRepo;
import service.Impl.IPersonService;

import java.util.List;

public class PersonService implements IPersonService {
    private IPersonRepo iPersonRepo = new PersonRepo();
    @Override
    public void save(Person person) {
        iPersonRepo.save(person);
    }

    @Override
    public List<Person> display() {
        return iPersonRepo.display();
    }
}
