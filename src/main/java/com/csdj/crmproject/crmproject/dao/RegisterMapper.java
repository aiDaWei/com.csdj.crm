package com.csdj.crmproject.crmproject.dao;


import com.csdj.crmproject.crmproject.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author BlueWhaleMain
 * @date 2020-2-21 20:32:32
 * 注册操作映射
 */
@Mapper
public interface RegisterMapper {
    /**
     * 注册用户
     *
     * @param userName      用户名
     * @param password      密码
     * @param departmentId  部门表ID
     * @param userGmtCreate 创建时间
     * @param userIphone    办公电话
     * @param userEmail     电子邮件
     * @return 影响的行数
     */
    int register(@Param("user_name") String userName, @Param("user_password") String password,
                 @Param("fk_department_id") Integer departmentId, @Param("user_gmt_create") String userGmtCreate,
                 @Param("user_iphone") String userIphone, @Param("user_email") String userEmail);

    /**
     * 获取部门信息
     *
     * @param departmentId 部门ID
     * @return 部门表对象集合
     */
    List<Department> getDepartment(@Param("departmentId") Integer departmentId);
}
