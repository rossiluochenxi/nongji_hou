package com.ruoyi.biz.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 任务流水详情对象 biz_tasks_serial
 * 
 * @author 罗晨熙
 * @date 2024-05-26
 */
public class BizTasksSerial extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 用户id */
    private String userId;

    /** 部门id */
    private String deptId;

    /** 任务id */
    private String bizTasks;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String bizName;

    /** 农机主id */
    private String agriFarmerId;

    /** 地图表id */
    private String agriFieldsId;

    /** 地图名字 */
    @Excel(name = "地图名字")
    private String agriFieldsName;

    /** 每日工作开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "每日工作开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 每日工作结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "每日工作结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 流水号 */
    @Excel(name = "流水号")
    private String tasksSerialNum;

    /** 数据表id */
    private String deviceDataId;

    /** 农机主 */
    @Excel(name = "农机主")
    private String agriFarmerName;

    /** 耕地类型id */
    private String agriTypeId;

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
    public void setBizTasks(String bizTasks) 
    {
        this.bizTasks = bizTasks;
    }

    public String getBizTasks() 
    {
        return bizTasks;
    }
    public void setBizName(String bizName) 
    {
        this.bizName = bizName;
    }

    public String getBizName() 
    {
        return bizName;
    }
    public void setAgriFarmerId(String agriFarmerId) 
    {
        this.agriFarmerId = agriFarmerId;
    }

    public String getAgriFarmerId() 
    {
        return agriFarmerId;
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
    public void setTasksSerialNum(String tasksSerialNum) 
    {
        this.tasksSerialNum = tasksSerialNum;
    }

    public String getTasksSerialNum() 
    {
        return tasksSerialNum;
    }
    public void setDeviceDataId(String deviceDataId) 
    {
        this.deviceDataId = deviceDataId;
    }

    public String getDeviceDataId() 
    {
        return deviceDataId;
    }
    public void setAgriFarmerName(String agriFarmerName) 
    {
        this.agriFarmerName = agriFarmerName;
    }

    public String getAgriFarmerName() 
    {
        return agriFarmerName;
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
            .append("bizTasks", getBizTasks())
            .append("bizName", getBizName())
            .append("agriFarmerId", getAgriFarmerId())
            .append("agriFieldsId", getAgriFieldsId())
            .append("agriFieldsName", getAgriFieldsName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("tasksSerialNum", getTasksSerialNum())
            .append("deviceDataId", getDeviceDataId())
            .append("agriFarmerName", getAgriFarmerName())
            .toString();
    }
}
