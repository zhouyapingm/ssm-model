package com.zhoudaxia.dao;

import com.zhoudaxia.bean.Test;

import java.util.List;

public interface TestDao {
    int insertTest(Test test);
    List<Test> selectALL();
}
