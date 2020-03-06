package com.csdj.crmproject.crmproject.dao.Marketing.ActivityMarketing;

import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketAttach;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface ActivityAttachMapper {
    //查询所有
    List<MarketAttach> Smarketattach(Integer pkMarkActivityId);
    //查询总记录数
    public int AttCount();
    //增加
    public int InAtt(MarketAttach Att);
    //逻辑删除
    public int delAtt(int pkMarkAttachId);

}
