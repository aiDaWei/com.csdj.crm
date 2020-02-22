/*
 * 文 件 名：客户拜访
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号：1.0
 */
package com.csdj.crmproject.crmproject.entity.customermanagement;

/**
 * 客户实体
 * @author 许昊
 * @date 2019/11/27
 * @version 1.0
 */
public class ClientTable {
    /**
     * 客户编号(主键)
     */
    private int pkCusCustomerid;
    /**
     * 客户名称
     */
    private String cusCustomername;
    /**
     *客户来源
     */
    private String cusCustomerSource;
    /**
     *客户分类编号(外键)
     */
    private String fkClassifId;
    /**
     *客户类型编号(外键)
     */
    private String fkTypeNumber;
    /**
     *客户电话
     */
    private String cusFinancialTelephone;
    /**
     *传真
     */
    private String cusFax;
    /**
     *邮箱编码
     */
    private String cusMailboxCode;
    /**
     *网站地址
     */
    private String cusWebsiteAddress;
    /**
     *城市
     */
    private String cusCity;
    /**
     *行业编码
     */
    private String fkIndustryId;
    /**
     *员工人数
     */
    private int cusEmployees;
    /**
     *详细地址
     */
    private String cusDetailedAddress;
    /**
     *公司简介
     */
    private String cusSynopsis;
    /**
     *负责人
     */
    private String fkUserId;
    /**
     *创建人
     */
    private String cusCreator;
    /**
     *创建时间
     */
    private String cusGmtCreate;
    /**
     *修改人
     */
    private String cusModifier;
    /**
     *修改时间
     */
    private String cusGmtModified;


    /**
     * 无参构造函数
     */
    public ClientTable(){ }

    /**
     * 带参构造函数
     * @param pkCusCustomerid
     * @param cusCustomername
     * @param cusCustomerSource
     * @param fkClassifId
     * @param fkTypeNumber
     * @param cusFinancialTelephone
     * @param cusFax
     * @param cusMailboxCode
     * @param cusWebsiteAddress
     * @param cusCity
     * @param fkIndustryId
     * @param cusEmployees
     * @param cusDetailedAddress
     * @param cusSynopsis
     * @param fkUserId
     * @param cusCreator
     * @param cusGmtCreate
     * @param cusModifier
     * @param cusGmtModified
     */
    public ClientTable(int pkCusCustomerid, String cusCustomername, String cusCustomerSource, String fkClassifId, String fkTypeNumber, String cusFinancialTelephone, String cusFax, String cusMailboxCode, String cusWebsiteAddress, String cusCity, String fkIndustryId, int cusEmployees, String cusDetailedAddress, String cusSynopsis, String fkUserId, String cusCreator, String cusGmtCreate, String cusModifier, String cusGmtModified) {
        this.pkCusCustomerid = pkCusCustomerid;
        this.cusCustomername = cusCustomername;
        this.cusCustomerSource = cusCustomerSource;
        this.fkClassifId = fkClassifId;
        this.fkTypeNumber = fkTypeNumber;
        this.cusFinancialTelephone = cusFinancialTelephone;
        this.cusFax = cusFax;
        this.cusMailboxCode = cusMailboxCode;
        this.cusWebsiteAddress = cusWebsiteAddress;
        this.cusCity = cusCity;
        this.fkIndustryId = fkIndustryId;
        this.cusEmployees = cusEmployees;
        this.cusDetailedAddress = cusDetailedAddress;
        this.cusSynopsis = cusSynopsis;
        this.fkUserId = fkUserId;
        this.cusCreator = cusCreator;
        this.cusGmtCreate = cusGmtCreate;
        this.cusModifier = cusModifier;
        this.cusGmtModified = cusGmtModified;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "ClientTable{" +
                "pkCusCustomerid=" + pkCusCustomerid +
                ", cusCustomername='" + cusCustomername + '\'' +
                ", cusCustomerSource='" + cusCustomerSource + '\'' +
                ", fkClassifId='" + fkClassifId + '\'' +
                ", fkTypeNumber='" + fkTypeNumber + '\'' +
                ", cusFinancialTelephone='" + cusFinancialTelephone + '\'' +
                ", cusFax='" + cusFax + '\'' +
                ", cusMailboxCode='" + cusMailboxCode + '\'' +
                ", cusWebsiteAddress='" + cusWebsiteAddress + '\'' +
                ", cusCity='" + cusCity + '\'' +
                ", fkIndustryId='" + fkIndustryId + '\'' +
                ", cusEmployees=" + cusEmployees +
                ", cusDetailedAddress='" + cusDetailedAddress + '\'' +
                ", cusSynopsis='" + cusSynopsis + '\'' +
                ", fkUserId='" + fkUserId + '\'' +
                ", cusCreator='" + cusCreator + '\'' +
                ", cusGmtCreate='" + cusGmtCreate + '\'' +
                ", cusModifier='" + cusModifier + '\'' +
                ", cusGmtModified='" + cusGmtModified + '\'' +
                '}';
    }

