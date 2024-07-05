package com.ruoyi.biz.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 业务任务对象 biz_tasks
 * 
 * @author 罗晨熙
 * @date 2024-05-24
 */
public class BizTasks extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 用户id */
    private String userId;

    /** 部门id */
    private String deptId;

    /** 农机主id */
    private String agriFarmerId;

    /** 农机主 */
    @Excel(name = "农机主")
    private String agriFarmerName;

    /** 面积id */
    private String agriFieldsId;

    /** 农耕作业 */
    @Excel(name = "农耕作业")
    private String agriFieldsName;

    /** 任务开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 任务结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 任务状态 */
    @Excel(name = "任务状态")
    private String status;

    /** 任务流水号 */
    private String serialNum;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String bizName;



    public String getTaskCreate() {
        return taskCreate;
    }

    public void setTaskCreate(String taskCreate) {
        this.taskCreate = taskCreate;
    }

    /** 任务创建者 */
    @Excel(name = "任务创建者")
    private String taskCreate;

    public String getWithdrawLive() {
        return withdrawLive;
    }

    public void setWithdrawLive(String withdrawLive) {
        this.withdrawLive = withdrawLive;
    }

    /** 撤回状态 */
    @Excel(name = "撤回状态")
    private String withdrawLive;

    public String getAgriTypeId() {
        return agriTypeId;
    }

    public void setAgriTypeId(String agriTypeId) {
        this.agriTypeId = agriTypeId;
    }

    public String getAgriTypeCategory() {
        return agriTypeCategory;
    }

    public void setAgriTypeCategory(String agriTypeCategory) {
        this.agriTypeCategory = agriTypeCategory;
    }

    public String getAgriTypeType() {
        return agriTypeType;
    }

    public void setAgriTypeType(String agriTypeType) {
        this.agriTypeType = agriTypeType;
    }

    /** 耕地类型id */
    private String agriTypeId;

    /** 耕地类别 */
    @Excel(name = "耕地类别")
    private String agriTypeCategory;

    /** 耕地类型 */
    @Excel(name = "耕地类型")
    private String agriTypeType;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setDeptId(String deptId) 
    {
        this.deptId = deptId;
    }

    public String getDeptId() 
    {
        return deptId;
    }
    public void setAgriFarmerId(String agriFarmerId) 
    {
        this.agriFarmerId = agriFarmerId;
    }

    public String getAgriFarmerId() 
    {
        return agriFarmerId;
    }
    public void setAgriFarmerName(String agriFarmerName) 
    {
        this.agriFarmerName = agriFarmerName;
    }

    public String getAgriFarmerName() 
    {
        return agriFarmerName;
    }
    public void setAgriFieldsId(String agriFieldsId) 
    {
        this.agriFieldsId = agriFieldsId;
    }

    public String getAgriFieldsId() 
    {
        return agriFieldsId;
    }
    public void setAgriFieldsName(String agriFieldsName) 
    {
        this.agriFieldsName = agriFieldsName;
    }

    public String getAgriFieldsName() 
    {
        return agriFieldsName;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setSerialNum(String serialNum) 
    {
        this.serialNum = serialNum;
    }

    public String getSerialNum() 
    {
        return serialNum;
    }
    public void setBizName(String bizName) 
    {
        this.bizName = bizName;
    }

    public String getBizName() 
    {
        return bizName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("agriFarmerId", getAgriFarmerId())
            .append("agriFarmerName", getAgriFarmerName())
            .append("agriFieldsId", getAgriFieldsId())
            .append("agriFieldsName", getAgriFieldsName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("status", getStatus())
            .append("serialNum", getSerialNum())
            .append("bizName", getBizName())
            .toString();
    }
}
