package com.csdj.crmproject.crmproject.controller.Marketing.ActivityMarketing;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;

import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityMarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ActivityMarketing")
public class ActivityMarketingController {

    @Autowired
    ActivityMarketingService service;
    @Resource
    private RedisTemplate redisTemplate;
    //打开页面
    @RequestMapping("/marketing")
    public String selShow(){
        return "/Marketing/ActivityMarketing/ActivityMarketingHTML";
    }


   @RequestMapping("/skipPage")
    @ResponseBody
    public Object skipShow(HttpServletRequest request,@RequestParam(value ="activityApprovalProcess",required = false)String activityApprovalProcess){
       int page =Integer.parseInt(request.getParameter("page"));
       int limit =Integer.parseInt(request.getParameter("limit"));
       List<MarketActivity> list = service.activi(page,limit,activityApprovalProcess);
       System.out.println("进入是》》》"+list.size());
       int sum =service.marketCount(activityApprovalProcess);


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("data",service.activi(page,limit,activityApprovalProcess));
        map.put("count",service.marketCount(activityApprovalProcess));
        //System.out.println("JSON："+json);
        return map;
    }

    @RequestMapping("/addMarket")
    @ResponseBody
    public int addshow(MarketActivity activity){
        MarketActivity mar=new MarketActivity();
        int num=service.addMarket(activity);
        return num;
    }

    @RequestMapping("/delMarket")
    @ResponseBody
    public int delshow(int pkMarkActivityId){
        MarketActivity mar=new MarketActivity();
        int num=service.delMarket(pkMarkActivityId);
        System.out.println("2345678"+num);
        return num;
    }

    @RequestMapping("/updateID")
    public String updateOrderHtml(int pkMarkActivityId, Model model){
        MarketActivity order=service.uppkMarkActivityId(pkMarkActivityId);
        model.addAttribute("order",order);
        return "Marketing/ActivityMarketing/update";
    }
    @RequestMapping("/updateKet")
    @ResponseBody
    public int updateOrder(MarketActivity activity){
        int i=service.updaMarket(activity);
        return i;
    }



}
