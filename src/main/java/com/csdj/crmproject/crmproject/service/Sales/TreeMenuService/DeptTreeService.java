package com.csdj.crmproject.crmproject.service.Sales.TreeMenuService;

import com.csdj.crmproject.crmproject.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 王江南
 * @version 1.0
 * @date 2020/02/22 上午 13：13
 * @description: 部门树形菜单业务层
 */
public interface DeptTreeService {
    /**
     * 查询父级节点
     * @return
     */
    List<Map<String,Object>> fun(List<Department> dpet, List<Map<String, Object>> result);

    /**
     * 递归方法
     * @return
     */
    public Object treeload();
}
