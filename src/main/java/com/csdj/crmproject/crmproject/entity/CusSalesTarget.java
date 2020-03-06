/*
 * 文 件 名：业务员销售目标实体类
 * 版权(c) 2019-雷升公司 CRM项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity;


/**
 * @author 李文霞
 * @version 1.0
 * @date 2019-11-28
 */
public class CusSalesTarget {
  /**
   * Description ：  无参构造函数
   * @param：  无
   */
  public CusSalesTarget() {
  }

  /**
   * Description ：  有参构造函数
   * @param pkCusSalesTargetId
   * @param fkUserBusinessId
   * @param cusSalesTargetYear
   * @param salesTargetType
   * @param cusSalesTarJanuary
   * @param cusSalesTarFebruary
   * @param cusSalesTarMarch
   * @param cusSalesTarApril
   * @param cusSalesTarMay
   * @param cusSalesTarJun
   * @param cusSalesTarJuly
   * @param cusSalesTarAugust
   * @param cusSalesTarSeptember
   * @param cusSalesTarOctober
   * @param cusSalesTarNovember
   * @param cusSalesTarDecember
   * @param cusSalesTarCreator
   * @param cusSalesTarGmtCreate
   * @param cusSalesTarGmtModified
   * @param cusSalesTarLastModifier
   * @param fkUserId
   * @param userBusiness
   *@param isDel
   */
  public CusSalesTarget(long pkCusSalesTargetId, long fkUserBusinessId, long cusSalesTargetYear, String salesTargetType, double cusSalesTarJanuary, double cusSalesTarFebruary, double cusSalesTarMarch, double cusSalesTarApril, double cusSalesTarMay, double cusSalesTarJun, double cusSalesTarJuly, double cusSalesTarAugust, double cusSalesTarSeptember, double cusSalesTarOctober, double cusSalesTarNovember, double cusSalesTarDecember, String cusSalesTarCreator, String cusSalesTarGmtCreate, String cusSalesTarGmtModified, String cusSalesTarLastModifier, long fkUserId,String userBusiness,int isDel) {
    this.pkCusSalesTargetId = pkCusSalesTargetId;
    this.fkUserBusinessId = fkUserBusinessId;
    this.cusSalesTargetYear = cusSalesTargetYear;
    this.salesTargetType = salesTargetType;
    this.cusSalesTarJanuary = cusSalesTarJanuary;
    this.cusSalesTarFebruary = cusSalesTarFebruary;
    this.cusSalesTarMarch = cusSalesTarMarch;
    this.cusSalesTarApril = cusSalesTarApril;
    this.cusSalesTarMay = cusSalesTarMay;
    this.cusSalesTarJun = cusSalesTarJun;
    this.cusSalesTarJuly = cusSalesTarJuly;
    this.cusSalesTarAugust = cusSalesTarAugust;
    this.cusSalesTarSeptember = cusSalesTarSeptember;
    this.cusSalesTarOctober = cusSalesTarOctober;
    this.cusSalesTarNovember = cusSalesTarNovember;
    this.cusSalesTarDecember = cusSalesTarDecember;
    this.cusSalesTarCreator = cusSalesTarCreator;
    this.cusSalesTarGmtCreate = cusSalesTarGmtCreate;
    this.cusSalesTarGmtModified = cusSalesTarGmtModified;
    this.cusSalesTarLastModifier = cusSalesTarLastModifier;
    this.fkUserId = fkUserId;
    this.userBusiness =userBusiness;
    this.isDel =isDel;
  }

  public String getUserBusiness() {
    return userBusiness;
  }

  public void setUserBusiness(String userBusiness) {
    this.userBusiness = userBusiness;
  }
  public int getIsDel() {
    return isDel;
  }

