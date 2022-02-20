package service;

import model.Person;
import repository.Impl.IPersonRepo;
import repository.PersonRepo;
import service.Impl.IPersonService;

public class PersonService implements IPersonService {
    private IPersonRepo iPersonRepo = new PersonRepo();
    @Override
    public void save(Person person) {
        iPersonRepo.save(person);
    }
}
