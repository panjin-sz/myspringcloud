package com.ihome.basicbiz.customer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * cp_customer_relationship
 * @author 
 */
public class CpCustomerRelationship implements Serializable {
    /**
     * 主键
     */
    private Long id;

    private Long customerId;

    private Long parentCustomerId;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getParentCustomerId() {
        return parentCustomerId;
    }

    public void setParentCustomerId(Long parentCustomerId) {
        this.parentCustomerId = parentCustomerId;
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