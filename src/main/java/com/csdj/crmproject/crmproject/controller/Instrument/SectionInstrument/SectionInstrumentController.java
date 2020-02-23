package com.csdj.crmproject.crmproject.controller.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import com.csdj.crmproject.crmproject.service.Instrument.SectionInstrument.SectionInstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sound.midi.Instrument;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName SectionInstrumentController
 * @Description: SectionInstrumentController
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version V1.0
 **/
@Controller
public class SectionInstrumentController {
    @Autowired
    private SectionInstrumentService service;

    /**
     * 展示部门销售统计页面
     * @return 销售统计页面路径
     */
    @RequestMapping("/showSectionInstrument")
    public String showSectionInstrument() {
        return "/Instrument/SectionInstrument/SectionInstrument";
    }
    /**
     * 绑定部门下拉列表框
     * @return Map集合
     */
    @RequestMapping("/listDepartment")
    @ResponseBody
    public Map<String, Object> listDepartment() {
        List<Department> list = service.listDepartmentService();
        Map<String,Object> map = new HashMap<String,Object>(0);
        map.put("data",list);
        return map;
    }
    /**
     *销售业绩
     * @return Map
     */
    @PostMapping("/salesResults")
    @ResponseBody
    public Map<String, Object> salesResults(@RequestParam(value = "dip", required = false) Integer dip) {
        Map<String, Object> map = new HashMap<>(0);
        //销售预测数据源
        map.put("avgSales1", service.avgSalesOrderService(dip));
        map.put("avgSales2", service.avgSalesContractService(dip));
        map.put("sumOrder", service.sumOrderMonthService(dip));
        map.put("sumOrderOK", service.sumOrderMonthOKService(dip));
        map.put("sumContract", service.sumContractMonthService(dip));
        map.put("sumContractOK", service.sumContractMonthOKService(dip));
        return map;
    }
    /**
     * 本月回款业绩完成值
     * @return Map集合
     */
    @RequestMapping("/countReceivableMonth")
    @ResponseBody
    public Map<String, Object> countReceivableMonth(@RequestParam(value = "dip",  required = false) Integer dip) {
        StatisticalResult count = service.countReceivableMonthService(dip);
        Map<String,Object> map = new HashMap<String,Object>(0);
        map.put("data",count);
        return map;
    }
    /**
     * 本季回款业绩完成值
     * @return Map集合
     */
    @RequestMapping("/countReceivableQuarter")
    @ResponseBody
    public Map<String, Object> countReceivableQuarter(@RequestParam(value = "dip",  required = false) Integer dip) {
        StatisticalResult count = service.countReceivableQuarterService(dip);
        Map<String,Object> map = new HashMap<String,Object>(0);
        map.put("data",count);
        return map;
    }
    /**
     * 本年回款业绩完成值
     * @return Map集合
     */
    @RequestMapping("/countReceivableYear")
    @ResponseBody
    public Map<String, Object> countReceivableYear(@RequestParam(value = "dip",  required = false) Integer dip) {
        StatisticalResult count = service.countReceivableYearService(dip);
        Map<String,Object> map = new HashMap<String,Object>(0);
        map.put("data",count);
        return map;
    }
    /**
     * 月度回款额统计图
     * @return Map集合
     */
    @RequestMapping("/avgReceivableMonth")
    @ResponseBody
    public Map<String, Object> avgReceivableMonth(@RequestParam(value = "dip",  required = false) Integer dip) {
        Map<String,Object> count = service.avgReceivableMonthService(dip);
        Map<String,Object> count1=service.avgReceivableMonthOKService(dip);
        Map<String,Object> map = new HashMap<String,Object>(0);
        map.put("data",count);
        map.put("data1",count1);
        return map;
    }
    /**
     * 返回统计的数据源
     *
     * @return Map
     */
    @PostMapping("/countSaleForecasting")
    @ResponseBody
    public Map<String, Object> countSaleForecasting(@RequestParam(value = "dip", required = false) Integer dip) {
        Map<String, Object> map = new HashMap<String,Object>(0);
        //销售预测数据源
        map.put("saleForecasting1", service.countSaleForecasting1Service(dip));
        map.put("saleForecasting2", service.countSaleForecasting2Service(dip));
        map.put("saleForecasting3", service.countSaleForecasting3Service(dip));
        map.put("saleForecasting4", service.countSaleForecasting4Service(dip));
        map.put("saleForecasting5", service.countSaleForecasting5Service(dip));
        map.put("saleForecasting6", service.countSaleForecasting6Service(dip));
        return map;
    }
    /**
     *每月销售
     * @return Map
     */
    @PostMapping("/countSales")
    @ResponseBody
    public Map<String, Object> countSales(@RequestParam(value = "dip", required = false) Integer dip) {
        Map<String, Object> map = new HashMap<String,Object>(0);
        //销售预测数据源
        map.put("countSales1", service.countSalesWithService(dip));
        map.put("countSales2", service.countCluesWithService(dip));
        map.put("countSales3", service.countCustomerWithService(dip));
        map.put("countSales4", service.countSalesIncreaseService(dip));
        map.put("countSales5", service.countCluesIncreaseService(dip));
        map.put("countSales6", service.countCustomerIncreaseService(dip));
        return map;
    }
}
