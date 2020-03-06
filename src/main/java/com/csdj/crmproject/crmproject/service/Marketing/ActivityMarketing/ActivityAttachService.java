package com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing;

import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketAttach;

import java.util.List;

public interface ActivityAttachService {
    //查询所有活动
    public List<MarketAttach> Smarketattach(int page, int limit,Integer pkMarkActivityId);
    //查询总记录数
    public int AttCount();
    //增加
    public int InAtt(MarketAttach Att);
    //逻辑删除
    public int delAtt(int pkMarkAttachId);
}
