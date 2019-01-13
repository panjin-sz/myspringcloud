package com.ihome.basicbiz.customer.mapper;

import com.ihome.basicbiz.customer.domain.CpPartnerLoginAlias;
import com.ihome.basicbiz.customer.domain.CpPartnerLoginAliasExample;
import org.springframework.stereotype.Repository;

/**
 * CpPartnerLoginAliasDAO继承基类
 */
@Repository
public interface CpPartnerLoginAliasDAO extends MyBatisBaseDao<CpPartnerLoginAlias, Long, CpPartnerLoginAliasExample> {
}