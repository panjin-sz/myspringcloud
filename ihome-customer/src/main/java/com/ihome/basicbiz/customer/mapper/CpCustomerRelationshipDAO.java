package com.ihome.basicbiz.customer.mapper;

import com.ihome.basicbiz.customer.domain.CpCustomerRelationship;
import com.ihome.basicbiz.customer.domain.CpCustomerRelationshipExample;
import org.springframework.stereotype.Repository;

/**
 * CpCustomerRelationshipDAO继承基类
 */
@Repository
public interface CpCustomerRelationshipDAO extends MyBatisBaseDao<CpCustomerRelationship, Long, CpCustomerRelationshipExample> {
}