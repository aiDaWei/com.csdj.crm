package com.csdj.crmproject.crmproject.controller.Sales.TreeMenuController;

import com.csdj.crmproject.crmproject.service.Sales.TreeMenuService.DeptTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王江南
 * @version 1.0
 * @date 2020/02/22 上午 14：00
 * @description: 部门树形菜单控制器
 */
@RestController
@RequestMapping("/DeptTree")
public class DeptTreeController {
    @Autowired
    DeptTreeService service;

    @RequestMapping("/tree")
    public Object fun() {
        Object list = service.treeload();
        return list;
    }
}
