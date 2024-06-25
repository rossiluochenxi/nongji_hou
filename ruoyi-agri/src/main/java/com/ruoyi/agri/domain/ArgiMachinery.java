package com.ruoyi.agri.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 农机管理对象 argi_machinery
 * 
 * @author 罗晨熙
 * @date 2024-05-20
 */
public class ArgiMachinery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 用户id */
    private String userId;

    /** 部门id */
    private String deptId;

    /** 农机主 */
    private String name;

    /** 主机号 */
    @Excel(name = "主机号")
    private String hostNum;

    /** 绑定任务状态 */
    private String tasksStatus;

    /** 任务id */
    private String tasksId;

    /** 农机类型 */
    @Excel(name = "农机类型")
    private String machineryType;

    /** 农机长度 */
    @Excel(name = "农机长度")
    private BigDecimal machineryLength;

    public BigDecimal getMachineryWidth() {
        return machineryWidth;
    }

    public void setMachineryWidth(BigDecimal machineryWidth) {
        this.machineryWidth = machineryWidth;
    }

    public String getMachineryTypeId() {
        return machineryTypeId;
    }

    public void setMachineryTypeId(String machineryTypeId) {
        this.machineryTypeId = machineryTypeId;
    }

    public String getMachineryNo() {
        return machineryNo;
    }

    public void setMachineryNo(String machineryNo) {
        this.machineryNo = machineryNo;
    }

    public String getMachineryBrand() {
        return machineryBrand;
    }

    public void setMachineryBrand(String machineryBrand) {
        this.machineryBrand = machineryBrand;
    }

    public String getMachineryHp() {
        return machineryHp;
    }

    public void setMachineryHp(String machineryHp) {
        this.machineryHp = machineryHp;
    }

    public String getUserMachineryId() {
        return userMachineryId;
    }

    public void setUserMachineryId(String userMachineryId) {
        this.userMachineryId = userMachineryId;
    }

    /** 农机宽度 */
    @Excel(name = "农机宽度")
    private BigDecimal machineryWidth;

    /** 农机类型id */
    @Excel(name = "农机类型id")
    private String machineryTypeId;

    /** 农机编号 */
    @Excel(name = "农机编号")
    private String machineryNo;

    /** 农机品牌 */
    @Excel(name = "农机品牌")
    private String machineryBrand;

    /** 农机马力 */
    @Excel(name = "农机马力")
    private String machineryHp;

    /** 所属农机主 */
    @Excel(name = "所属农机主")
    private String userMachineryId;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setHostNum(String hostNum) 
    {
        this.hostNum = hostNum;
    }

    public String getHostNum() 
    {
        return hostNum;
    }
    public void setTasksStatus(String tasksStatus) 
    {
        this.tasksStatus = tasksStatus;
    }

    public String getTasksStatus() 
    {
        return tasksStatus;
    }
    public void setTasksId(String tasksId) 
    {
        this.tasksId = tasksId;
    }

    public String getTasksId() 
    {
        return tasksId;
    }
    public void setMachineryType(String machineryType) 
    {
        this.machineryType = machineryType;
    }

    public String getMachineryType() 
    {
        return machineryType;
    }
    public void setMachineryLength(BigDecimal machineryLength) 
    {
        this.machineryLength = machineryLength;
    }

    public BigDecimal getMachineryLength() 
    {
        return machineryLength;
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
            .append("name", getName())
            .append("hostNum", getHostNum())
            .append("tasksStatus", getTasksStatus())
            .append("tasksId", getTasksId())
            .append("machineryType", getMachineryType())
            .append("machineryLength", getMachineryLength())
            .toString();
    }
}
