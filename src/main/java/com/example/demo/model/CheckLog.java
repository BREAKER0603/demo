package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "check_log")
public class CheckLog {
    @Id
    private Integer id;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 审核进度
     */
    @Column(name = "auditing_process")
    private Integer auditingProcess;

    /**
     * 当前审核人ID
     */
    @Column(name = "auditing_user_id")
    private Integer auditingUserId;

    /**
     * 当前审核人姓名
     */
    @Column(name = "auditing_user_name")
    private String auditingUserName;

    /**
     * 下一个审核进度名称/下一节点
     */
    @Column(name = "next_auditing_process")
    private Integer nextAuditingProcess;

    /**
     * 下一个审id
     */
    @Column(name = "next_auditing_user_id")
    private Integer nextAuditingUserId;

    /**
     * 审核意见/操作说明
     */
    @Column(name = "auditing_msg")
    private String auditingMsg;

    /**
     *  1：立项   2：通过  -1：驳回
     */
    private String operation;

    /**
     * -- 1:订单  2：项目
     */
    private Integer type;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取审核进度
     *
     * @return auditing_process - 审核进度
     */
    public Integer getAuditingProcess() {
        return auditingProcess;
    }

    /**
     * 设置审核进度
     *
     * @param auditingProcess 审核进度
     */
    public void setAuditingProcess(Integer auditingProcess) {
        this.auditingProcess = auditingProcess;
    }

    /**
     * 获取当前审核人ID
     *
     * @return auditing_user_id - 当前审核人ID
     */
    public Integer getAuditingUserId() {
        return auditingUserId;
    }

    /**
     * 设置当前审核人ID
     *
     * @param auditingUserId 当前审核人ID
     */
    public void setAuditingUserId(Integer auditingUserId) {
        this.auditingUserId = auditingUserId;
    }

    /**
     * 获取当前审核人姓名
     *
     * @return auditing_user_name - 当前审核人姓名
     */
    public String getAuditingUserName() {
        return auditingUserName;
    }

    /**
     * 设置当前审核人姓名
     *
     * @param auditingUserName 当前审核人姓名
     */
    public void setAuditingUserName(String auditingUserName) {
        this.auditingUserName = auditingUserName == null ? null : auditingUserName.trim();
    }

    /**
     * 获取下一个审核进度名称/下一节点
     *
     * @return next_auditing_process - 下一个审核进度名称/下一节点
     */
    public Integer getNextAuditingProcess() {
        return nextAuditingProcess;
    }

    /**
     * 设置下一个审核进度名称/下一节点
     *
     * @param nextAuditingProcess 下一个审核进度名称/下一节点
     */
    public void setNextAuditingProcess(Integer nextAuditingProcess) {
        this.nextAuditingProcess = nextAuditingProcess;
    }

    /**
     * 获取下一个审id
     *
     * @return next_auditing_user_id - 下一个审id
     */
    public Integer getNextAuditingUserId() {
        return nextAuditingUserId;
    }

    /**
     * 设置下一个审id
     *
     * @param nextAuditingUserId 下一个审id
     */
    public void setNextAuditingUserId(Integer nextAuditingUserId) {
        this.nextAuditingUserId = nextAuditingUserId;
    }

    /**
     * 获取审核意见/操作说明
     *
     * @return auditing_msg - 审核意见/操作说明
     */
    public String getAuditingMsg() {
        return auditingMsg;
    }

    /**
     * 设置审核意见/操作说明
     *
     * @param auditingMsg 审核意见/操作说明
     */
    public void setAuditingMsg(String auditingMsg) {
        this.auditingMsg = auditingMsg == null ? null : auditingMsg.trim();
    }

    /**
     * 获取 1：立项   2：通过  -1：驳回
     *
     * @return operation -  1：立项   2：通过  -1：驳回
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 设置 1：立项   2：通过  -1：驳回
     *
     * @param operation  1：立项   2：通过  -1：驳回
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * 获取-- 1:订单  2：项目
     *
     * @return type - -- 1:订单  2：项目
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置-- 1:订单  2：项目
     *
     * @param type -- 1:订单  2：项目
     */
    public void setType(Integer type) {
        this.type = type;
    }
}