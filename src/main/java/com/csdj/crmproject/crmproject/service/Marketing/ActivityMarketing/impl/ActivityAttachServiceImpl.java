package com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.impl;


import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketAttach;
import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityAttachService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ActivityAttachServiceImpl")
public class ActivityAttachServiceImpl implements ActivityAttachService {
    @Resource
    private com.csdj.crmproject.crmproject.dao.Marketing.ActivityMarketing.ActivityAttachMapper ActivityAttachMapper;
    @Override
    public List<MarketAttach> Smarketattach(int page, int limit,Integer pkMarkActivityId) {
        //开启分页
        PageHelper.startPage(page, limit);
        //查询的数据
        List<MarketAttach> list =ActivityAttachMapper.Smarketattach(pkMarkActivityId);
        System.out.println(list.size()+"-????-"+ list);
        //数据传入pagehelper中
        PageInfo<MarketAttach> pInfo =new PageInfo<MarketAttach>(list);
        System.out.println(list.size()+"-(((((()))-"+pInfo.getList());
        return pInfo.getList();
    }

    @Override
    public int AttCount() {
        return ActivityAttachMapper.AttCount();
    }

    @Override
    public int InAtt(MarketAttach Att) {
        return ActivityAttachMapper.InAtt(Att);
    }

    @Override
    public int delAtt(int pkMarkAttachId) {
        return ActivityAttachMapper.delAtt(pkMarkAttachId);
    }
}
