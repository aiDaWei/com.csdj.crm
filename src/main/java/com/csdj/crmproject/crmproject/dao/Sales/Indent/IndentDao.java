package com.csdj.crmproject.crmproject.dao.Sales.Indent;
import com.csdj.crmproject.crmproject.entity.FaultWar;
import com.csdj.crmproject.crmproject.entity.Salesopp;
import com.csdj.crmproject.crmproject.entity.customermanagement.ClientTable;
import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 订单管理
 * @author 谭芝豪
 */
@Mapper
public interface IndentDao {
    /**
     * 查询订单总记录数
     * @param orderApprovalStatus 审批状态
     * @return记录数
     */
    public int orderCount(@Param(value = "orderApprovalStatus") String orderApprovalStatus);
    /**
     * 查询订单
     * @return List
     */
    public List<Order> findOrder(@Param(value = "orderApprovalStatus") String orderApprovalStatus);

    /**
     * 根据订单编号查询订单信息
     * @param orderId 订单编号
     * @return Order
     */
    public Order findGetOrderId(@Param(value = "orderId") long orderId);

    /**
     * 根据审批状态查询订单信息
     * @param orderApprovalStatus
     * @return
     */
    public List<Order> findGetOrderApprovalStatus(@Param(value = "orderApprovalStatus") String orderApprovalStatus);

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
     * 根据订单编号修改订单的审批状态
     * @param orderId
     * @return
     */
    public int updateOrderByOrderId(long orderId);
    /**
     * 批量删除订单
     *
     * @param array
     * @return
     */
    public int deleteOrder(int[] array);

    /**
     * 根据客户类型查询客户信息
     * @param fkTypeNumberId 客户类型编号
     * @return
     */
    public List<ClientTable> findClientTableById(@Param(value = "fkTypeNumberId") String fkTypeNumberId);

    /**
     * 查询销售机会信息
     * @return
     */
    public List<Salesopp> findSalesopp();
    /**
     * 查询故障报修信息
     * @return
     */
    public List<FaultWar> findFaultWar();
}
