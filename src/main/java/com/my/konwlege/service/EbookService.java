package com.my.konwlege.service;

import com.my.konwlege.domain.Ebook;
import com.my.konwlege.domain.EbookExample;
import com.my.konwlege.mapper.EbookMapper;
import com.my.konwlege.resp.EbookResp;
import com.my.konwlege.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

//        List<EbookResp> respList = new ArrayList<>();
//        for ( Ebook ebook : ebooksList) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
        //对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }
        //对象复制
        List<EbookResp> list = CopyUtil.copyList(ebooksList, EbookResp.class);
        return list;
    }
}
