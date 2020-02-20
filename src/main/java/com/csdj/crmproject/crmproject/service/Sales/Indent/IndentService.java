package com.csdj.crmproject.crmproject.service.Sales.Indent;

import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

/**
 * 订单管理
 * @author 谭芝豪
 */
public interface IndentService {
    /**
     * 查询订单总记录数
     * @param orderApprovalStatus
     * @return记录数
     */
    public int orderCount(String orderApprovalStatus);
    /**
     * 查询订单
     * @return PageInfo
     */
    public PageInfo<Order> findOrder(int page, int limit,String orderApprovalStatus);
    /**
     * 根据订单编号查询订单信息
     * @param orderId 订单编号
     * @return Order
     */
    public Order findGetOrderId(@Param(value = "orderId") long orderId);
    /**
     * 添加订单
     * @return
     */
    public int addOrder(Order order);
    /**
     * 修改订单
     * @param order
     * @return
     */
    public int updateOrder(Order order);
    /**
     * 批量删除订单
     *
     * @param array
     * @return
     */
    public int deleteOrder(int[] array);
}
