package com.csdj.crmproject.crmproject.service.impl.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.SalesmanInstrument.SalesmanInstrumentMapper;
import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument.SalesmanInstrumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName SalesmanInstrumentServiceImpl
 * @Description: 销售仪表盘业务接口实现层
 * @Author 唐浪
 * @Date 2019/2/6
 * @Version V1.0
 **/
@Service
public class SalesmanInstrumentServiceImpl implements SalesmanInstrumentService {

    @Resource
    private SalesmanInstrumentMapper salesmanInstrumentMapper;

    @Override
    public List<User> listUsers() {
        return salesmanInstrumentMapper.listUsers();
    }

    @Override
    public StatisticalResult countSaleForecasting1(Integer userId) {
        return salesmanInstrumentMapper.countSaleForecasting1(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting2(Integer userId) {
        return salesmanInstrumentMapper.countSaleForecasting2(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting3(Integer userId) {
        return salesmanInstrumentMapper.countSaleForecasting3(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting4(Integer userId) {
        return salesmanInstrumentMapper.countSaleForecasting4(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting5(Integer userId) {
        return salesmanInstrumentMapper.countSaleForecasting5(userId);
    }

    @Override
    public StatisticalResult countSaleForecasting6(Integer userId) {
        return salesmanInstrumentMapper.countSaleForecasting6(userId);
    }

    @Override
    public StatisticalResult countRetrospectiveMonth(Integer userId) {
        return salesmanInstrumentMapper.countRetrospectiveMonth(userId);
    }

    @Override
    public StatisticalResult countRetrospectiveQuarter(Integer userId) {
        return salesmanInstrumentMapper.countRetrospectiveQuarter(userId);
    }

    @Override
    public StatisticalResult countRetrospectiveYear(Integer userId) {
        return salesmanInstrumentMapper.countRetrospectiveYear(userId);
    }

    @Override
    public CusSalesTarget reviewPerformancePlan(Integer userId) {
        return salesmanInstrumentMapper.reviewPerformancePlan(userId);
    }

    ////////////////////////////////////////////////////////////
    @Override
    public CusSalesTarget getOrder(String userId,String year) {
        return salesmanInstrumentMapper.getOrder(userId,year);
    }

    @Override
    public Map<Object, String> dianasOrder(String userId) {
        return salesmanInstrumentMapper.dianasOrder(userId);
    }

    @Override
    public Map<Object, String> seasonOrder(String userId) {
        return salesmanInstrumentMapper.seasonOrder(userId);
    }

    @Override
    public Map<Object, String> yearOrder(String userId) {
        return salesmanInstrumentMapper.yearOrder(userId);
    }

    @Override
    public Map<Object, String> contract(String userId) {
        return salesmanInstrumentMapper.contract(userId);
    }

    @Override
    public Map<Object, String> dianasContract(String userId) {
        return salesmanInstrumentMapper.dianasContract(userId);
    }

    @Override
    public Map<Object, String> order(String userId) {
        return salesmanInstrumentMapper.order(userId);
    }

    @Override
    public Map<Object, String> seasonContract(String userId) {
        return salesmanInstrumentMapper.seasonContract(userId);
    }

    @Override
    public Map<Object, String> yearContract(String userId) {
        return salesmanInstrumentMapper.yearContract(userId);
    }

    @Override
    public Double dianasOrReceiPlan(String userId) {
        return salesmanInstrumentMapper.dianasOrReceiPlan(userId);
    }

    @Override
    public Double dianasRecei_plan(String userId) {
        return salesmanInstrumentMapper.dianasRecei_plan(userId);
    }

    @Override
    public Double seasonOrReceiPlan(String userId) {
        return salesmanInstrumentMapper.seasonOrReceiPlan(userId);
    }

    @Override
    public Double seasonRecei_plan(String userId) {
        return salesmanInstrumentMapper.seasonRecei_plan(userId);
    }

    @Override
    public Double yearOrReceiPlan(String userId) {
        return salesmanInstrumentMapper.yearOrReceiPlan(userId);
    }

    @Override
    public Double yearRecei_plan(String userId) {
        return salesmanInstrumentMapper.yearRecei_plan(userId);
    }

    @Override
    public Map<String, Double> yearAccomplish(String userId) {
        return salesmanInstrumentMapper.yearAccomplish(userId);
    }

    @Override
    public Map<String, Double> yearAnswerAccomplish(String userId) {
        return salesmanInstrumentMapper.yearAnswerAccomplish(userId);
    }

    @Override
    public StatisticalResult countReceivableMonth(Integer userId) {
        return salesmanInstrumentMapper.countReceivableMonth(userId);
    }

    @Override
    public StatisticalResult countReceivableQuarter(Integer userId) {
        return salesmanInstrumentMapper.countReceivableQuarter( userId);
    }

    @Override
    public StatisticalResult countReceivableYear(Integer userId) {
        return salesmanInstrumentMapper.countReceivableYear( userId);
    }

    @Override
    public Map<String, Object> avgReceivableMonth(Integer userId) {
        return salesmanInstrumentMapper.avgReceivableMonth( userId);
    }

    @Override
    public Map<String, Object> avgReceivableMonthOK(Integer userId) {
        return salesmanInstrumentMapper.avgReceivableMonthOK( userId);
    }


    @Override
    public Map<String, Object> countSalesWith(Integer userId) {
        return salesmanInstrumentMapper.countSalesIncrease(userId);
    }

    @Override
    public Map<String, Object> countSalesIncrease(Integer userId) {
        return salesmanInstrumentMapper.countSalesIncrease(userId);
    }

    @Override
    public Map<String, Object> countCluesWith(Integer userId) {
        return salesmanInstrumentMapper.countCluesWith(userId);
    }

    @Override
    public Map<String, Object> countCluesIncrease(Integer userId) {
        return salesmanInstrumentMapper.countCluesIncrease(userId);
    }

    @Override
    public Map<String, Object> countCustomerWith(Integer userId) {
        return salesmanInstrumentMapper.countCustomerWith(userId);
    }

    @Override
    public Map<String, Object> countCustomerIncrease(Integer userId) {
        return salesmanInstrumentMapper.countCustomerIncrease(userId);
    }
}
