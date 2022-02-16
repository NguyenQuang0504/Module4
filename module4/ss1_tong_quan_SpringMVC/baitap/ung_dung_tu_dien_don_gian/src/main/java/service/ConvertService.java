package service;

import model.Convert;
import repository.ConvertRepo;
import repository.convertImp.ConvertRepoImp;
import service.serviceImp.ConvertServiceImpl;

import java.util.List;

public class ConvertService implements ConvertServiceImpl {
    private ConvertRepoImp convertRepoImp = new ConvertRepo();
    @Override
    public List<Convert> display() {
        return convertRepoImp.display();
    }
}
