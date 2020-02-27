package com.csdj.crmproject.crmproject.dao.Sales.SalesmanSalesTarget;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SalesmanSalesTargetMapper {
    /**
     *查询
     * @return
     */
    List<CusSalesTarget> findPages(@Param("selType") int selType,@Param("id") int id);
    int getCount(@Param("selType") int selType,@Param("id") int id);

    /**
     * 删除：修改删除状态
     * @param salesId  销售目标id
     * @return
     */
    int isDelStatus(int salesId);
    int addSales(@Param("sales")CusSalesTarget sales);
    int updSales(@Param("sales")CusSalesTarget sales);
}
