package com.csdj.crmproject.crmproject.controller.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument.SalesmanInstrumentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
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
    public Map<String, Object> staticResult(@RequestParam(value = "userId", required = false) Integer userId,
                                            @RequestParam(value = "hood", required = false) String hood) {
        Map<String, Object> map = new HashMap<>(0);
        //回款
        //本月
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
     * 查询 订单仪表盘
     *
     * @param userId
     * @return
     */
    public Map<String, Object> selDianaOrder(String userId) {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        String month = String.valueOf(date.get(Calendar.MONTH) + 1);
        CusSalesTarget cusSalesTarget = salesmanInstrumentService.getOrder(userId, year);
        Map<String, Object> map = new HashMap<String, Object>();
        //本月销售业绩
        double dianasOrder = 0;
        Object order = null;
        Map<Object, String> map1 = salesmanInstrumentService.dianasOrder(userId);
        if (map1 == null) {
            dianasOrder = 0;
        } else {
            order = map1.get("order_Amount_remitted");
        }

        Object order11 = null;
        double dianasContract = 0;
        Map<Object, String> map11 = salesmanInstrumentService.dianasContract(userId);
        if (map11 == null) {
            dianasContract = 0;
        } else {
            order11 = map11.get("contract_saleroom");
        }


        double predict = 0;
        switch (month) {
            case "1":
                predict = cusSalesTarget.getCusSalesTarJanuary();
                break;
            case "2":
                predict = cusSalesTarget.getCusSalesTarFebruary();
                break;
            case "3":
                predict = cusSalesTarget.getCusSalesTarMarch();
                break;
            case "4":
                predict = cusSalesTarget.getCusSalesTarApril();
                break;
            case "5":
                predict = cusSalesTarget.getCusSalesTarMay();
                break;
            case "6":
                predict = cusSalesTarget.getCusSalesTarJun();
                break;
            case "7":
                predict = cusSalesTarget.getCusSalesTarJuly();
                break;
            case "8":
                predict = cusSalesTarget.getCusSalesTarAugust();
                break;
            case "9":
                predict = cusSalesTarget.getCusSalesTarSeptember();
                break;
            case "10":
                predict = cusSalesTarget.getCusSalesTarOctober();
                break;
            case "11":
                predict = cusSalesTarget.getCusSalesTarNovember();
                break;
            case "12":
                predict = cusSalesTarget.getCusSalesTarDecember();
                break;
            default:
                break;
        }
        dianasOrder = Double.parseDouble(String.valueOf(order == null ? 0 : Double.parseDouble(order.toString()))) / predict * 100;//订单
        dianasContract = Double.parseDouble(String.valueOf(order11 == null ? 0 : Double.parseDouble(order11.toString()))) / predict * 100;//合同
        //本季销售业绩
        int month1 = date.get(Calendar.MONTH) + 1;
        double seasonOrder = 0;
        Object order1 = null;
        Map<Object, String> map2 = salesmanInstrumentService.seasonOrder(userId);
        if (map2 == null) {
            seasonOrder = 0;
        } else {
            order1 = map2.get("order_Amount_remitted");
        }

        double seasonContract = 0;
        Object order22 = null;
        Map<Object, String> map22 = salesmanInstrumentService.seasonContract(userId);
        if (map22 == null) {
            seasonContract = 0;
        } else {
            order22 = map22.get("contract_saleroom");
        }

        double predict1 = 0;
        if (month1 <= 3) {
            predict1 = cusSalesTarget.getCusSalesTarJanuary() + cusSalesTarget.getCusSalesTarFebruary() + cusSalesTarget.getCusSalesTarMarch();
        }
        if (month1 >= 4 && month1 <= 6) {
            predict1 = cusSalesTarget.getCusSalesTarApril() + cusSalesTarget.getCusSalesTarMay() + cusSalesTarget.getCusSalesTarJun();
        }
        if (month1 >= 7 && month1 <= 9) {
            predict1 = cusSalesTarget.getCusSalesTarJuly() + cusSalesTarget.getCusSalesTarAugust() + cusSalesTarget.getCusSalesTarSeptember();
        }
        if (month1 >= 10 && month1 <= 12) {
            predict1 = cusSalesTarget.getCusSalesTarOctober() + cusSalesTarget.getCusSalesTarNovember() + cusSalesTarget.getCusSalesTarDecember();
        }
        seasonOrder = Double.parseDouble(String.valueOf(order1 == null ? 0 : Double.parseDouble(order1.toString()))) / predict1 * 100;
        seasonContract = Double.parseDouble(String.valueOf(order22 == null ? 0 : Double.parseDouble(order22.toString()))) / predict1 * 100;


        //本年销售业绩
        double yearOrder = 0;
        Object order2 = null;
        Map<Object, String> map3 = salesmanInstrumentService.yearOrder(userId);
        if (map3 == null) {
            yearOrder = 0;
        } else {
            order2 = map3.get("order_Amount_remitted");
        }

        double yearContract = 0;
        Object order33 = null;
        Map<Object, String> map33 = salesmanInstrumentService.yearContract(userId);
        if (map33 == null) {
            yearContract = 0;
        } else {
            order33 = map33.get("contract_saleroom");

        }

        double predict2 = 0;
        predict2 = cusSalesTarget.getCusSalesTarJanuary() + cusSalesTarget.getCusSalesTarFebruary() + cusSalesTarget.getCusSalesTarMarch() +
                cusSalesTarget.getCusSalesTarApril() + cusSalesTarget.getCusSalesTarMay() + cusSalesTarget.getCusSalesTarJun() +
                cusSalesTarget.getCusSalesTarJuly() + cusSalesTarget.getCusSalesTarAugust() + cusSalesTarget.getCusSalesTarSeptember() +
                cusSalesTarget.getCusSalesTarOctober() + cusSalesTarget.getCusSalesTarNovember() + cusSalesTarget.getCusSalesTarDecember();
        yearOrder = Double.parseDouble(String.valueOf(order2 == null ? 0 : Double.parseDouble(order2.toString()))) / predict2 * 100;
        yearContract = Double.parseDouble(String.valueOf(order33 == null ? 0 : Double.parseDouble(order33.toString()))) / predict2 * 100;
        map.put("dianasOrder", dianasOrder > 100 ? 100 : fun(dianasOrder));
        map.put("seasonOrder", seasonOrder > 100 ? 100 : fun(seasonOrder));
        map.put("yearOrder", yearOrder > 100 ? 100 : fun(yearOrder));

        map.put("dianasContract", dianasContract > 100 ? 100 : fun(dianasContract));
        map.put("seasonContract", seasonContract > 100 ? 100 : fun(seasonContract));
        map.put("yearContract", yearContract > 100 ? 100 : fun(yearContract));
        return map;
    }

    /**
     * 查询统计图月度订单
     *
     * @param userId
     * @return
     */
    public List<Object> getOrder(String userId) {
        List<Object> list = new ArrayList<Object>();
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        CusSalesTarget cusSalesTarget = salesmanInstrumentService.getOrder(userId, year);
        Map<Object, String> map1 = salesmanInstrumentService.order(userId);
        Map<Object, String> map2 = salesmanInstrumentService.contract(userId);
        list.add(map1);
        list.add(cusSalesTarget);
        list.add(map2);
        return list;
    }

    /**
     * 查询回款统计图
     *
     * @param userId
     * @return
     */
    public Map<String, Double> getReceiPlan(String userId) {
        Map<String, Double> map = new HashMap<String, Double>();
        Double dianasOrReceiPlan = salesmanInstrumentService.dianasOrReceiPlan(userId) == null ? 0.0 : salesmanInstrumentService.dianasOrReceiPlan(userId);
        Double dianasReceiPlan = salesmanInstrumentService.dianasRecei_plan(userId) == null ? 0.0 : salesmanInstrumentService.dianasRecei_plan(userId);

        Double seasonOrReceiPlan = salesmanInstrumentService.seasonOrReceiPlan(userId) == null ? 0.0 : salesmanInstrumentService.seasonOrReceiPlan(userId);
        Double seasonReceiPlan = salesmanInstrumentService.seasonRecei_plan(userId) == null ? 0.0 : salesmanInstrumentService.seasonRecei_plan(userId);

        Double yearOrReceiPlan = salesmanInstrumentService.yearOrReceiPlan(userId) == null ? 0.0 : salesmanInstrumentService.yearOrReceiPlan(userId);
        Double yearReceiPlan = salesmanInstrumentService.yearRecei_plan(userId) == null ? 0.0 : salesmanInstrumentService.yearRecei_plan(userId);

        map.put("dianasReceiPlan",fun(dianasOrReceiPlan/dianasReceiPlan*100));
        map.put("seasonReceiPlan",fun(seasonOrReceiPlan/seasonReceiPlan*100));
        map.put("yearReceiPlan",fun(yearOrReceiPlan/yearReceiPlan*100));
        return map;
    }

    /**
     * 查询统计图月度订单
     *
     * @param userId
     * @return
     */
    public List<Object> getYearPercentage(String userId) {
        List<Object> list = new ArrayList<Object>();
        Map<String, Double> map1 = salesmanInstrumentService.yearAccomplish(userId);
        Map<String, Double> map2 = salesmanInstrumentService.yearAnswerAccomplish(userId);
        list.add(map1);
        list.add(map2);
        return list;
    }


    /**
     * 使用精确小数BigDecimal
     */
    public double fun(double f) {
        if(f>0){
            BigDecimal bg = new BigDecimal(f);
            /**
             * 参数：
             newScale - 要返回的 BigDecimal 值的标度。
             roundingMode - 要应用的舍入模式。
             返回：
             一个 BigDecimal，其标度为指定值，其非标度值可以通过此 BigDecimal 的非标度值乘以或除以十的适当次幂来确定。
             */
            return bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
       return 1;
    }
}
