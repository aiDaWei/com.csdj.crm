package com.csdj.crmproject.crmproject.dao.Instrument.SectionInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author 刘时钟
 * @Date 2020/2/10
 * @Version 1.0
 */
@Mapper
public interface SectionInstrumentMapper {
    /**
     * 查询所有部门
     * @return 部门列表
     */
    List<Department> listDepartment();
    /**
     * 销售业绩订单仪表盘数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgSalesOrder(@Param("dip")Integer dip);
    /**
     * 销售业绩合同仪表盘数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgSalesContract(@Param("dip")Integer dip);
    /**
     * 销售业绩订单计划值数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> sumOrderMonth(@Param("dip")Integer dip);
    /**
     * 销售业绩订单完成值数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> sumOrderMonthOK(@Param("dip")Integer dip);
    /**
     * 销售业绩合同计划值数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> sumContractMonth(@Param("dip")Integer dip);
    /**
     * 销售业绩合同完成值数据
     * @param dip
     * @return map数据
     */
    Map<String, Object> sumContractMonthOK(@Param("dip")Integer dip);
    /**
     * 本月回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableMonth(@Param("dip")Integer dip);
    /**
     * 本季回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableQuarter(@Param("dip")Integer dip);
    /**
     * 本年回款业绩完成值
     * @param dip
     * @return 统计结果类
     */
    StatisticalResult countReceivableYear(@Param("dip")Integer dip);
    /**
     * 月度回款额统计图计划值
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgReceivableMonth(@Param("dip")Integer dip);
    /**
     * 月度回款额统计图完成值
     * @param dip
     * @return map数据
     */
    Map<String, Object> avgReceivableMonthOK(@Param("dip")Integer dip);
    /**
     * 销售预测-初步接触
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting1(@Param("dip") Integer dip);
    /**
     * 销售预测-需求分析
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting2(@Param("dip") Integer dip);
    /**
     * 销售预测-方案制定/报价
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting3(@Param("dip") Integer dip);
    /**
     * 销售预测-商务谈判/招投标
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting4(@Param("dip") Integer dip);
    /**
     * 销售预测-合同签订
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting5(@Param("dip") Integer dip);
    /**
     * 销售预测-成功
     * @param dip 部门id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting6(@Param("dip") Integer dip);
    /**
     * 机会跟进数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countSalesWith(@Param("dip")Integer dip);
    /**
     * 机会增加数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countSalesIncrease(@Param("dip")Integer dip);
    /**
     * 线索跟进数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countCluesWith(@Param("dip")Integer dip);
    /**
     * 线索增加数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countCluesIncrease(@Param("dip")Integer dip);
    /**
     * 客户跟进数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countCustomerWith(@Param("dip")Integer dip);
    /**
     * 客户增加数
     * @param dip
     * @return map数据
     */
    Map<String, Object> countCustomerIncrease(@Param("dip")Integer dip);
}