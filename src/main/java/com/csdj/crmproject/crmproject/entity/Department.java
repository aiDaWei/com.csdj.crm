/*
 * 文 件 名：部门实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-28
 */
public class Department {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public Department() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkDepartmentId
   * @param departmentName
   */
  public Department(long pkDepartmentId, String departmentName) {
    this.pkDepartmentId = pkDepartmentId;
    this.departmentName = departmentName;
  }

  /**
   * 部门id
   */
  private long pkDepartmentId;
  /**
   * 部门名称
   */
  private String departmentName;
  /**
   * 上级编号
   */
  private int pid;
  /**
   * 下级菜单
   */
  private List<Department> Children;

  public long getPkDepartmentId() {
    return pkDepartmentId;
  }

  public void setPkDepartmentId(long pkDepartmentId) {
    this.pkDepartmentId = pkDepartmentId;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public List<Department> getChildren() {
    return Children;
  }

  public void setChildren(List<Department> children) {
    Children = children;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "Department{" +
            "pkDepartmentId=" + pkDepartmentId +
            ", departmentName='" + departmentName + '\'' +
            ", pid=" + pid +
            ", Children=" + Children +
            '}';
  }
}
