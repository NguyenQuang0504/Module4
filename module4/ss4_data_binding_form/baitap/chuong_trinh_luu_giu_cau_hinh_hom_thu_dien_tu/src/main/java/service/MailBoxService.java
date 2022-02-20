package service;

import model.MailBox;
import repository.Impl.IMailBoxRepo;
import repository.MailBoxRepo;
import service.Impl.IMailBoxService;

public class MailBoxService implements IMailBoxService {
    private IMailBoxRepo iMailBoxRepo = new MailBoxRepo();
    @Override
    public void save(MailBox mail) {
        iMailBoxRepo.save(mail);
    }
}
