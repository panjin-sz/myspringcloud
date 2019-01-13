package com.ihome.basicbiz.customer.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author panjin.
 * @date 2018/8/5.
 */
@Data
public class CpCustomerBase implements Serializable{

    private static final long serialVersionUID = -2003787881373796408L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 会员ID
     */
    private Long customerId;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 注册渠道 1-APP 2-WEB 3-API 4-OFFLINE
     */
    private int registerChannel;

    /**
     * 注册来源 1-官方 2-合作方
     */
    private int registerSource;

    /**
     * 会员等级 1-大众；2-黄金；3-铂金；4-钻石
     */
    private int customerLevel;

    /**
     * 验证等级 1-未实名 2-弱实名 3-中实名 4-强实名
     */
    private int verificationLevel;

    /**
     * 风险等级 1-1级 2-2级 3-3级
     */
    private int riskLevel;

    /**
     * 会员状态 1-正常 2-禁用 3-注销
     */
    private int customerStatus;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date modifiedTime;
}
