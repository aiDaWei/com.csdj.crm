package com.csdj.crmproject.crmproject.service.impl.Sales.Indent;

import com.csdj.crmproject.crmproject.dao.Sales.Indent.IndentDao;
import com.csdj.crmproject.crmproject.entity.customermanagement.ClientTable;
import com.csdj.crmproject.crmproject.entity.salesmanagement.Order;
import com.csdj.crmproject.crmproject.service.Sales.Indent.IndentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.ehcache.search.expression.Or;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 订单管理
 * @author 谭芝豪
 */
@Service
public class IndentServiceImpl implements IndentService {
    @Resource
    private IndentDao indentDao;
    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public int orderCount(String orderApprovalStatus) {
        return indentDao.orderCount(orderApprovalStatus);
    }

    @Override
    public PageInfo<Order> findOrder(int pageNum, int pageSize,String orderApprovalStatus) {
        PageHelper.startPage(pageNum, pageSize);
        List<Order> list=indentDao.findOrder(orderApprovalStatus);
        PageInfo<Order> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Order findGetOrderId(long orderId) {
        Order order=null;
        String key="order_"+orderId;
        try {
            ValueOperations<String,Order> operations=redisTemplate.opsForValue();
            boolean hasKey=redisTemplate.hasKey(key);
            if (hasKey){
                order=operations.get(key);
                System.out.println("==========从缓存中获得数据=========");
                return order;
            }else {
                order=indentDao.findGetOrderId(orderId);
                System.out.println("==========从数据表中获得数据=========");
                operations.set(key,order,5, TimeUnit.MINUTES);
                return order;
            }
        } catch (Exception e) {
            System.out.println("redis服务异常");
            order=indentDao.findGetOrderId(orderId);
        }
        return order;
    }

    @Override
    public int addOrder(Order order) {
        return indentDao.addOrder(order);
    }

    @Override
    public int updateOrder(Order order) {
        ValueOperations<String,Order> valueOperations=redisTemplate.opsForValue();
        int i=indentDao.updateOrder(order);
        if(i!=0){
            String key="order_"+order.getOrderId();
            boolean keyHas=redisTemplate.hasKey(key);
            if (keyHas){
                redisTemplate.delete(key);
                Order newOrder=indentDao.findGetOrderId(order.getOrderId());
                if (newOrder!=null){
                    valueOperations.set(key,newOrder,5, TimeUnit.MINUTES);
                }
            }
        }
        return i;
    }

    @Override
    public int updateOrderByOrderId(long orderId) {
        ValueOperations valueOperations=redisTemplate.opsForValue();
        int i=indentDao.updateOrderByOrderId(orderId);
        if(i!=0){
            String key="order_"+orderId;
            boolean keyHas=redisTemplate.hasKey(key);
            if (keyHas){
                redisTemplate.delete(key);
                Order newOrder=indentDao.findGetOrderId(orderId);
                if (newOrder!=null){
                    valueOperations.set(key,newOrder,5, TimeUnit.MINUTES);
                }
            }
        }
        return i;
    }

    @Override
    public int deleteOrder(int[] array) {
        int result=indentDao.deleteOrder(array);
        if (result!=0){
            for (int i=0;i<array.length;i++){
                String key="order_"+array[i];
                boolean hasKey=redisTemplate.hasKey(key);
                if (hasKey){
                    redisTemplate.delete(key);
                }
            }
        }
        return result;
    }

    @Override
    public List<ClientTable> findClientTableById(String fkTypeNumberId) {
        List<ClientTable> list=indentDao.findClientTableById(fkTypeNumberId);
        return list;
    }
}
