package quan_ly_dien_thoai.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quan_ly_dien_thoai.demo.model.SmartPhone;
import quan_ly_dien_thoai.demo.repository.ISmartPhoneRepository;
import quan_ly_dien_thoai.demo.service.ISmartPhoneService;

import java.util.List;

@Service
public class SmartPhoneService implements ISmartPhoneService {
    @Autowired
    private ISmartPhoneRepository iSmartPhoneRepository;
    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return iSmartPhoneRepository.save(smartPhone);
    }

    @Override
    public List<SmartPhone> findAll() {
        return iSmartPhoneRepository.findAll();
    }
}
