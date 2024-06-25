package com.ruoyi.agri.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.agri.mapper.ArgiMachineryTypeMapper;
import com.ruoyi.agri.domain.ArgiMachineryType;
import com.ruoyi.agri.service.IArgiMachineryTypeService;

/**
 * 农机类型Service业务层处理
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
@Service
public class ArgiMachineryTypeServiceImpl implements IArgiMachineryTypeService 
{
    @Autowired
    private ArgiMachineryTypeMapper argiMachineryTypeMapper;

    /**
     * 查询农机类型
     * 
     * @param id 农机类型主键
     * @return 农机类型
     */
    @Override
    public ArgiMachineryType selectArgiMachineryTypeById(String id)
    {
        return argiMachineryTypeMapper.selectArgiMachineryTypeById(id);
    }

    /**
     * 查询农机类型列表
     * 
     * @param argiMachineryType 农机类型
     * @return 农机类型
     */
    @Override
    public List<ArgiMachineryType> selectArgiMachineryTypeList(ArgiMachineryType argiMachineryType)
    {
        return argiMachineryTypeMapper.selectArgiMachineryTypeList(argiMachineryType);
    }

    /**
     * 新增农机类型
     * 
     * @param argiMachineryType 农机类型
     * @return 结果
     */
    @Override
    public int insertArgiMachineryType(ArgiMachineryType argiMachineryType)
    {
        argiMachineryType.setId(IdUtils.randomUUID());
        argiMachineryType.setCreateTime(DateUtils.getNowDate());
        return argiMachineryTypeMapper.insertArgiMachineryType(argiMachineryType);
    }

    /**
     * 修改农机类型
     * 
     * @param argiMachineryType 农机类型
     * @return 结果
     */
    @Override
    public int updateArgiMachineryType(ArgiMachineryType argiMachineryType)
    {
        argiMachineryType.setUpdateTime(DateUtils.getNowDate());
        return argiMachineryTypeMapper.updateArgiMachineryType(argiMachineryType);
    }

    /**
     * 批量删除农机类型
     * 
     * @param ids 需要删除的农机类型主键
     * @return 结果
     */
    @Override
    public int deleteArgiMachineryTypeByIds(String[] ids)
    {
        return argiMachineryTypeMapper.deleteArgiMachineryTypeByIds(ids);
    }

    /**
     * 删除农机类型信息
     * 
     * @param id 农机类型主键
     * @return 结果
     */
    @Override
    public int deleteArgiMachineryTypeById(String id)
    {
        return argiMachineryTypeMapper.deleteArgiMachineryTypeById(id);
    }
}