    public int getPkCusCustomerid() {
        return pkCusCustomerid;
    }

    public void setPkCusCustomerid(int pkCusCustomerid) {
        this.pkCusCustomerid = pkCusCustomerid;
    }

    public String getCusCustomername() {
        return cusCustomername;
    }

    public void setCusCustomername(String cusCustomername) {
        this.cusCustomername = cusCustomername;
    }

    public String getCusCustomerSource() {
        return cusCustomerSource;
    }

    public void setCusCustomerSource(String cusCustomerSource) {
        this.cusCustomerSource = cusCustomerSource;
    }

    public String getFkClassifId() {
        return fkClassifId;
    }

    public void setFkClassifId(String fkClassifId) {
        this.fkClassifId = fkClassifId;
    }

    public String getFkTypeNumber() {
        return fkTypeNumber;
    }

    public void setFkTypeNumber(String fkTypeNumber) {
        this.fkTypeNumber = fkTypeNumber;
    }

    public String getCusFinancialTelephone() {
        return cusFinancialTelephone;
    }

    public void setCusFinancialTelephone(String cusFinancialTelephone) {
        this.cusFinancialTelephone = cusFinancialTelephone;
    }

    public String getCusFax() {
        return cusFax;
    }

    public void setCusFax(String cusFax) {
        this.cusFax = cusFax;
    }

    public String getCusMailboxCode() {
        return cusMailboxCode;
    }

    public void setCusMailboxCode(String cusMailboxCode) {
        this.cusMailboxCode = cusMailboxCode;
    }

    public String getCusWebsiteAddress() {
        return cusWebsiteAddress;
    }

    public void setCusWebsiteAddress(String cusWebsiteAddress) {
        this.cusWebsiteAddress = cusWebsiteAddress;
    }

    public String getCusCity() {
        return cusCity;
    }

    public void setCusCity(String cusCity) {
        this.cusCity = cusCity;
    }

    public String getFkIndustryId() {
        return fkIndustryId;
    }

    public void setFkIndustryId(String fkIndustryId) {
        this.fkIndustryId = fkIndustryId;
    }

    public int getCusEmployees() {
        return cusEmployees;
    }

    public void setCusEmployees(int cusEmployees) {
        this.cusEmployees = cusEmployees;
    }

    public String getCusDetailedAddress() {
        return cusDetailedAddress;
    }

    public void setCusDetailedAddress(String cusDetailedAddress) {
        this.cusDetailedAddress = cusDetailedAddress;
    }

    public String getCusSynopsis() {
        return cusSynopsis;
    }

    public void setCusSynopsis(String cusSynopsis) {
        this.cusSynopsis = cusSynopsis;
    }

    public String getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId;
    }

    public String getCusCreator() {
        return cusCreator;
    }

    public void setCusCreator(String cusCreator) {
        this.cusCreator = cusCreator;
    }

    public String getCusGmtCreate() {
        return cusGmtCreate;
    }

    public void setCusGmtCreate(String cusGmtCreate) {
        this.cusGmtCreate = cusGmtCreate;
    }

    public String getCusModifier() {
        return cusModifier;
    }

    public void setCusModifier(String cusModifier) {
        this.cusModifier = cusModifier;
    }

    public String getCusGmtModified() {
        return cusGmtModified;
    }

    public void setCusGmtModified(String cusGmtModified) {
        this.cusGmtModified = cusGmtModified;
    }
}
