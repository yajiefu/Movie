package com.dream.service.impl;

import com.dream.mapper.RectabMapper;
import com.dream.po.Rectab;
import com.dream.po.RectabExample;
import com.dream.service.RectabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RectabServiceImpl implements RectabService {
    @Autowired
    private RectabMapper rectabMapper;

    @Override
    public  Rectab getRectabByUserId(Integer userid) {
        RectabExample example = new RectabExample();
        RectabExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<Rectab> rectabList = rectabMapper.selectByExample(example);
        return rectabList.get(0);
    }
}
