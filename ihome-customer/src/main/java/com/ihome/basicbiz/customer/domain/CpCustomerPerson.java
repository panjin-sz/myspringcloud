package com.ihome.basicbiz.customer.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * cp_customer_person
 * @author 
 */
@Data
public class CpCustomerPerson implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 会员ID
     */
    private Long customerId;

    /**
     * 会员姓名
     */
    private String customerName;

    /**
     * 证件号码
     */
    private String certificateNo;

    /**
     * 证件类型 1-身份证 2-护照 3-港澳居民来往内地通行证 4-台湾居民来往内地通行证 5-军官证 6-警官证 7-士兵证 99-其他证件
     */
    private int certificateType;

    /**
     * 证件正面URL
     */
    private String certificateFrontUrl;

    /**
     * 证件反面URL
     */
    private String certificateBackUrl;

    /**
     * 性别 M-男 F-女
     */
    private String gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改人
     */
    private String modifiedBy;

    /**
     * 修改时间
     */
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

}