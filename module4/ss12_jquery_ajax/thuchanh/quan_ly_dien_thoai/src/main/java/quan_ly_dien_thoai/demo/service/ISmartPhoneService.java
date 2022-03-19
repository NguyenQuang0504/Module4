package quan_ly_dien_thoai.demo.service;

import quan_ly_dien_thoai.demo.model.SmartPhone;

import java.util.List;

public interface ISmartPhoneService {
    SmartPhone save(SmartPhone smartPhone);

    List<SmartPhone> findAll();
}
