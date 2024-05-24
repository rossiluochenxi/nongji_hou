package com.ruoyi.map.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 任务耕地信息对象 map_fields
 * 
 * @author 孙旭江
 * @date 2024-05-24
 */
public class MapFields extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 用户id */
    private String userId;

    /** 部门id */
    private String deptId;

    /** 面积名字 */
    @Excel(name = "面积名字")
    private String fieldsName;

    /** 耕地类型id */
    private String agriTypeId;

    /** 耕地类别 */
    @Excel(name = "耕地类别")
    private String agriTypeCategory;

    /** 耕地类型 */
    @Excel(name = "耕地类型")
    private String agriTypeType;

    /** 面积 */
    @Excel(name = "面积")
    private BigDecimal fieldsArea;

    /** 地图面积信息 */
    @Excel(name = "地图面积信息")
    private String mapInfo;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

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
    public void setFieldsName(String fieldsName) 
    {
        this.fieldsName = fieldsName;
    }

    public String getFieldsName() 
    {
        return fieldsName;
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
    public void setFieldsArea(BigDecimal fieldsArea) 
    {
        this.fieldsArea = fieldsArea;
    }

    public BigDecimal getFieldsArea() 
    {
        return fieldsArea;
    }
    public void setMapInfo(String mapInfo) 
    {
        this.mapInfo = mapInfo;
    }

    public String getMapInfo() 
    {
        return mapInfo;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("fieldsName", getFieldsName())
            .append("agriTypeId", getAgriTypeId())
            .append("agriTypeCategory", getAgriTypeCategory())
            .append("agriTypeType", getAgriTypeType())
            .append("fieldsArea", getFieldsArea())
            .append("mapInfo", getMapInfo())
            .append("status", getStatus())
            .toString();
    }
}
