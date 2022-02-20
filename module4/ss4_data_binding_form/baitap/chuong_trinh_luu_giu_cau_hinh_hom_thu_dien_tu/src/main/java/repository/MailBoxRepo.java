package repository;

import model.MailBox;
import repository.Impl.IMailBoxRepo;

import java.util.ArrayList;
import java.util.List;

public class MailBoxRepo implements IMailBoxRepo {
    private static List<MailBox> mailBoxes = new ArrayList<>();
    @Override
    public void save(MailBox mail) {
        mailBoxes.add(mail);
    }
}
