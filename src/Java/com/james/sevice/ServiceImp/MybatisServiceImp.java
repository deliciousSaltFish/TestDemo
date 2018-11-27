package com.james.sevice.ServiceImp;

import com.james.dao.apiDao;
import com.james.sevice.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mybatisServiceImp")
public class MybatisServiceImp implements MybatisService {
    @Autowired
    apiDao  apiDao;

    public String queryCurrDate() {
        return apiDao.queryCurrDate();
    }
}
