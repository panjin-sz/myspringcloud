package com.ihome.basicbiz.customer.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CpCustomerBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CpCustomerBaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelIsNull() {
            addCriterion("register_channel is null");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelIsNotNull() {
            addCriterion("register_channel is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelEqualTo(Boolean value) {
            addCriterion("register_channel =", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelNotEqualTo(Boolean value) {
            addCriterion("register_channel <>", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelGreaterThan(Boolean value) {
            addCriterion("register_channel >", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("register_channel >=", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelLessThan(Boolean value) {
            addCriterion("register_channel <", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelLessThanOrEqualTo(Boolean value) {
            addCriterion("register_channel <=", value, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelIn(List<Boolean> values) {
            addCriterion("register_channel in", values, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelNotIn(List<Boolean> values) {
            addCriterion("register_channel not in", values, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelBetween(Boolean value1, Boolean value2) {
            addCriterion("register_channel between", value1, value2, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterChannelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("register_channel not between", value1, value2, "registerChannel");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceIsNull() {
            addCriterion("register_source is null");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceIsNotNull() {
            addCriterion("register_source is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceEqualTo(Boolean value) {
            addCriterion("register_source =", value, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceNotEqualTo(Boolean value) {
            addCriterion("register_source <>", value, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceGreaterThan(Boolean value) {
            addCriterion("register_source >", value, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("register_source >=", value, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceLessThan(Boolean value) {
            addCriterion("register_source <", value, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceLessThanOrEqualTo(Boolean value) {
            addCriterion("register_source <=", value, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceIn(List<Boolean> values) {
            addCriterion("register_source in", values, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceNotIn(List<Boolean> values) {
            addCriterion("register_source not in", values, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceBetween(Boolean value1, Boolean value2) {
            addCriterion("register_source between", value1, value2, "registerSource");
            return (Criteria) this;
        }

        public Criteria andRegisterSourceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("register_source not between", value1, value2, "registerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("customer_level is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("customer_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(Boolean value) {
            addCriterion("customer_level =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(Boolean value) {
            addCriterion("customer_level <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(Boolean value) {
            addCriterion("customer_level >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("customer_level >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(Boolean value) {
            addCriterion("customer_level <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("customer_level <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<Boolean> values) {
            addCriterion("customer_level in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<Boolean> values) {
            addCriterion("customer_level not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("customer_level between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("customer_level not between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelIsNull() {
            addCriterion("verification_level is null");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelIsNotNull() {
            addCriterion("verification_level is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelEqualTo(Boolean value) {
            addCriterion("verification_level =", value, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelNotEqualTo(Boolean value) {
            addCriterion("verification_level <>", value, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelGreaterThan(Boolean value) {
            addCriterion("verification_level >", value, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("verification_level >=", value, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelLessThan(Boolean value) {
            addCriterion("verification_level <", value, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("verification_level <=", value, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelIn(List<Boolean> values) {
            addCriterion("verification_level in", values, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelNotIn(List<Boolean> values) {
            addCriterion("verification_level not in", values, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("verification_level between", value1, value2, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andVerificationLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("verification_level not between", value1, value2, "verificationLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("risk_level is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("risk_level is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(Boolean value) {
            addCriterion("risk_level =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(Boolean value) {
            addCriterion("risk_level <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(Boolean value) {
            addCriterion("risk_level >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("risk_level >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(Boolean value) {
            addCriterion("risk_level <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("risk_level <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<Boolean> values) {
            addCriterion("risk_level in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<Boolean> values) {
            addCriterion("risk_level not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("risk_level between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("risk_level not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("customer_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("customer_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(Boolean value) {
            addCriterion("customer_status =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(Boolean value) {
            addCriterion("customer_status <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(Boolean value) {
            addCriterion("customer_status >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("customer_status >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(Boolean value) {
            addCriterion("customer_status <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("customer_status <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<Boolean> values) {
            addCriterion("customer_status in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<Boolean> values) {
            addCriterion("customer_status not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("customer_status between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("customer_status not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}