package com.my.konwlege.service;

import com.my.konwlege.domain.Ebook;
import com.my.konwlege.domain.EbookExample;
import com.my.konwlege.mapper.EbookMapper;
import com.my.konwlege.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;


    public List<EbookResp> list(Ebook req) {


        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();

        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebooksList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> resqList = new ArrayList<>();
        for ( Ebook ebook : ebooksList) {
            EbookResp ebookResq = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResq);
            resqList.add(ebookResq);
        }
        return resqList;
    }
}
