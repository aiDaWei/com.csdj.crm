/*
 * 文 件 名：MarketAttach
 * 版权(c) 2019-雷升公司 crm项目组：
 * 版 本 号： 1.0
 */
package com.csdj.crmproject.crmproject.entity.marketingactivity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author lxj
 * @version 1.0.0
 * @date 2019/11/27
 */
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class MarketAttach {
    /**
     * 主键
     */
    private int pkMarkAttachId;
    /**
     * 市场活动id
     */
    private int fkMarketActivityId;
    /**
     * 名称
     */
    private String attachName;
    /**
     * 文件url
     */
    private String attachUrl;
    /**
     * 创建人
     */
    private String attachFounder;
    /**
     * 创建时间
     */
    private String attachGmtCreate;



    /**
     * 无参构造
     */
    public MarketAttach() {
    }

    /**
     * 带参构造
     * @param pkMarkAttachId
     * @param fkMarketActivityId
     * @param attachName
     * @param attachUrl
     * @param attachFounder
     * @param attachGmtCreate
     */
    public MarketAttach(int pkMarkAttachId, int fkMarketActivityId, String attachName, String attachUrl, String attachFounder, String attachGmtCreate) {
        this.pkMarkAttachId = pkMarkAttachId;
        this.fkMarketActivityId = fkMarketActivityId;
        this.attachName = attachName;
        this.attachUrl = attachUrl;
        this.attachFounder = attachFounder;
        this.attachGmtCreate = attachGmtCreate;
    }

    /**
     * 显示数据
     * @return String
     */
    @Override
    public String toString() {
        return "MarketAttach{" +
                "pkMarkAttachId=" + pkMarkAttachId +
                ", fkMarketActivityId=" + fkMarketActivityId +
                ", attachName='" + attachName + '\'' +
                ", attachUrl='" + attachUrl + '\'' +
                ", attachFounder='" + attachFounder + '\'' +
                ", attachGmtCreate='" + attachGmtCreate + '\'' +
                '}';
    }
}
