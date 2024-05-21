package com.ruoyi.agri.service;

import java.util.List;
import com.ruoyi.agri.domain.AgriType;

/**
 * 面积类型管理Service接口
 * 
 * @author 罗晨熙
 * @date 2024-05-21
 */
public interface IAgriTypeService 
{
    /**
     * 查询面积类型管理
     * 
     * @param id 面积类型管理主键
     * @return 面积类型管理
     */
    public AgriType selectAgriTypeById(String id);

    /**
     * 查询面积类型管理列表
     * 
     * @param agriType 面积类型管理
     * @return 面积类型管理集合
     */
    public List<AgriType> selectAgriTypeList(AgriType agriType);

    /**
     * 新增面积类型管理
     * 
     * @param agriType 面积类型管理
     * @return 结果
     */
    public int insertAgriType(AgriType agriType);

    /**
     * 修改面积类型管理
     * 
     * @param agriType 面积类型管理
     * @return 结果
     */
    public int updateAgriType(AgriType agriType);

    /**
     * 批量删除面积类型管理
     * 
     * @param ids 需要删除的面积类型管理主键集合
     * @return 结果
     */
    public int deleteAgriTypeByIds(String[] ids);

    /**
     * 删除面积类型管理信息
     * 
     * @param id 面积类型管理主键
     * @return 结果
     */
    public int deleteAgriTypeById(String id);
}
