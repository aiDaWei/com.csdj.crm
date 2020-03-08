package com.csdj.crmproject.crmproject.controller.Marketing.ActivityMarketing;

import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketAttach;
import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityAttachService;
import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityMarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ActivityAttach")
public class ActivityAttachController {
    @Autowired
    ActivityAttachService service;


    @RequestMapping("/skipPage")
    @ResponseBody
    public Object skipShow(HttpServletRequest request,Integer pkMarkActivityId){
        int page =Integer.parseInt(request.getParameter("page"));
        int limit =Integer.parseInt(request.getParameter("limit"));
        List<MarketAttach> list = service.Smarketattach(page,limit,pkMarkActivityId);
        int sum =service.AttCount();
        System.out.println("******11**********"+JSON.toJSONString(list));
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("data",list);
        map.put("count",service.AttCount());
        //System.out.println("JSON："+json);
        return map;
    }

    @RequestMapping("/InAtt")
    @ResponseBody
    public int addshow(MarketAttach Att){
        MarketActivity mar=new MarketActivity();
        int num=service.InAtt(Att);
        return num;
    }
    @RequestMapping("/delAtt")
    @ResponseBody
    public int delshow(int pkMarkAttachId){
        int num=service.delAtt(pkMarkAttachId);
        return num;
    }

}
