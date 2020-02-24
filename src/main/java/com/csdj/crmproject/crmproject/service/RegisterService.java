package com.csdj.crmproject.crmproject.service;

import com.csdj.crmproject.crmproject.entity.Department;

import java.util.List;

/**
 * @author BlueWhaleMain
 * @date 2020-2-21 20:33:03
 * 注册服务接口
 */
public interface RegisterService {
    /**
     * 注册用户
     *
     * @param userName     用户名
     * @param password     密码
     * @param departmentId 部门表ID
     * @param userIphone   办公电话
     * @param userEmail    电子邮件
     * @return 影响的行数
     */
    int register(String userName, String password, Integer departmentId, String userIphone, String userEmail);

    /**
     * 获取部门信息
     *
     * @param departmentId 部门ID
     * @return 部门表对象集合
     */
    List<Department> getDepartment(Integer departmentId);
}
