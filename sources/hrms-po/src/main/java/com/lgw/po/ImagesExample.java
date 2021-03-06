package com.lgw.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImagesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table p_images
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table p_images
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table p_images
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
     *
     * @mbg.generated
     */
    public ImagesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
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
     * This method corresponds to the database table p_images
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
     * This method corresponds to the database table p_images
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_images
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
     * This class corresponds to the database table p_images
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

        public Criteria andInameIsNull() {
            addCriterion("iname is null");
            return (Criteria) this;
        }

        public Criteria andInameIsNotNull() {
            addCriterion("iname is not null");
            return (Criteria) this;
        }

        public Criteria andInameEqualTo(String value) {
            addCriterion("iname =", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotEqualTo(String value) {
            addCriterion("iname <>", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThan(String value) {
            addCriterion("iname >", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThanOrEqualTo(String value) {
            addCriterion("iname >=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThan(String value) {
            addCriterion("iname <", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThanOrEqualTo(String value) {
            addCriterion("iname <=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLike(String value) {
            addCriterion("iname like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotLike(String value) {
            addCriterion("iname not like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameIn(List<String> values) {
            addCriterion("iname in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotIn(List<String> values) {
            addCriterion("iname not in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameBetween(String value1, String value2) {
            addCriterion("iname between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotBetween(String value1, String value2) {
            addCriterion("iname not between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andDirIsNull() {
            addCriterion("dir is null");
            return (Criteria) this;
        }

        public Criteria andDirIsNotNull() {
            addCriterion("dir is not null");
            return (Criteria) this;
        }

        public Criteria andDirEqualTo(String value) {
            addCriterion("dir =", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotEqualTo(String value) {
            addCriterion("dir <>", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirGreaterThan(String value) {
            addCriterion("dir >", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirGreaterThanOrEqualTo(String value) {
            addCriterion("dir >=", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLessThan(String value) {
            addCriterion("dir <", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLessThanOrEqualTo(String value) {
            addCriterion("dir <=", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLike(String value) {
            addCriterion("dir like", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotLike(String value) {
            addCriterion("dir not like", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirIn(List<String> values) {
            addCriterion("dir in", values, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotIn(List<String> values) {
            addCriterion("dir not in", values, "dir");
            return (Criteria) this;
        }

        public Criteria andDirBetween(String value1, String value2) {
            addCriterion("dir between", value1, value2, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotBetween(String value1, String value2) {
            addCriterion("dir not between", value1, value2, "dir");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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
     * This class corresponds to the database table p_images
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
     * This class corresponds to the database table p_images
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