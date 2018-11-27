package com.james.dao;

import org.springframework.stereotype.Repository;

//注册bean
@Repository
public interface apiDao {
    String queryCurrDate();
}
