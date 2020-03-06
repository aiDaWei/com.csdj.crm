package com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.impl;

import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.dao.Marketing.ActivityMarketing.ActivityMarketingMapper;
import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityMarketingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("ActivityMarketingServiceImpl")
public class ActivityMarketingServiceImpl implements ActivityMarketingService {
    @Resource
    private ActivityMarketingMapper ActivityMarketingMapper;


    @Override
    public List<MarketActivity> activi(int page, int limit,String activityApprovalProcess) {
        //开启分页
        PageHelper.startPage(page, limit);
        //查询的数据
        List<MarketActivity> list =ActivityMarketingMapper.activi(activityApprovalProcess);
        System.out.println(list.size()+"--"+ list);
        //数据传入pagehelper中
        PageInfo<MarketActivity> pInfo =new PageInfo<MarketActivity>(list);
        System.out.println("****"+ pInfo.getList());
        return pInfo.getList();
    }

    @Override
    public int marketCount(String activityApprovalProcess) {

        return ActivityMarketingMapper.marketCount(activityApprovalProcess);
    }


    @Override
    public int addMarket(MarketActivity activity) {
        return ActivityMarketingMapper.addMarket(activity);
    }

    @Override
    public int delMarket(int pkMarkActivityId) {
        return ActivityMarketingMapper.delMarket(pkMarkActivityId);
    }

    @Override
    public MarketActivity uppkMarkActivityId(int pkMarkActivityId) {
        return ActivityMarketingMapper.uppkMarkActivityId(pkMarkActivityId);
    }

    @Override
    public int updaMarket(MarketActivity activity) {
        return ActivityMarketingMapper.updaMarket(activity);
    }
}
