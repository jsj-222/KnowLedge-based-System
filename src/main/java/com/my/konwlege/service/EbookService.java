package com.my.konwlege.service;

import com.my.konwlege.domain.Ebook;
import com.my.konwlege.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;


    public List<Ebook> list() {

        return ebookMapper.selectByExample(null);
    }
}
