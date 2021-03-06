package com.lgw.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JobtypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public JobtypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andJtidIsNull() {
            addCriterion("jtid is null");
            return (Criteria) this;
        }

        public Criteria andJtidIsNotNull() {
            addCriterion("jtid is not null");
            return (Criteria) this;
        }

        public Criteria andJtidEqualTo(String value) {
            addCriterion("jtid =", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidNotEqualTo(String value) {
            addCriterion("jtid <>", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidGreaterThan(String value) {
            addCriterion("jtid >", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidGreaterThanOrEqualTo(String value) {
            addCriterion("jtid >=", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidLessThan(String value) {
            addCriterion("jtid <", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidLessThanOrEqualTo(String value) {
            addCriterion("jtid <=", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidLike(String value) {
            addCriterion("jtid like", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidNotLike(String value) {
            addCriterion("jtid not like", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidIn(List<String> values) {
            addCriterion("jtid in", values, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidNotIn(List<String> values) {
            addCriterion("jtid not in", values, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidBetween(String value1, String value2) {
            addCriterion("jtid between", value1, value2, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidNotBetween(String value1, String value2) {
            addCriterion("jtid not between", value1, value2, "jtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidIsNull() {
            addCriterion("b_j_jtid is null");
            return (Criteria) this;
        }

        public Criteria andBJJtidIsNotNull() {
            addCriterion("b_j_jtid is not null");
            return (Criteria) this;
        }

        public Criteria andBJJtidEqualTo(String value) {
            addCriterion("b_j_jtid =", value, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidNotEqualTo(String value) {
            addCriterion("b_j_jtid <>", value, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidGreaterThan(String value) {
            addCriterion("b_j_jtid >", value, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidGreaterThanOrEqualTo(String value) {
            addCriterion("b_j_jtid >=", value, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidLessThan(String value) {
            addCriterion("b_j_jtid <", value, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidLessThanOrEqualTo(String value) {
            addCriterion("b_j_jtid <=", value, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidLike(String value) {
            addCriterion("b_j_jtid like", value, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidNotLike(String value) {
            addCriterion("b_j_jtid not like", value, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidIn(List<String> values) {
            addCriterion("b_j_jtid in", values, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidNotIn(List<String> values) {
            addCriterion("b_j_jtid not in", values, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidBetween(String value1, String value2) {
            addCriterion("b_j_jtid between", value1, value2, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andBJJtidNotBetween(String value1, String value2) {
            addCriterion("b_j_jtid not between", value1, value2, "bJJtid");
            return (Criteria) this;
        }

        public Criteria andJtnameIsNull() {
            addCriterion("jtname is null");
            return (Criteria) this;
        }

        public Criteria andJtnameIsNotNull() {
            addCriterion("jtname is not null");
            return (Criteria) this;
        }

        public Criteria andJtnameEqualTo(String value) {
            addCriterion("jtname =", value, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameNotEqualTo(String value) {
            addCriterion("jtname <>", value, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameGreaterThan(String value) {
            addCriterion("jtname >", value, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameGreaterThanOrEqualTo(String value) {
            addCriterion("jtname >=", value, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameLessThan(String value) {
            addCriterion("jtname <", value, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameLessThanOrEqualTo(String value) {
            addCriterion("jtname <=", value, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameLike(String value) {
            addCriterion("jtname like", value, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameNotLike(String value) {
            addCriterion("jtname not like", value, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameIn(List<String> values) {
            addCriterion("jtname in", values, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameNotIn(List<String> values) {
            addCriterion("jtname not in", values, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameBetween(String value1, String value2) {
            addCriterion("jtname between", value1, value2, "jtname");
            return (Criteria) this;
        }

        public Criteria andJtnameNotBetween(String value1, String value2) {
            addCriterion("jtname not between", value1, value2, "jtname");
            return (Criteria) this;
        }

        public Criteria andJorderIsNull() {
            addCriterion("jorder is null");
            return (Criteria) this;
        }

        public Criteria andJorderIsNotNull() {
            addCriterion("jorder is not null");
            return (Criteria) this;
        }

        public Criteria andJorderEqualTo(Integer value) {
            addCriterion("jorder =", value, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderNotEqualTo(Integer value) {
            addCriterion("jorder <>", value, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderGreaterThan(Integer value) {
            addCriterion("jorder >", value, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("jorder >=", value, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderLessThan(Integer value) {
            addCriterion("jorder <", value, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderLessThanOrEqualTo(Integer value) {
            addCriterion("jorder <=", value, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderIn(List<Integer> values) {
            addCriterion("jorder in", values, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderNotIn(List<Integer> values) {
            addCriterion("jorder not in", values, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderBetween(Integer value1, Integer value2) {
            addCriterion("jorder between", value1, value2, "jorder");
            return (Criteria) this;
        }

        public Criteria andJorderNotBetween(Integer value1, Integer value2) {
            addCriterion("jorder not between", value1, value2, "jorder");
            return (Criteria) this;
        }

        public Criteria andXmodifierIsNull() {
            addCriterion("xmodifier is null");
            return (Criteria) this;
        }

        public Criteria andXmodifierIsNotNull() {
            addCriterion("xmodifier is not null");
            return (Criteria) this;
        }

        public Criteria andXmodifierEqualTo(String value) {
            addCriterion("xmodifier =", value, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierNotEqualTo(String value) {
            addCriterion("xmodifier <>", value, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierGreaterThan(String value) {
            addCriterion("xmodifier >", value, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierGreaterThanOrEqualTo(String value) {
            addCriterion("xmodifier >=", value, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierLessThan(String value) {
            addCriterion("xmodifier <", value, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierLessThanOrEqualTo(String value) {
            addCriterion("xmodifier <=", value, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierLike(String value) {
            addCriterion("xmodifier like", value, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierNotLike(String value) {
            addCriterion("xmodifier not like", value, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierIn(List<String> values) {
            addCriterion("xmodifier in", values, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierNotIn(List<String> values) {
            addCriterion("xmodifier not in", values, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierBetween(String value1, String value2) {
            addCriterion("xmodifier between", value1, value2, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifierNotBetween(String value1, String value2) {
            addCriterion("xmodifier not between", value1, value2, "xmodifier");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeIsNull() {
            addCriterion("xmodifiytime is null");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeIsNotNull() {
            addCriterion("xmodifiytime is not null");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeEqualTo(Date value) {
            addCriterionForJDBCTime("xmodifiytime =", value, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("xmodifiytime <>", value, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeGreaterThan(Date value) {
            addCriterionForJDBCTime("xmodifiytime >", value, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("xmodifiytime >=", value, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeLessThan(Date value) {
            addCriterionForJDBCTime("xmodifiytime <", value, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("xmodifiytime <=", value, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeIn(List<Date> values) {
            addCriterionForJDBCTime("xmodifiytime in", values, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("xmodifiytime not in", values, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("xmodifiytime between", value1, value2, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXmodifiytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("xmodifiytime not between", value1, value2, "xmodifiytime");
            return (Criteria) this;
        }

        public Criteria andXcreatorIsNull() {
            addCriterion("xcreator is null");
            return (Criteria) this;
        }

        public Criteria andXcreatorIsNotNull() {
            addCriterion("xcreator is not null");
            return (Criteria) this;
        }

        public Criteria andXcreatorEqualTo(String value) {
            addCriterion("xcreator =", value, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorNotEqualTo(String value) {
            addCriterion("xcreator <>", value, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorGreaterThan(String value) {
            addCriterion("xcreator >", value, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorGreaterThanOrEqualTo(String value) {
            addCriterion("xcreator >=", value, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorLessThan(String value) {
            addCriterion("xcreator <", value, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorLessThanOrEqualTo(String value) {
            addCriterion("xcreator <=", value, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorLike(String value) {
            addCriterion("xcreator like", value, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorNotLike(String value) {
            addCriterion("xcreator not like", value, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorIn(List<String> values) {
            addCriterion("xcreator in", values, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorNotIn(List<String> values) {
            addCriterion("xcreator not in", values, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorBetween(String value1, String value2) {
            addCriterion("xcreator between", value1, value2, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatorNotBetween(String value1, String value2) {
            addCriterion("xcreator not between", value1, value2, "xcreator");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeIsNull() {
            addCriterion("xcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeIsNotNull() {
            addCriterion("xcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeEqualTo(Date value) {
            addCriterionForJDBCTime("xcreatetime =", value, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("xcreatetime <>", value, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("xcreatetime >", value, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("xcreatetime >=", value, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeLessThan(Date value) {
            addCriterionForJDBCTime("xcreatetime <", value, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("xcreatetime <=", value, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeIn(List<Date> values) {
            addCriterionForJDBCTime("xcreatetime in", values, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("xcreatetime not in", values, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("xcreatetime between", value1, value2, "xcreatetime");
            return (Criteria) this;
        }

        public Criteria andXcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("xcreatetime not between", value1, value2, "xcreatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table b_jobtype
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table b_jobtype
     *
     * @mbg.generated
     */
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