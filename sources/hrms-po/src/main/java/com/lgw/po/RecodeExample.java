package com.lgw.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    public RecodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
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
     * This method corresponds to the database table jrecode
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
     * This method corresponds to the database table jrecode
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrecode
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
     * This class corresponds to the database table jrecode
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

        public Criteria andJridIsNull() {
            addCriterion("jrid is null");
            return (Criteria) this;
        }

        public Criteria andJridIsNotNull() {
            addCriterion("jrid is not null");
            return (Criteria) this;
        }

        public Criteria andJridEqualTo(String value) {
            addCriterion("jrid =", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridNotEqualTo(String value) {
            addCriterion("jrid <>", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridGreaterThan(String value) {
            addCriterion("jrid >", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridGreaterThanOrEqualTo(String value) {
            addCriterion("jrid >=", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridLessThan(String value) {
            addCriterion("jrid <", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridLessThanOrEqualTo(String value) {
            addCriterion("jrid <=", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridLike(String value) {
            addCriterion("jrid like", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridNotLike(String value) {
            addCriterion("jrid not like", value, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridIn(List<String> values) {
            addCriterion("jrid in", values, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridNotIn(List<String> values) {
            addCriterion("jrid not in", values, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridBetween(String value1, String value2) {
            addCriterion("jrid between", value1, value2, "jrid");
            return (Criteria) this;
        }

        public Criteria andJridNotBetween(String value1, String value2) {
            addCriterion("jrid not between", value1, value2, "jrid");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("jobid is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobid is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(String value) {
            addCriterion("jobid =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(String value) {
            addCriterion("jobid <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(String value) {
            addCriterion("jobid >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(String value) {
            addCriterion("jobid >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(String value) {
            addCriterion("jobid <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(String value) {
            addCriterion("jobid <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLike(String value) {
            addCriterion("jobid like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotLike(String value) {
            addCriterion("jobid not like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<String> values) {
            addCriterion("jobid in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<String> values) {
            addCriterion("jobid not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(String value1, String value2) {
            addCriterion("jobid between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(String value1, String value2) {
            addCriterion("jobid not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andSendidIsNull() {
            addCriterion("sendid is null");
            return (Criteria) this;
        }

        public Criteria andSendidIsNotNull() {
            addCriterion("sendid is not null");
            return (Criteria) this;
        }

        public Criteria andSendidEqualTo(String value) {
            addCriterion("sendid =", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotEqualTo(String value) {
            addCriterion("sendid <>", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThan(String value) {
            addCriterion("sendid >", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThanOrEqualTo(String value) {
            addCriterion("sendid >=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThan(String value) {
            addCriterion("sendid <", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThanOrEqualTo(String value) {
            addCriterion("sendid <=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLike(String value) {
            addCriterion("sendid like", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotLike(String value) {
            addCriterion("sendid not like", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidIn(List<String> values) {
            addCriterion("sendid in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotIn(List<String> values) {
            addCriterion("sendid not in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidBetween(String value1, String value2) {
            addCriterion("sendid between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotBetween(String value1, String value2) {
            addCriterion("sendid not between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifytime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterionForJDBCTime("modifytime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("modifytime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterionForJDBCTime("modifytime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("modifytime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterionForJDBCTime("modifytime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("modifytime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterionForJDBCTime("modifytime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("modifytime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("modifytime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("modifytime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCTime("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCTime("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCTime("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andBlank1IsNull() {
            addCriterion("blank1 is null");
            return (Criteria) this;
        }

        public Criteria andBlank1IsNotNull() {
            addCriterion("blank1 is not null");
            return (Criteria) this;
        }

        public Criteria andBlank1EqualTo(String value) {
            addCriterion("blank1 =", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1NotEqualTo(String value) {
            addCriterion("blank1 <>", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1GreaterThan(String value) {
            addCriterion("blank1 >", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1GreaterThanOrEqualTo(String value) {
            addCriterion("blank1 >=", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1LessThan(String value) {
            addCriterion("blank1 <", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1LessThanOrEqualTo(String value) {
            addCriterion("blank1 <=", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1Like(String value) {
            addCriterion("blank1 like", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1NotLike(String value) {
            addCriterion("blank1 not like", value, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1In(List<String> values) {
            addCriterion("blank1 in", values, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1NotIn(List<String> values) {
            addCriterion("blank1 not in", values, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1Between(String value1, String value2) {
            addCriterion("blank1 between", value1, value2, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank1NotBetween(String value1, String value2) {
            addCriterion("blank1 not between", value1, value2, "blank1");
            return (Criteria) this;
        }

        public Criteria andBlank2IsNull() {
            addCriterion("blank2 is null");
            return (Criteria) this;
        }

        public Criteria andBlank2IsNotNull() {
            addCriterion("blank2 is not null");
            return (Criteria) this;
        }

        public Criteria andBlank2EqualTo(String value) {
            addCriterion("blank2 =", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2NotEqualTo(String value) {
            addCriterion("blank2 <>", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2GreaterThan(String value) {
            addCriterion("blank2 >", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2GreaterThanOrEqualTo(String value) {
            addCriterion("blank2 >=", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2LessThan(String value) {
            addCriterion("blank2 <", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2LessThanOrEqualTo(String value) {
            addCriterion("blank2 <=", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2Like(String value) {
            addCriterion("blank2 like", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2NotLike(String value) {
            addCriterion("blank2 not like", value, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2In(List<String> values) {
            addCriterion("blank2 in", values, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2NotIn(List<String> values) {
            addCriterion("blank2 not in", values, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2Between(String value1, String value2) {
            addCriterion("blank2 between", value1, value2, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank2NotBetween(String value1, String value2) {
            addCriterion("blank2 not between", value1, value2, "blank2");
            return (Criteria) this;
        }

        public Criteria andBlank3IsNull() {
            addCriterion("blank3 is null");
            return (Criteria) this;
        }

        public Criteria andBlank3IsNotNull() {
            addCriterion("blank3 is not null");
            return (Criteria) this;
        }

        public Criteria andBlank3EqualTo(String value) {
            addCriterion("blank3 =", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3NotEqualTo(String value) {
            addCriterion("blank3 <>", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3GreaterThan(String value) {
            addCriterion("blank3 >", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3GreaterThanOrEqualTo(String value) {
            addCriterion("blank3 >=", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3LessThan(String value) {
            addCriterion("blank3 <", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3LessThanOrEqualTo(String value) {
            addCriterion("blank3 <=", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3Like(String value) {
            addCriterion("blank3 like", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3NotLike(String value) {
            addCriterion("blank3 not like", value, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3In(List<String> values) {
            addCriterion("blank3 in", values, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3NotIn(List<String> values) {
            addCriterion("blank3 not in", values, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3Between(String value1, String value2) {
            addCriterion("blank3 between", value1, value2, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank3NotBetween(String value1, String value2) {
            addCriterion("blank3 not between", value1, value2, "blank3");
            return (Criteria) this;
        }

        public Criteria andBlank4IsNull() {
            addCriterion("blank4 is null");
            return (Criteria) this;
        }

        public Criteria andBlank4IsNotNull() {
            addCriterion("blank4 is not null");
            return (Criteria) this;
        }

        public Criteria andBlank4EqualTo(String value) {
            addCriterion("blank4 =", value, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4NotEqualTo(String value) {
            addCriterion("blank4 <>", value, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4GreaterThan(String value) {
            addCriterion("blank4 >", value, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4GreaterThanOrEqualTo(String value) {
            addCriterion("blank4 >=", value, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4LessThan(String value) {
            addCriterion("blank4 <", value, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4LessThanOrEqualTo(String value) {
            addCriterion("blank4 <=", value, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4Like(String value) {
            addCriterion("blank4 like", value, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4NotLike(String value) {
            addCriterion("blank4 not like", value, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4In(List<String> values) {
            addCriterion("blank4 in", values, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4NotIn(List<String> values) {
            addCriterion("blank4 not in", values, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4Between(String value1, String value2) {
            addCriterion("blank4 between", value1, value2, "blank4");
            return (Criteria) this;
        }

        public Criteria andBlank4NotBetween(String value1, String value2) {
            addCriterion("blank4 not between", value1, value2, "blank4");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jrecode
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
     * This class corresponds to the database table jrecode
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