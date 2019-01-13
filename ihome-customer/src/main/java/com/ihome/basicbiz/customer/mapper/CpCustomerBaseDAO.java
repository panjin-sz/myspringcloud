package com.ihome.basicbiz.customer.mapper;

import com.ihome.basicbiz.customer.domain.CpCustomerBase;
import com.ihome.basicbiz.customer.domain.CpCustomerBaseExample;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * CpCustomerBaseDAO继承基类
 */
@Repository
public interface CpCustomerBaseDAO extends MyBatisBaseDao<CpCustomerBase, Long, CpCustomerBaseExample> {

    @Select("SELECT id, customer_id customerId, mobile, email,register_channel registerChannel," +
            "register_source registerSource, customer_level customerLevel, verification_level verificationLevel," +
            "risk_level riskLevel, customer_status customerStatus, created_time createdTime," +
            "modified_time modifiedTime FROM cp_customer_base")
    List<CpCustomerBase> queryList();

    @Select("SELECT customer_id,mobile,email,register_channel,register_source,customer_level, " +
            "verification_level,risk_level,customer_status,created_time FROM cp_customer_base WHERE " +
            "customer_id = #{0}")
    @Results(value = {@Result(property = "customerId", column = "customer_id"),
            @Result(property = "mobile", column = "mobile"), @Result(property = "email", column = "email"),
            @Result(property = "registerChannel", column = "register_channel"),
            @Result(property = "registerSource", column = "register_source"),
            @Result(property = "customerLevel", column = "customer_level"),
            @Result(property = "verificationLevel", column = "verification_level"),
            @Result(property = "riskLevel", column = "risk_level"),
            @Result(property = "customerStatus", column = "customer_status"),
            @Result(property = "createdTime", column = "created_time", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP)})
    CpCustomerBase queryByCustomerId(Long customerId);
}