package com.csdj.crmproject.crmproject.controller.Sales.SalesmanSalesTarget;

import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.service.impl.Sales.SalesmanSalesTarget.SalesmanSalesTargetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("salesman")
@Controller
public class SalesmanSalesTargetController {
    @Autowired
    SalesmanSalesTargetServiceImpl service;

    /**
     * 跳转到页面的
     * @return 页面
     */
    @RequestMapping("SalesmanSalesTarget")
    public String salesmanSalesTarget(){
        System.out.println("业务员销售目标");
        return "sales/SalesmanSalesTarget/SalesmanSalesTarget";
    }

    @ResponseBody
    @RequestMapping("SalemanSalesTargetList")
    public String list( int selType,int id, HttpServletRequest request){
        int page =Integer.parseInt(request.getParameter("page"));
        int limit =Integer.parseInt(request.getParameter("limit"));
        System.out.println(selType+"====="+id);
        List list = service.findPage(page,limit,selType,id);
        System.out.println("进入是》》》"+list.size());
        int sum =service.getCount(selType,id);

        Map<Object,Object> map=new HashMap<Object,Object>();
        map.put("code",0);
        map.put("msg","\"\"");
        map.put("count",sum);
        map.put("data",list);

        return JSON.toJSONString(map);
    }

    @ResponseBody
    @RequestMapping("isDel")
    public String isDel(int salesId){
        int res = service.isDelStatus(salesId);
        return res+"";
    }

    @ResponseBody
    @RequestMapping("addSales")
    public String add(CusSalesTarget salesTarget){
        salesTarget.setPkCusSalesTargetId(0);
        System.out.println(salesTarget);
        int res =service.addSales(salesTarget);
        return res+"";
    }

    @ResponseBody
    @RequestMapping("updSales")
    public String updSales(CusSalesTarget salesTarget){
        System.out.println("upd---"+salesTarget);
        int res =service.updSales(salesTarget);
        System.out.println(res);
        return  res+"";
    }

}
