package com.csdj.crmproject.crmproject.dao.Instrument.CompanyInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.entity.salesmanagement.StatisticalResult;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;
import java.util.Map;

/**
 * @ Description   :  公司仪表盘持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2020/2/22 14:23
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2020/2/22 14:23
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface CompanyInstrumentDao {
    /**
     * 获取销售目标
     * @return
     */
    CusSalesTarget getOrder(@Param("year") String year);
    /**
     * 本月销售业绩
     * @return 数据
     */
    Map<Object,String> dianasOrder();
    /**
     * 本季销售业绩
     * @return 数据
     */
    Map<Object,String> seasonOrder();
    /**
     * 本年销售业绩
     * @return 数据
     */
    Map<Object,String> yearOrder();

    /**
     * 年度订单完成度
     * @return
     */
    Map<Object,String> order();

    /**
     * 年度合同完成度
     * @return
     */
    Map<Object,String> contract();

    /**
     * 本月合同销售业绩
     * @return
     */
    Map<Object,String> dianasContract();
    /**
     * 本季合同销售业绩
     * @return
     */
    Map<Object,String> seasonContract();
    /**
     * 本年合同销售业绩
     * @return
     */
    Map<Object,String> yearContract();


    /**
     * 本月回款完成情况
     * @return
     */
    Double dianasOrReceiPlan();
    /**
     * 本月应回款
     * @return
     */
    Double dianasRecei_plan();

    /**
     * 本季回款完成情况
     * @return
     */
    Double seasonOrReceiPlan();
    /**
     * 本季应回款
     * @return
     */
    Double seasonRecei_plan();

    /**
     * 本年回款完成情况
     * @return
     */
    Double yearOrReceiPlan();
    /**
     * 本年应回款
     * @return
     */
    Double yearRecei_plan();

    /**
     *
     * 本年完成情况
     * @return
     */
    Map<String,Double> yearAccomplish();

    /**
     *
     * 本年应完成
     * @return
     */
    Map<String,Double> yearAnswerAccomplish();

}
