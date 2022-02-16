package repository;

import model.Convert;
import repository.convertImp.ConvertRepoImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertRepo implements ConvertRepoImp {
    private static Map<Integer, Convert> list = new HashMap<>();
    static {
        list.put(1, new Convert("Xin chao", "Hello"));
        list.put(2, new Convert("Tin hieu", "Signal"));
        list.put(3, new Convert("Chuyen doi", "Convert"));
        list.put(4, new Convert("Ban do", "Map"));
        list.put(5, new Convert("May tinh", "Computer"));
    }

    @Override
    public List<Convert> display() {
        return new ArrayList<>(list.values());
    }
}
