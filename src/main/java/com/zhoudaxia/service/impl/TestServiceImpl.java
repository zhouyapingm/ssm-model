package com.zhoudaxia.service.impl;

import com.zhoudaxia.bean.Test;
import com.zhoudaxia.dao.TestDao;
import com.zhoudaxia.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public int insertTest(Test test) {
        int i = testDao.insertTest(test);
        return i;
    }
}
