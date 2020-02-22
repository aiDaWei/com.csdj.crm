package com.csdj.crmproject.crmproject.dao.Sales.TreeMenu;

import com.csdj.crmproject.crmproject.entity.Department;

import java.util.List;

/**
 * @author 王江南
 * @version 1.0
 * @date 2020/02/22 上午 12:53
 * @description: 部门树形菜单持久层
 */
public interface DeptTreeDao {
    /**
     * 父级
     * @return
     */
    List<Department> findFather();

    /**
     * 根据父级查找子集
     * @param pid
     * @return
     */
    List<Department> findChild(Long pid);
}
