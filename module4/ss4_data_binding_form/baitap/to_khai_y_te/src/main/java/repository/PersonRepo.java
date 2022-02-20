package repository;

import model.Person;
import repository.Impl.IPersonRepo;

import java.util.ArrayList;
import java.util.List;

public class PersonRepo implements IPersonRepo {
   private static List<Person> list = new ArrayList<>();

}
