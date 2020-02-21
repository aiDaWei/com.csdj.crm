package com.csdj.crmproject.crmproject.controller.Marketing.ActivityMarketing;

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
    public Object skipShow(@RequestParam(value = "page", required = false, defaultValue = "1") int pageNum,
                           @RequestParam(value = "limit", required = false, defaultValue = "4") int pageSize){
        List<MarketActivity> list= service.activi();
        System.out.println("JSON："+list);
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("data",service.activi());
        map.put("count",5);
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
