package com.ihome.basicbiz.customer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * cp_partner_login_alias
 * @author 
 */
public class CpPartnerLoginAlias implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 外部会员ID+渠道编码
     */
    private String aliasSourceNo;

    /**
     * 会员ID
     */
    private Long customerId;

    /**
     * 外部会员ID
     */
    private String outCustomerId;

    /**
     * 渠道编号
     */
    private String sourceNo;

    /**
     * 渠道名称
     */
    private String sourceName;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAliasSourceNo() {
        return aliasSourceNo;
    }

    public void setAliasSourceNo(String aliasSourceNo) {
        this.aliasSourceNo = aliasSourceNo;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getOutCustomerId() {
        return outCustomerId;
    }

    public void setOutCustomerId(String outCustomerId) {
        this.outCustomerId = outCustomerId;
    }

    public String getSourceNo() {
        return sourceNo;
    }

    public void setSourceNo(String sourceNo) {
        this.sourceNo = sourceNo;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}