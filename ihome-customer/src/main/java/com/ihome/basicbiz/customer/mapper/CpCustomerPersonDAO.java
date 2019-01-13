package com.ihome.basicbiz.customer.mapper;

import com.ihome.basicbiz.customer.domain.CpCustomerPerson;
import com.ihome.basicbiz.customer.domain.CpCustomerPersonExample;
import org.springframework.stereotype.Repository;

/**
 * CpCustomerPersonDAO继承基类
 */
@Repository
public interface CpCustomerPersonDAO extends MyBatisBaseDao<CpCustomerPerson, Long, CpCustomerPersonExample> {
}