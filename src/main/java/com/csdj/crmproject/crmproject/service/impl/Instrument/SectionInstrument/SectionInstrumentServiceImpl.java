package com.csdj.crmproject.crmproject.service.impl.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.SectionInstrument.SectionInstrumentMapper;
import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import com.csdj.crmproject.crmproject.service.Instrument.SectionInstrument.SectionInstrumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version 1.0
 */
@Service
public class SectionInstrumentServiceImpl implements SectionInstrumentService {
    @Resource
    private SectionInstrumentMapper objMapp;

    @Override
    public List<Department> listDepartmentService() {
        return objMapp.listDepartment();
    }

    @Override
    public Map<String, Object> avgSalesOrderService(Integer dip) {
        return objMapp.avgSalesOrder(dip);
    }

    @Override
    public Map<String, Object> avgSalesContractService(Integer dip) {
        return objMapp.avgSalesContract(dip);
    }

    @Override
    public Map<String, Object> sumOrderMonthService(Integer dip) {
        return objMapp.sumOrderMonth(dip);
    }

    @Override
    public Map<String, Object> sumOrderMonthOKService(Integer dip) {
        return objMapp.sumOrderMonthOK(dip);
    }

    @Override
    public Map<String, Object> sumContractMonthService(Integer dip) {
        return objMapp.sumContractMonth(dip);
    }

    @Override
    public Map<String, Object> sumContractMonthOKService(Integer dip) {
        return objMapp.sumContractMonthOK(dip);
    }

    @Override
    public StatisticalResult countReceivableMonthService(Integer dip) {
        return objMapp.countReceivableMonth(dip);
    }

    @Override
    public StatisticalResult countReceivableQuarterService(Integer dip) {
        return objMapp.countReceivableQuarter(dip);
    }

    @Override
    public StatisticalResult countReceivableYearService(Integer dip) {
        return objMapp.countReceivableYear(dip);
    }

    @Override
    public Map<String, Object> avgReceivableMonthService(Integer dip) {
        return objMapp.avgReceivableMonth(dip);
    }

    @Override
    public Map<String, Object> avgReceivableMonthOKService(Integer dip) {
        return objMapp.avgReceivableMonthOK(dip);
    }

    @Override
    public StatisticalResult countSaleForecasting1Service(Integer dip) {
        return objMapp.countSaleForecasting1(dip);
    }

    @Override
    public StatisticalResult countSaleForecasting2Service(Integer dip) {
        return objMapp.countSaleForecasting2(dip);
    }

    @Override
    public StatisticalResult countSaleForecasting3Service(Integer dip) {
        return objMapp.countSaleForecasting3(dip);
    }

    @Override
    public StatisticalResult countSaleForecasting4Service(Integer dip) {
        return objMapp.countSaleForecasting4(dip);
    }

    @Override
    public StatisticalResult countSaleForecasting5Service(Integer dip) {
        return objMapp.countSaleForecasting5(dip);
    }

    @Override
    public StatisticalResult countSaleForecasting6Service(Integer dip) {
        return objMapp.countSaleForecasting6(dip);
    }

    @Override
    public Map<String, Object> countSalesWithService(Integer dip) {
        return objMapp.countSalesWith(dip);
    }

    @Override
    public Map<String, Object> countSalesIncreaseService(Integer dip) {
        return objMapp.countSalesIncrease(dip);
    }

    @Override
    public Map<String, Object> countCluesWithService(Integer dip) {
        return objMapp.countCluesWith(dip);
    }

    @Override
    public Map<String, Object> countCluesIncreaseService(Integer dip) {
        return objMapp.countCluesIncrease(dip);
    }

    @Override
    public Map<String, Object> countCustomerWithService(Integer dip) {
        return objMapp.countCustomerWith(dip);
    }

    @Override
    public Map<String, Object> countCustomerIncreaseService(Integer dip) {
        return objMapp.countCluesIncrease(dip);
    }
}

