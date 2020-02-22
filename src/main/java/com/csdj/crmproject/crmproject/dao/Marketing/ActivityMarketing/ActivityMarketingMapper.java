package com.csdj.crmproject.crmproject.dao.Marketing.ActivityMarketing;

import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ActivityMarketingMapper {
    //查询所有
    List<MarketActivity> activi();
    //查询总记录数
    public int marketCount();
    //增加
    int addMarket(MarketActivity activity);
    //逻辑删除
    int delMarket(int pkMarkActivityId);
    //按编号查询
    public MarketActivity uppkMarkActivityId(@Param(value = "pkMarkActivityId") int pkMarkActivityId);
    //修改
    int updaMarket(MarketActivity activity);

}