  public void setIsDel(int isDel) {
    this.isDel = isDel;
  }
  /**
   * 销售员名称
   */
  private String userBusiness;
  private int isDel;
  /**
   * 业务员销售目标id
   */
  private long pkCusSalesTargetId;
  /**
   * 业务员id
   */
  private long fkUserBusinessId;
  /**
   * 年度
   */
  private long cusSalesTargetYear;
  /**
   * 销售目标类型
   */
  private String salesTargetType;
  /**
   * 一月
   */
  private double cusSalesTarJanuary;
  /**
   * 二月
   */
  private double cusSalesTarFebruary;
  /**
   * 三月
   */
  private double cusSalesTarMarch;
  /**
   * 四月
   */
  private double cusSalesTarApril;
  /**
   * 五月
   */
  private double cusSalesTarMay;
  /**
   * 六月
   */
  private double cusSalesTarJun;
  /**
   * 七月
   */
  private double cusSalesTarJuly;
  /**
   * 八月
   */
  private double cusSalesTarAugust;
  /**
   * 九月
   */
  private double cusSalesTarSeptember;
  /**
   * 十月
   */
  private double cusSalesTarOctober;
  /**
   * 十一月
   */
  private double cusSalesTarNovember;
  /**
   * 十二月
   */
  private double cusSalesTarDecember;
  /**
   * 创建人
   */
  private String cusSalesTarCreator;
  /**
   * 创建时间
   */
  private String cusSalesTarGmtCreate;
  /**
   * 最后修改时间
   */
  private String cusSalesTarGmtModified;
  /**
   * 最后修改人
   */
  private String cusSalesTarLastModifier;
  /**
   * 负责人
   */
  private long fkUserId;

  public long getPkCusSalesTargetId() {
    return pkCusSalesTargetId;
  }

  public void setPkCusSalesTargetId(long pkCusSalesTargetId) {
    this.pkCusSalesTargetId = pkCusSalesTargetId;
  }


  public long getFkUserBusinessId() {
    return fkUserBusinessId;
  }

  public void setFkUserBusinessId(long fkUserBusinessId) {
    this.fkUserBusinessId = fkUserBusinessId;
  }


  public long getCusSalesTargetYear() {
    return cusSalesTargetYear;
  }

  public void setCusSalesTargetYear(long cusSalesTargetYear) {
    this.cusSalesTargetYear = cusSalesTargetYear;
  }


  public String getSalesTargetType() {
    return salesTargetType;
  }

  public void setSalesTargetType(String salesTargetType) {
    this.salesTargetType = salesTargetType;
  }


  public double getCusSalesTarJanuary() {
    return cusSalesTarJanuary;
  }

  public void setCusSalesTarJanuary(double cusSalesTarJanuary) {
    this.cusSalesTarJanuary = cusSalesTarJanuary;
  }


  public double getCusSalesTarFebruary() {
    return cusSalesTarFebruary;
  }

  public void setCusSalesTarFebruary(double cusSalesTarFebruary) {
    this.cusSalesTarFebruary = cusSalesTarFebruary;
  }


  public double getCusSalesTarMarch() {
    return cusSalesTarMarch;
  }

  public void setCusSalesTarMarch(double cusSalesTarMarch) {
    this.cusSalesTarMarch = cusSalesTarMarch;
  }


  public double getCusSalesTarApril() {
    return cusSalesTarApril;
  }

  public void setCusSalesTarApril(double cusSalesTarApril) {
    this.cusSalesTarApril = cusSalesTarApril;
  }


  public double getCusSalesTarMay() {
    return cusSalesTarMay;
  }

  public void setCusSalesTarMay(double cusSalesTarMay) {
    this.cusSalesTarMay = cusSalesTarMay;
  }


  public double getCusSalesTarJun() {
    return cusSalesTarJun;
  }

  public void setCusSalesTarJun(double cusSalesTarJun) {
    this.cusSalesTarJun = cusSalesTarJun;
  }


  public double getCusSalesTarJuly() {
    return cusSalesTarJuly;
  }

  public void setCusSalesTarJuly(double cusSalesTarJuly) {
    this.cusSalesTarJuly = cusSalesTarJuly;
  }


  public double getCusSalesTarAugust() {
    return cusSalesTarAugust;
  }

