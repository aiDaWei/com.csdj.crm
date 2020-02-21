package com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing;

import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityMarketingService {
    //查询所有活动
    public List<MarketActivity> activi();
    //查询总记录数
    public int marketCount();
    //增加
    public int addMarket(MarketActivity activity);
    //逻辑删除
    int delMarket(int pkMarkActivityId);
    //按编号查询
    public MarketActivity uppkMarkActivityId(@Param(value = "pkMarkActivityId") int pkMarkActivityId);
    //修改
    int updaMarket(MarketActivity activity);
}
