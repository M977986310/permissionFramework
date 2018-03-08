package com.mlw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLogExample() {
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

    private Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        GeneratedCriteria() {
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

        void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        void addCriterion(String condition, Object value1, Object value2, String property) {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andLogtitleIsNull() {
            addCriterion("logTitle is null");
            return (Criteria) this;
        }

        public Criteria andLogtitleIsNotNull() {
            addCriterion("logTitle is not null");
            return (Criteria) this;
        }

        public Criteria andLogtitleEqualTo(String value) {
            addCriterion("logTitle =", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleNotEqualTo(String value) {
            addCriterion("logTitle <>", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleGreaterThan(String value) {
            addCriterion("logTitle >", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleGreaterThanOrEqualTo(String value) {
            addCriterion("logTitle >=", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleLessThan(String value) {
            addCriterion("logTitle <", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleLessThanOrEqualTo(String value) {
            addCriterion("logTitle <=", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleLike(String value) {
            addCriterion("logTitle like", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleNotLike(String value) {
            addCriterion("logTitle not like", value, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleIn(List<String> values) {
            addCriterion("logTitle in", values, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleNotIn(List<String> values) {
            addCriterion("logTitle not in", values, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleBetween(String value1, String value2) {
            addCriterion("logTitle between", value1, value2, "logtitle");
            return (Criteria) this;
        }

        public Criteria andLogtitleNotBetween(String value1, String value2) {
            addCriterion("logTitle not between", value1, value2, "logtitle");
            return (Criteria) this;
        }

        public Criteria andClientipIsNull() {
            addCriterion("clientIp is null");
            return (Criteria) this;
        }

        public Criteria andClientipIsNotNull() {
            addCriterion("clientIp is not null");
            return (Criteria) this;
        }

        public Criteria andClientipEqualTo(String value) {
            addCriterion("clientIp =", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipNotEqualTo(String value) {
            addCriterion("clientIp <>", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipGreaterThan(String value) {
            addCriterion("clientIp >", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipGreaterThanOrEqualTo(String value) {
            addCriterion("clientIp >=", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipLessThan(String value) {
            addCriterion("clientIp <", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipLessThanOrEqualTo(String value) {
            addCriterion("clientIp <=", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipLike(String value) {
            addCriterion("clientIp like", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipNotLike(String value) {
            addCriterion("clientIp not like", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipIn(List<String> values) {
            addCriterion("clientIp in", values, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipNotIn(List<String> values) {
            addCriterion("clientIp not in", values, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipBetween(String value1, String value2) {
            addCriterion("clientIp between", value1, value2, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipNotBetween(String value1, String value2) {
            addCriterion("clientIp not between", value1, value2, "clientip");
            return (Criteria) this;
        }

        public Criteria andRequesturlIsNull() {
            addCriterion("requestUrl is null");
            return (Criteria) this;
        }

        public Criteria andRequesturlIsNotNull() {
            addCriterion("requestUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRequesturlEqualTo(String value) {
            addCriterion("requestUrl =", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlNotEqualTo(String value) {
            addCriterion("requestUrl <>", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlGreaterThan(String value) {
            addCriterion("requestUrl >", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlGreaterThanOrEqualTo(String value) {
            addCriterion("requestUrl >=", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlLessThan(String value) {
            addCriterion("requestUrl <", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlLessThanOrEqualTo(String value) {
            addCriterion("requestUrl <=", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlLike(String value) {
            addCriterion("requestUrl like", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlNotLike(String value) {
            addCriterion("requestUrl not like", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlIn(List<String> values) {
            addCriterion("requestUrl in", values, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlNotIn(List<String> values) {
            addCriterion("requestUrl not in", values, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlBetween(String value1, String value2) {
            addCriterion("requestUrl between", value1, value2, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlNotBetween(String value1, String value2) {
            addCriterion("requestUrl not between", value1, value2, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequestmethodIsNull() {
            addCriterion("requestMethod is null");
            return (Criteria) this;
        }

        public Criteria andRequestmethodIsNotNull() {
            addCriterion("requestMethod is not null");
            return (Criteria) this;
        }

        public Criteria andRequestmethodEqualTo(String value) {
            addCriterion("requestMethod =", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodNotEqualTo(String value) {
            addCriterion("requestMethod <>", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodGreaterThan(String value) {
            addCriterion("requestMethod >", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodGreaterThanOrEqualTo(String value) {
            addCriterion("requestMethod >=", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodLessThan(String value) {
            addCriterion("requestMethod <", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodLessThanOrEqualTo(String value) {
            addCriterion("requestMethod <=", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodLike(String value) {
            addCriterion("requestMethod like", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodNotLike(String value) {
            addCriterion("requestMethod not like", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodIn(List<String> values) {
            addCriterion("requestMethod in", values, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodNotIn(List<String> values) {
            addCriterion("requestMethod not in", values, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodBetween(String value1, String value2) {
            addCriterion("requestMethod between", value1, value2, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodNotBetween(String value1, String value2) {
            addCriterion("requestMethod not between", value1, value2, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNull() {
            addCriterion("logTime is null");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNotNull() {
            addCriterion("logTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogtimeEqualTo(Date value) {
            addCriterion("logTime =", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotEqualTo(Date value) {
            addCriterion("logTime <>", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThan(Date value) {
            addCriterion("logTime >", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logTime >=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThan(Date value) {
            addCriterion("logTime <", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThanOrEqualTo(Date value) {
            addCriterion("logTime <=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeIn(List<Date> values) {
            addCriterion("logTime in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotIn(List<Date> values) {
            addCriterion("logTime not in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeBetween(Date value1, Date value2) {
            addCriterion("logTime between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotBetween(Date value1, Date value2) {
            addCriterion("logTime not between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }
    }

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

        Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        Criterion(String condition, Object value, String typeHandler) {
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

        Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}