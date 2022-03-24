package com.my.konwlege.service;

import com.my.konwlege.domain.Demo;
import com.my.konwlege.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;


    public List<Demo> list() {

        return demoMapper.selectByExample(null);
    }
}
