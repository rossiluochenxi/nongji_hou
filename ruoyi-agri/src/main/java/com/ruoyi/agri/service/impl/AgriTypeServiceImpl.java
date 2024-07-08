package com.ruoyi.agri.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.agri.mapper.AgriTypeMapper;
import com.ruoyi.agri.domain.AgriType;
import com.ruoyi.agri.service.IAgriTypeService;

/**
 * 面积类型管理Service业务层处理
 * 
 * @author 罗晨熙
 * @date 2024-05-21
 */
@Service
public class AgriTypeServiceImpl implements IAgriTypeService 
{
    @Autowired
    private AgriTypeMapper agriTypeMapper;

    /**
     * 查询面积类型管理
     * 
     * @param id 面积类型管理主键
     * @return 面积类型管理
     */
    @Override
    public AgriType selectAgriTypeById(String id)
    {
        return agriTypeMapper.selectAgriTypeById(id);
    }

    /**
     * 查询面积类型管理列表
     * 
     * @param agriType 面积类型管理
     * @return 面积类型管理
     */
    @Override
//    @DataScope(deptAlias = "t" ,userAlias = "t")
     public List<AgriType> selectAgriTypeList(AgriType agriType)
    {
        return agriTypeMapper.selectAgriTypeList(agriType);
    }

    /**
     * 新增面积类型管理
     * 
     * @param agriType 面积类型管理
     * @return 结果
     */
    @Override
    public int insertAgriType(AgriType agriType)
    {
        agriType.setCreateTime(DateUtils.getNowDate());
        agriType.setId(IdUtils.randomUUID());
        return agriTypeMapper.insertAgriType(agriType);
    }

    /**
     * 修改面积类型管理
     * 
     * @param agriType 面积类型管理
     * @return 结果
     */
    @Override
    public int updateAgriType(AgriType agriType)
    {
        agriType.setUpdateTime(DateUtils.getNowDate());
        return agriTypeMapper.updateAgriType(agriType);
    }

    /**
     * 批量删除面积类型管理
     * 
     * @param ids 需要删除的面积类型管理主键
     * @return 结果
     */
    @Override
    public int deleteAgriTypeByIds(String[] ids)
    {
        return agriTypeMapper.deleteAgriTypeByIds(ids);
    }

    /**
     * 删除面积类型管理信息
     * 
     * @param id 面积类型管理主键
     * @return 结果
     */
    @Override
    public int deleteAgriTypeById(String id)
    {
        return agriTypeMapper.deleteAgriTypeById(id);
    }
}
