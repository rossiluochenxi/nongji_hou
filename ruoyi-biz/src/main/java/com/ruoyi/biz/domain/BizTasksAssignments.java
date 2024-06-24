package com.ruoyi.biz.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 我的任务对象 biz_tasks_assignments
 * 
 * @author 罗晨熙
 * @date 2024-06-21
 */
public class BizTasksAssignments extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 用户id */
    @Excel(name = "用户id")
    private String userId;

    /** 部门id */
    @Excel(name = "部门id")
    private String deptId;

    /** 任务id */
    @Excel(name = "任务id")
    private String bizTasksId;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String bizTasksName;

    /** 农机主id */
    @Excel(name = "农机主id")
    private String agriFarmerId;

    /** 农机主 */
    @Excel(name = "农机主")
    private String agriFarmerName;

    /** 面积id */
    @Excel(name = "面积id")
    private String agriFieldsId;

    /** 面积名字 */
    @Excel(name = "面积名字")
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
    private String tasksStatus;

    /** 任务流水号 */
    @Excel(name = "任务流水号")
    private String serialNum;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String bizName;

    /** 耕地类型id */
    @Excel(name = "耕地类型id")
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
    public void setBizTasksId(String bizTasksId) 
    {
        this.bizTasksId = bizTasksId;
    }

    public String getBizTasksId() 
    {
        return bizTasksId;
    }
    public void setBizTasksName(String bizTasksName) 
    {
        this.bizTasksName = bizTasksName;
    }

    public String getBizTasksName() 
    {
        return bizTasksName;
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
    public void setTasksStatus(String tasksStatus) 
    {
        this.tasksStatus = tasksStatus;
    }

    public String getTasksStatus() 
    {
        return tasksStatus;
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
    public void setAgriTypeId(String agriTypeId) 
    {
        this.agriTypeId = agriTypeId;
    }

    public String getAgriTypeId() 
    {
        return agriTypeId;
    }
    public void setAgriTypeCategory(String agriTypeCategory) 
    {
        this.agriTypeCategory = agriTypeCategory;
    }

    public String getAgriTypeCategory() 
    {
        return agriTypeCategory;
    }
    public void setAgriTypeType(String agriTypeType) 
    {
        this.agriTypeType = agriTypeType;
    }

    public String getAgriTypeType() 
    {
        return agriTypeType;
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
            .append("bizTasksId", getBizTasksId())
            .append("bizTasksName", getBizTasksName())
            .append("agriFarmerId", getAgriFarmerId())
            .append("agriFarmerName", getAgriFarmerName())
            .append("agriFieldsId", getAgriFieldsId())
            .append("agriFieldsName", getAgriFieldsName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("tasksStatus", getTasksStatus())
            .append("serialNum", getSerialNum())
            .append("bizName", getBizName())
            .append("agriTypeId", getAgriTypeId())
            .append("agriTypeCategory", getAgriTypeCategory())
            .append("agriTypeType", getAgriTypeType())
            .toString();
    }
}
