package com.csdj.crmproject.crmproject.service.Instrument.SalesmanInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import io.lettuce.core.dynamic.annotation.Param;

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

    /**
     * 本月回款业绩完成值
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveMonth(Integer userId);

    /**
     * 本季回款业绩完成值
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveQuarter(Integer userId);

    /**
     * 本年回款业绩完成值
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countRetrospectiveYear(Integer userId);

    /**
     * 本年回款业绩计划值
     *
     * @param userId 业务员id
     * @return 统计结果类
     */
    CusSalesTarget reviewPerformancePlan(Integer userId);
    ////////////////////////////////////////
    /**
     * 获取销售目标
     *
     * @return
     */
    CusSalesTarget getOrder(String userId, String year);

    /**
     * 本月销售业绩
     *
     * @return 数据
     */
    Map<Object, String> dianasOrder(String userId);

    /**
     * 本季销售业绩
     *
     * @return 数据
     */
    Map<Object, String> seasonOrder(String userId);

    /**
     * 本年销售业绩
     *
     * @return 数据
     */
    Map<Object, String> yearOrder(String userId);
    /**
     * 年度合同完成度
     * @param userId
     * @return
     */
    Map<Object,String> contract(@Param("userId") String userId);
    /**
     * 本月合同销售业绩
     * @param userId
     * @return
     */
    Map<Object,String> dianasContract(@Param("userId") String userId);
    /**
     * 年度订单完成度
     * @return
     */
    Map<Object,String> order(@Param("userId") String userId);
    /**
     * 本季合同销售业绩
     * @param userId
     * @return
     */
    Map<Object,String> seasonContract(@Param("userId") String userId);
    /**
     * 本年合同销售业绩
     * @param userId
     * @return
     */
    Map<Object,String> yearContract(@Param("userId") String userId);


    /**
     * 本月回款完成情况
     * @param userId
     * @return
     */
    Double dianasOrReceiPlan(@Param("userId") String userId);
    /**
     * 本月应回款
     * @param userId
     * @return
     */
    Double dianasRecei_plan(@Param("userId") String userId);

    /**
     * 本季回款完成情况
     * @param userId
     * @return
     */
    Double seasonOrReceiPlan(@Param("userId") String userId);
    /**
     * 本季应回款
     * @param userId
     * @return
     */
    Double seasonRecei_plan(@Param("userId") String userId);

    /**
     * 本年回款完成情况
     * @param userId
     * @return
     */
    Double yearOrReceiPlan(@Param("userId") String userId);
    /**
     * 本年应回款
     * @param userId
     * @return
     */
    Double yearRecei_plan(@Param("userId") String userId);

    /**
     *
     * 本年完成情况
     * @param userId
     * @return
     */
    Map<String,Double> yearAccomplish(@Param("userId") String userId);

    /**
     *
     * 本年应完成
     * @param userId
     * @return
     */
    Map<String,Double> yearAnswerAccomplish(@Param("userId") String userId);


//**************************************************************************
    /**
     * 本月回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countReceivableMonth(@Param("userId")Integer userId);
    /**
     * 本季回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countReceivableQuarter(@Param("userId")Integer userId);
    /**
     * 本年回款业绩完成值
     * @param userId 业务员id
     * @return 统计结果类
     */
    StatisticalResult countReceivableYear(@Param("userId")Integer userId);
    /**
     * 月度回款额统计图计划值
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> avgReceivableMonth(@Param("userId")Integer userId);
    /**
     * 月度回款额统计图完成值
     * @param userId 业务员id
     * @return map数据
     */
    Map<String, Object> avgReceivableMonthOK(@Param("userId")Integer userId);














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