  public void setCusSalesTarAugust(double cusSalesTarAugust) {
    this.cusSalesTarAugust = cusSalesTarAugust;
  }


  public double getCusSalesTarSeptember() {
    return cusSalesTarSeptember;
  }

  public void setCusSalesTarSeptember(double cusSalesTarSeptember) {
    this.cusSalesTarSeptember = cusSalesTarSeptember;
  }


  public double getCusSalesTarOctober() {
    return cusSalesTarOctober;
  }

  public void setCusSalesTarOctober(double cusSalesTarOctober) {
    this.cusSalesTarOctober = cusSalesTarOctober;
  }


  public double getCusSalesTarNovember() {
    return cusSalesTarNovember;
  }

  public void setCusSalesTarNovember(double cusSalesTarNovember) {
    this.cusSalesTarNovember = cusSalesTarNovember;
  }


  public double getCusSalesTarDecember() {
    return cusSalesTarDecember;
  }

  public void setCusSalesTarDecember(double cusSalesTarDecember) {
    this.cusSalesTarDecember = cusSalesTarDecember;
  }


  public String getCusSalesTarCreator() {
    return cusSalesTarCreator;
  }

  public void setCusSalesTarCreator(String cusSalesTarCreator) {
    this.cusSalesTarCreator = cusSalesTarCreator;
  }


  public String getCusSalesTarGmtCreate() {
    return cusSalesTarGmtCreate;
  }

  public void setCusSalesTarGmtCreate(String cusSalesTarGmtCreate) {
    this.cusSalesTarGmtCreate = cusSalesTarGmtCreate;
  }

  public String getCusSalesTarGmtModified() {
    return cusSalesTarGmtModified;
  }

  public void setCusSalesTarGmtModified(String cusSalesTarGmtModified) {
    this.cusSalesTarGmtModified = cusSalesTarGmtModified;
  }

  public String getCusSalesTarLastModifier() {
    return cusSalesTarLastModifier;
  }

  public void setCusSalesTarLastModifier(String cusSalesTarLastModifier) {
    this.cusSalesTarLastModifier = cusSalesTarLastModifier;
  }


  public long getFkUserId() {
    return fkUserId;
  }

  public void setFkUserId(long fkUserId) {
    this.fkUserId = fkUserId;
  }

  /**
   * 显示数据
   * @return
   */
  @Override
  public String toString() {
    return "CusSalesTarget{" +
            "pkCusSalesTargetId=" + pkCusSalesTargetId +
            ", fkUserBusinessId=" + fkUserBusinessId +
            ", cusSalesTargetYear=" + cusSalesTargetYear +
            ", salesTargetType='" + salesTargetType + '\'' +
            ", cusSalesTarJanuary=" + cusSalesTarJanuary +
            ", cusSalesTarFebruary=" + cusSalesTarFebruary +
            ", cusSalesTarMarch=" + cusSalesTarMarch +
            ", cusSalesTarApril=" + cusSalesTarApril +
            ", cusSalesTarMay=" + cusSalesTarMay +
            ", cusSalesTarJun=" + cusSalesTarJun +
            ", cusSalesTarJuly=" + cusSalesTarJuly +
            ", cusSalesTarAugust=" + cusSalesTarAugust +
            ", cusSalesTarSeptember=" + cusSalesTarSeptember +
            ", cusSalesTarOctober=" + cusSalesTarOctober +
            ", cusSalesTarNovember=" + cusSalesTarNovember +
            ", cusSalesTarDecember=" + cusSalesTarDecember +
            ", cusSalesTarCreator='" + cusSalesTarCreator + '\'' +
            ", cusSalesTarGmtCreate=" + cusSalesTarGmtCreate +
            ", cusSalesTarGmtModified=" + cusSalesTarGmtModified +
            ", cusSalesTarLastModifier='" + cusSalesTarLastModifier + '\'' +
            ", fkUserId=" + fkUserId +
            ", userBusiness=" + userBusiness +
            ", isDel=" + isDel +
            '}';
  }
}
