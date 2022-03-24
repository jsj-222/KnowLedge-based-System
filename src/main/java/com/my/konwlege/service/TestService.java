package com.my.konwlege.service;

import com.my.konwlege.domain.Test;
import com.my.konwlege.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;


    public List<Test> list() {

        return testMapper.list();
    }
}
