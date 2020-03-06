package com.csdj.crmproject.crmproject.controller.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument.SalesmanInstrumentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * @ClassName SalesmanInstrumentController
 * @Description: 销售仪表盘控制层
 * @Author 唐浪
 * @Date 2019/2/6
 * @Version V1.0
 **/
@Controller
@RequestMapping("salesmanInstrument")
public class SalesmanInstrumentController {
    @Resource
    private SalesmanInstrumentService salesmanInstrumentService;


    /**
     * 展示统计页面
     *
     * @return 页面
     */
    @RequestMapping("showSalesmanInstrument")
    public String showSalesmanInstrument() {
        return "/Instrument/SalesmanInstrument/SalesmanInstrument";
    }

    /**
     * 绑定业务员下拉列表框
     *
     * @return Map
     */
    @GetMapping("listUsers")
    @ResponseBody
    public Map<String, Object> listUsers() {
        List<User> list = salesmanInstrumentService.listUsers();
        Map<String, Object> map = new HashMap<>(0);
        map.put("data", list);
        return map;
    }

    /**
     * 返回统计的数据源
     *
     * @return Map
     */
    @PostMapping("staticResult")
    @ResponseBody
    public Map<String, Object> staticResult(@RequestParam(value = "userId", required = false) Integer userId) {
        Map<String, Object> map = new HashMap<>(0);
        //回款业绩
        map.put("receiveMonthData",salesmanInstrumentService.countReceivableMonth(userId));
        System.err.println(salesmanInstrumentService.countReceivableMonth(userId));
        map.put("receiveQuarterData",salesmanInstrumentService.countReceivableQuarter(userId));
        map.put("receiveYearData",salesmanInstrumentService.countReceivableYear(userId));
        map.put("receiveMonthAvgPlan",salesmanInstrumentService.avgReceivableMonth(userId));
        map.put("receiveMonthAvgTrue",salesmanInstrumentService.avgReceivableMonthOK(userId));
        //销售预测数据源
        map.put("saleForecasting1", salesmanInstrumentService.countSaleForecasting1(userId));
        map.put("saleForecasting2", salesmanInstrumentService.countSaleForecasting2(userId));
        map.put("saleForecasting3", salesmanInstrumentService.countSaleForecasting3(userId));
        map.put("saleForecasting4", salesmanInstrumentService.countSaleForecasting4(userId));
        map.put("saleForecasting5", salesmanInstrumentService.countSaleForecasting5(userId));
        map.put("saleForecasting6", salesmanInstrumentService.countSaleForecasting6(userId));
        //每月销售勤奋度
        map.put("countSales1", salesmanInstrumentService.countSalesWith(userId));
        map.put("countSales2", salesmanInstrumentService.countCluesWith(userId));
        map.put("countSales3", salesmanInstrumentService.countCustomerWith(userId));
        map.put("countSales4", salesmanInstrumentService.countSalesIncrease(userId));
        map.put("countSales5", salesmanInstrumentService.countCluesIncrease(userId));
        map.put("countSales6", salesmanInstrumentService.countCustomerIncrease(userId));
        return map;
    }
    /**
     * 返回销售业绩统计的数据源
     *
     * @return Map
     */
    @PostMapping("staticResultSale")
    @ResponseBody
    public Map<String, Object> staticResultSale(@RequestParam(value = "userId", required = false) Integer userId,
                                            @RequestParam(value = "hood", required = false) String hood) {
        Map<String, Object> map = new HashMap<>(1);
        //销售业绩
        StatisticalResult saleMonthData = salesmanInstrumentService.countSaleableMonth(userId, hood);
        map.put("saleMonthData",salesmanInstrumentService.countSaleableMonth(userId, hood));
        System.err.println("aaaaaaaaaaaaaaaaaaaa"+salesmanInstrumentService.countSaleableMonth(userId, hood).completeValue);
        map.put("saleQuarterData",salesmanInstrumentService.countSaleableQuarter(userId, hood));
        map.put("saleYearData",salesmanInstrumentService.countSaleableYear(userId, hood));
        map.put("saleMonthAvgPlan",salesmanInstrumentService.avgSaleableMonth(userId, hood));
        map.put("saleMonthAvgTrue",salesmanInstrumentService.avgSaleableMonthOK(userId, hood));
        return map;
    }
}
