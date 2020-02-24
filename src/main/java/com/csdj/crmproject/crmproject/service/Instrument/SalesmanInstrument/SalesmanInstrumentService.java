package com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SalesmanInstrumentService
 * @Description: 销售仪表盘业务接口层
 * @Author 唐浪
 * @Date 2019/2/6
 * @Version V1.0
 **/
public interface SalesmanInstrumentService {
    /**
     * 查询所有用户,绑定下拉列表框
     *
     * @return 用户列表
     */
    List<User> listUsers();

    /**
     * 销售预测-初步接触
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting1(Integer userId);

    /**
     * 销售预测-需求分析
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting2(Integer userId);

    /**
     * 销售预测-方案制定/报价
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting3(Integer userId);

    /**
     * 销售预测-商务谈判/招投标
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting4(Integer userId);

    /**
     * 销售预测-合同签订
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting5(Integer userId);

    /**
     * 销售预测-成功
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countSaleForecasting6(Integer userId);

//*****************************************************************
    /**
     * 本月销售业绩完成值
     * @param userId 业务员id
     * @param saleType 类型
     * @return 统计结果类
     */
    StatisticalResult countSaleableMonth( Integer userId,
                                          String saleType);
    /**
     * 本季销售业绩完成值
     * @param userId 业务员id
     * @param saleType 类型
     * @return 统计结果类
     */
    StatisticalResult countSaleableQuarter( Integer userId,
                                           String saleType);
    /**
     * 本年销售业绩完成值
     * @param userId 业务员id
     * @param saleType 类型
     * @return 统计结果类
     */
    StatisticalResult countSaleableYear( Integer userId,
                                         String saleType);
    /**
     * 月度销售额统计图计划值
     * @param userId 业务员id
     * @param saleType 类型
     * @return map数据
     */
    Map<String, Object> avgSaleableMonth( Integer userId,
                                         String saleType);
    /**
     * 月度销售额统计图完成值
     * @param userId 业务员id
     * @param saleType 类型
     * @return map数据
     */
    Map<String, Object> avgSaleableMonthOK( Integer userId,
                                           String saleType);
//**************************************************************************
    /**
     * 本月回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countReceivableMonth(Integer userId);
    /**
     * 本季回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countReceivableQuarter(Integer userId);
    /**
     * 本年回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countReceivableYear(Integer userId);
    /**
     * 月度回款额统计图计划值
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> avgReceivableMonth(Integer userId);
    /**
     * 月度回款额统计图完成值
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> avgReceivableMonthOK(Integer userId);














    /**
     * 机会跟进数
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> countSalesWith( Integer userId);
    /**
     * 机会增加数
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> countSalesIncrease( Integer userId);
    /**
     * 线索跟进数
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> countCluesWith( Integer userId);
    /**
     * 线索增加数
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> countCluesIncrease( Integer userId);
    /**
     * 客户跟进数
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> countCustomerWith( Integer userId);
    /**
     * 客户增加数
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> countCustomerIncrease( Integer userId);
}
