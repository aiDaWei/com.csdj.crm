package com.csdj.crmproject.crmproject.service.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;

import java.util.List;
import java.util.Map;

/**
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version 1.0
 */
public interface SectionInstrumentService {
    /**
     * 查询所有部门
     * @return 部门列表
     */
    List<Department> listDepartmentService();
    /**
     * 销售业绩订单仪表盘数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgSalesOrderService(Integer dip);
    /**
     * 销售业绩合同仪表盘数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgSalesContractService(Integer dip);
    /**
     * 销售业绩订单计划值数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> sumOrderMonthService(Integer dip);
    /**
     * 销售业绩订单完成值数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> sumOrderMonthOKService(Integer dip);
    /**
     * 销售业绩合同计划值数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> sumContractMonthService(Integer dip);
    /**
     * 销售业绩合同完成值数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> sumContractMonthOKService(Integer dip);
    /**
     * 本月回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableMonthService(Integer dip);
    /**
     * 本季回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableQuarterService(Integer dip);
    /**
     * 本年回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableYearService(Integer dip);
    /**
     * 月度回款额统计图
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgReceivableMonthService(Integer dip);
    /**
     * 月度回款额统计图完成值
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgReceivableMonthOKService(Integer dip);
    /**
     * 销售预测-初步接触
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting1Service(Integer dip);
    /**
     * 销售预测-需求分析
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting2Service(Integer dip);
    /**
     * 销售预测-方案制定/报价
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting3Service(Integer dip);
    /**
     * 销售预测-商务谈判/招投标
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting4Service(Integer dip);
    /**
     * 销售预测-合同签订
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting5Service(Integer dip);
    /**
     * 销售预测-成功
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting6Service(Integer dip);
    /**
     * 机会跟进数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countSalesWithService(Integer dip);
    /**
     * 机会增加数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countSalesIncreaseService(Integer dip);
    /**
     * 线索跟进数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countCluesWithService(Integer dip);
    /**
     * 线索增加数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countCluesIncreaseService(Integer dip);
    /**
     * 客户跟进数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countCustomerWithService(Integer dip);
    /**
     * 客户增加数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countCustomerIncreaseService(Integer dip);
}