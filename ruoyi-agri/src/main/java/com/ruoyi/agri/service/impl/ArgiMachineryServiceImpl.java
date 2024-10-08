package com.ruoyi.agri.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.agri.mapper.ArgiMachineryMapper;
import com.ruoyi.agri.domain.ArgiMachinery;
import com.ruoyi.agri.service.IArgiMachineryService;

/**
 * 农机管理Service业务层处理
 * 
 * @author 罗晨熙
 * @date 2024-05-20
 */
@Service
public class ArgiMachineryServiceImpl implements IArgiMachineryService 
{
    @Autowired
    private ArgiMachineryMapper argiMachineryMapper;

    /**
     * 查询农机管理
     * 
     * @param id 农机管理主键
     * @return 农机管理
     */
    @Override
    public ArgiMachinery selectArgiMachineryById(String id)
    {
        return argiMachineryMapper.selectArgiMachineryById(id);
    }

    /**
     * 查询农机管理列表
     * 
     * @param argiMachinery 农机管理
     * @return 农机管理
     */
    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
    public List<ArgiMachinery> selectArgiMachineryList(ArgiMachinery argiMachinery)
    {
        return argiMachineryMapper.selectArgiMachineryList(argiMachinery);
    }

    /**
     * 新增农机管理
     * 
     * @param argiMachinery 农机管理
     * @return 结果
     */
    @Override
    public int insertArgiMachinery(ArgiMachinery argiMachinery)
    {
        argiMachinery.setCreateTime(DateUtils.getNowDate());
        argiMachinery.setId(IdUtils.randomUUID());
        argiMachinery.setDeviceBindingStatus("0");
        argiMachinery.setWorkingStatus("0");
        return argiMachineryMapper.insertArgiMachinery(argiMachinery);
    }

    /**
     * 修改农机管理
     * 
     * @param argiMachinery 农机管理
     * @return 结果
     */
    @Override
    public int updateArgiMachinery(ArgiMachinery argiMachinery)
    {
        argiMachinery.setUpdateTime(DateUtils.getNowDate());
        return argiMachineryMapper.updateArgiMachinery(argiMachinery);
    }

    /**
     * 批量删除农机管理
     * 
     * @param ids 需要删除的农机管理主键
     * @return 结果
     */
    @Override
    public int deleteArgiMachineryByIds(String[] ids)
    {
        return argiMachineryMapper.deleteArgiMachineryByIds(ids);
    }

    /**
     * 删除农机管理信息
     * 
     * @param id 农机管理主键
     * @return 结果
     */
    @Override
    public int deleteArgiMachineryById(String id)
    {
        return argiMachineryMapper.deleteArgiMachineryById(id);
    }
}
