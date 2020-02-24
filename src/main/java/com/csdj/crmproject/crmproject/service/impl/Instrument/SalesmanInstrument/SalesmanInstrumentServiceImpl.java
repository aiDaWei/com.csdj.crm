package com.csdj.crmproject.crmproject.service.impl.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.SalesmanInstrument.SalesmanInstrumentMapper;
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
    public StatisticalResult countSaleableMonth(Integer userId, String saleType) {
        return salesmanInstrumentMapper.countSaleableMonth(userId, saleType);
    }

    @Override
    public StatisticalResult countSaleableQuarter(Integer userId, String saleType) {
        return salesmanInstrumentMapper.countSaleableQuarter(userId, saleType);
    }

    @Override
    public StatisticalResult countSaleableYear(Integer userId, String saleType) {
        return salesmanInstrumentMapper.countSaleableYear(userId, saleType);
    }

    @Override
    public Map<String, Object> avgSaleableMonth(Integer userId, String saleType) {
        return salesmanInstrumentMapper.avgSaleableMonth(userId, saleType);
    }

    @Override
    public Map<String, Object> avgSaleableMonthOK(Integer userId, String saleType) {
        return salesmanInstrumentMapper.avgSaleableMonthOK(userId, saleType);
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
