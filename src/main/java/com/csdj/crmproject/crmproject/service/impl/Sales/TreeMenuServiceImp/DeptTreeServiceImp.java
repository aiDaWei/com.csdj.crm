package com.csdj.crmproject.crmproject.service.impl.Sales.TreeMenuServiceImp;

import com.csdj.crmproject.crmproject.dao.Sales.TreeMenu.DeptTreeDao;
import com.csdj.crmproject.crmproject.entity.Department;
import com.csdj.crmproject.crmproject.service.Sales.TreeMenuService.DeptTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author 王江南
 * @version 1.0
 * @date 2020/02/22 上午 13：54
 * @description: 部门树形菜单业务层实现
 */
@Service
public class DeptTreeServiceImp implements DeptTreeService {
    /**
     * 创建代理对象
     */
    @Autowired
    DeptTreeDao dao;
    @Override
    public Object treeload() {
        //查询所有父级拆单
        List<Department> dpet = dao.findFather();
        //定义一个map处理json键名问题
        List<Map<String, Object>> result = new ArrayList<>();
        return fun(dpet, result);
    }

    @Override
    public List<Map<String, Object>> fun(List<Department> dpet, List<Map<String, Object>> result) {
        for(Department d : dpet){
            Map<String, Object> map = new HashMap<>();
            map.put("id", d.getPkDepartmentId());
            map.put("title", d.getDepartmentName());
            //设置是否展开
            map.put("spread", true);
            List<Map<String, Object>> result1 = new ArrayList<>();
            d.setChildren(dao.findChild(d.getPkDepartmentId()));
            //下级菜单
            List<Department> children = d.getChildren();
            //循环递归查询子级
            map.put("children", fun(children, result1));
            result.add(map);
        }
        return result;
    }
}
