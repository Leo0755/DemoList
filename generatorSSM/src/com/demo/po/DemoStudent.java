package com.demo.po;

import java.util.Date;

public class DemoStudent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student.student_id
     *
     * @mbg.generated
     */
    private Long studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student.sex
     *
     * @mbg.generated
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student.honor
     *
     * @mbg.generated
     */
    private String honor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student.create_user
     *
     * @mbg.generated
     */
    private Long createUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student.student_id
     *
     * @return the value of demo_student.student_id
     *
     * @mbg.generated
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student.student_id
     *
     * @param studentId the value for demo_student.student_id
     *
     * @mbg.generated
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student.name
     *
     * @return the value of demo_student.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student.name
     *
     * @param name the value for demo_student.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student.sex
     *
     * @return the value of demo_student.sex
     *
     * @mbg.generated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student.sex
     *
     * @param sex the value for demo_student.sex
     *
     * @mbg.generated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student.honor
     *
     * @return the value of demo_student.honor
     *
     * @mbg.generated
     */
    public String getHonor() {
        return honor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student.honor
     *
     * @param honor the value for demo_student.honor
     *
     * @mbg.generated
     */
    public void setHonor(String honor) {
        this.honor = honor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student.create_time
     *
     * @return the value of demo_student.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student.create_time
     *
     * @param createTime the value for demo_student.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student.create_user
     *
     * @return the value of demo_student.create_user
     *
     * @mbg.generated
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student.create_user
     *
     * @param createUser the value for demo_student.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }
}