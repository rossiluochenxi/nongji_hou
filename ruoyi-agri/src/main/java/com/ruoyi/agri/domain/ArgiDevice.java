package com.ruoyi.agri.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备管理对象 argi_device
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
public class ArgiDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 用户id */
    private String userId;

    /** 部门id */
    private String deptId;

    /** 设备编号 */
    private String deviceNo;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 设备类型id */
    @Excel(name = "设备类型id")
    private String deviceTypeId;

    /** 设备类型 */
    @Excel(name = "设备类型")
    private String deviceType;

    /** 设备状态 */
    @Excel(name = "设备状态")
    private String deviceStatus;

    /** 所属农机 */
    @Excel(name = "所属农机")
    private String argiMachineryId;

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
    public void setDeviceNo(String deviceNo) 
    {
        this.deviceNo = deviceNo;
    }

    public String getDeviceNo() 
    {
        return deviceNo;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setDeviceTypeId(String deviceTypeId) 
    {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceTypeId() 
    {
        return deviceTypeId;
    }
    public void setDeviceType(String deviceType) 
    {
        this.deviceType = deviceType;
    }

    public String getDeviceType() 
    {
        return deviceType;
    }
    public void setDeviceStatus(String deviceStatus) 
    {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceStatus() 
    {
        return deviceStatus;
    }
    public void setArgiMachineryId(String argiMachineryId) 
    {
        this.argiMachineryId = argiMachineryId;
    }

    public String getArgiMachineryId() 
    {
        return argiMachineryId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("deviceNo", getDeviceNo())
            .append("deviceName", getDeviceName())
            .append("deviceTypeId", getDeviceTypeId())
            .append("deviceType", getDeviceType())
            .append("deviceStatus", getDeviceStatus())
            .append("argiMachineryId", getArgiMachineryId())
            .toString();
    }
}
