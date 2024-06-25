package com.ruoyi.agri.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.agri.mapper.ArgiDeviceTypeMapper;
import com.ruoyi.agri.domain.ArgiDeviceType;
import com.ruoyi.agri.service.IArgiDeviceTypeService;

/**
 * 设备类型Service业务层处理
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
@Service
public class ArgiDeviceTypeServiceImpl implements IArgiDeviceTypeService 
{
    @Autowired
    private ArgiDeviceTypeMapper argiDeviceTypeMapper;

    /**
     * 查询设备类型
     * 
     * @param id 设备类型主键
     * @return 设备类型
     */
    @Override
    public ArgiDeviceType selectArgiDeviceTypeById(String id)
    {
        return argiDeviceTypeMapper.selectArgiDeviceTypeById(id);
    }

    /**
     * 查询设备类型列表
     * 
     * @param argiDeviceType 设备类型
     * @return 设备类型
     */
    @Override
    public List<ArgiDeviceType> selectArgiDeviceTypeList(ArgiDeviceType argiDeviceType)
    {
        return argiDeviceTypeMapper.selectArgiDeviceTypeList(argiDeviceType);
    }

    /**
     * 新增设备类型
     * 
     * @param argiDeviceType 设备类型
     * @return 结果
     */
    @Override
    public int insertArgiDeviceType(ArgiDeviceType argiDeviceType)
    {
        argiDeviceType.setId(IdUtils.randomUUID());
        argiDeviceType.setCreateTime(DateUtils.getNowDate());
        return argiDeviceTypeMapper.insertArgiDeviceType(argiDeviceType);
    }

    /**
     * 修改设备类型
     * 
     * @param argiDeviceType 设备类型
     * @return 结果
     */
    @Override
    public int updateArgiDeviceType(ArgiDeviceType argiDeviceType)
    {
        argiDeviceType.setUpdateTime(DateUtils.getNowDate());
        return argiDeviceTypeMapper.updateArgiDeviceType(argiDeviceType);
    }

    /**
     * 批量删除设备类型
     * 
     * @param ids 需要删除的设备类型主键
     * @return 结果
     */
    @Override
    public int deleteArgiDeviceTypeByIds(String[] ids)
    {
        return argiDeviceTypeMapper.deleteArgiDeviceTypeByIds(ids);
    }

    /**
     * 删除设备类型信息
     * 
     * @param id 设备类型主键
     * @return 结果
     */
    @Override
    public int deleteArgiDeviceTypeById(String id)
    {
        return argiDeviceTypeMapper.deleteArgiDeviceTypeById(id);
    }
}
