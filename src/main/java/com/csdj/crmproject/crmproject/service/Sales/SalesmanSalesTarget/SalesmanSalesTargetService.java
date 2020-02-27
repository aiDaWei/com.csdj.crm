package com.csdj.crmproject.crmproject.service.Sales.SalesmanSalesTarget;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;

import java.util.List;

public interface SalesmanSalesTargetService {
    /**
     * 带条件查询
     * @param
     * @return list
     */
    public List<CusSalesTarget> findPage(int page,int limit,int selType,int id);
    int getCount(int selType,int id);

    /**
     * 删除：修改状态
     * @param salesId
     * @return
     */
    int isDelStatus(int salesId);
    int addSales(CusSalesTarget sales);

    int updSales(CusSalesTarget sales);
}
