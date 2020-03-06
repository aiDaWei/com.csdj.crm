package com.csdj.crmproject.crmproject.controller.Instrument.CompanyInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.service.Instrument.CompanyInstrument.CompanyInstrumentService;
import com.csdj.crmproject.crmproject.service.Instrument.MySalesInstrument.MySalesInstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

/**
 * @ Description   :  公司仪表盘控制器层
 * @ Author        :  JY
 * @ CreateDate    :  2020/2/19 12:23
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2020/2/19 12:23
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Controller
@RequestMapping("/company")
public class CompanyInstrumentController {

    @Autowired
    private CompanyInstrumentService service;

    @RequestMapping("/info")
    public String show(){
        return "/Instrument/CompanyInstrument/CompanyInstrumentHtml";
    }





    /**
     * 查询 订单仪表盘
     *
     * @param request
     * @return
     */
    @RequestMapping("selOrder")
    @ResponseBody
    public Map<String, Object> selDianaOrder(HttpServletRequest request) {
        System.out.println("");
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        String month = String.valueOf(date.get(Calendar.MONTH) + 1);
        CusSalesTarget cusSalesTarget = service.getOrder( year);
        Map<String, Object> map = new HashMap<String, Object>();
        //本月销售业绩
        double dianasOrder = 0;
        Object order = null;
        Map<Object, String> map1 = service.dianasOrder();
        if (map1 == null) {
            dianasOrder = 0;
        } else {
            order = map1.get("order_Amount_remitted");
        }

        Object order11 = null;
        double dianasContract = 0;
        Map<Object, String> map11 = service.dianasContract();
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
        }
        dianasOrder = Double.parseDouble(String.valueOf(order == null ? 0 : Double.parseDouble(order.toString()))) / predict * 100;//订单
        System.out.println("dianasOrder:"+dianasOrder);
        dianasContract = Double.parseDouble(String.valueOf(order11 == null ? 0 : Double.parseDouble(order11.toString()))) / predict * 100;//合同
        System.out.println("dianasContract:"+dianasContract);
        //本季销售业绩
        int month1 = date.get(Calendar.MONTH) + 1;
        double seasonOrder = 0;
        Object order1 = null;
        Map<Object, String> map2 = service.seasonOrder();
        if (map2 == null) {
            seasonOrder = 0;
        } else {
            order1 = map2.get("order_Amount_remitted");
        }

        double seasonContract = 0;
        Object order22 = null;
        Map<Object, String> map22 = service.seasonContract();
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
        Map<Object, String> map3 = service.yearOrder();
        if (map3 == null) {
            yearOrder = 0;
        } else {
            order2 = map3.get("order_Amount_remitted");
        }

        double yearContract = 0;
        Object order33 = null;
        Map<Object, String> map33 = service.yearContract();
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
     * @param request
     * @return
     */
    @RequestMapping("getOrder")
    @ResponseBody
    public List<Object> getOrder(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        String userId = Long.toString(user.getPkUserId());
        List<Object> list = new ArrayList<Object>();
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        CusSalesTarget cusSalesTarget = service.getOrder( year);
        Map<Object, String> map1 = service.order();
        Map<Object, String> map2 = service.contract();
        list.add(map1);
        list.add(cusSalesTarget);
        list.add(map2);
        return list;
    }

    /**
     * 查询回款统计图
     *
     * @param request
     * @return
     */
    @RequestMapping("getReceiPlan")
    @ResponseBody
    public Map<String, Double> getReceiPlan(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        String userId = Long.toString(user.getPkUserId());
        Map<String, Double> map = new HashMap<String, Double>();
        Double dianasOrReceiPlan = service.dianasOrReceiPlan() == null ? 0.0 : service.dianasOrReceiPlan();
        Double dianasReceiPlan = service.dianasRecei_plan() == null ? 0.0 : service.dianasRecei_plan();

        Double seasonOrReceiPlan = service.seasonOrReceiPlan() == null ? 0.0 : service.seasonOrReceiPlan();
        Double seasonReceiPlan = service.seasonRecei_plan() == null ? 0.0 : service.seasonRecei_plan();

        Double yearOrReceiPlan = service.yearOrReceiPlan() == null ? 0.0 : service.yearOrReceiPlan();
        Double yearReceiPlan = service.yearRecei_plan() == null ? 0.0 : service.yearRecei_plan();

        map.put("dianasReceiPlan",fun(dianasOrReceiPlan/dianasReceiPlan*100));
        map.put("seasonReceiPlan",fun(seasonOrReceiPlan/seasonReceiPlan*100));
        map.put("yearReceiPlan",fun(yearOrReceiPlan/yearReceiPlan*100));
        return map;
    }

    /**
     * 查询统计图月度订单
     *
     * @param request
     * @return
     */
    @RequestMapping("getYearPercentage")
    @ResponseBody
    public List<Object> getYearPercentage(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        String userId = Long.toString(user.getPkUserId());
        List<Object> list = new ArrayList<Object>();
        Map<String, Double> map1 = service.yearAccomplish();
        Map<String, Double> map2 = service.yearAnswerAccomplish();
        list.add(map1);
        list.add(map2);
        return list;
    }


    /**
     * 使用精确小数BigDecimal
     */
    public double fun(double f) {
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
}
