package com.csdj.crmproject.crmproject.service.impl.Sales.SalesmanSalesTarget;

import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.dao.Sales.SalesmanSalesTarget.SalesmanSalesTargetMapper;
import com.csdj.crmproject.crmproject.dao.UserMapper;
import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.service.Sales.SalesmanSalesTarget.SalesmanSalesTargetService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SalesmanSalesTargetServiceImpl implements SalesmanSalesTargetService {

    @Resource
    SalesmanSalesTargetMapper dao;
    @Resource
    UserMapper mapper;

    @Override
    public List<CusSalesTarget> findPage(int page, int limit,int selType,int id) {
        //开启分页
        PageHelper.startPage(page, limit);
        //查询的数据
        List<CusSalesTarget> list =dao.findPages(selType,id);
        System.out.println(selType+"---"+id);
        System.out.println(list.size()+"--"+JSON.toJSON(list));
        //数据传入pagehelper中
        PageInfo<CusSalesTarget> pInfo =new PageInfo<>(list);
        return pInfo.getList();
    }

    @Override
    public int getCount(int selType, int id) {
        return dao.getCount(selType,id);
    }

    /**
     * 删除：修改状态
     * @param salesId
     * @return
     */
    @Override
    public int isDelStatus(int salesId) {
        return dao.isDelStatus(salesId);
    }

    @Override
    public int addSales(CusSalesTarget sales) {
        return dao.addSales(sales);
    }

    @Override
    public int updSales(CusSalesTarget sales) {
        return dao.updSales(sales);
    }
}
