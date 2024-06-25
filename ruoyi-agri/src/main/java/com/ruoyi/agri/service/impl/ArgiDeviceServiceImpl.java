package com.ruoyi.agri.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.agri.mapper.ArgiDeviceMapper;
import com.ruoyi.agri.domain.ArgiDevice;
import com.ruoyi.agri.service.IArgiDeviceService;

/**
 * 设备管理Service业务层处理
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
@Service
public class ArgiDeviceServiceImpl implements IArgiDeviceService 
{
    @Autowired
    private ArgiDeviceMapper argiDeviceMapper;

    /**
     * 查询设备管理
     * 
     * @param id 设备管理主键
     * @return 设备管理
     */
    @Override
    public ArgiDevice selectArgiDeviceById(String id)
    {
        return argiDeviceMapper.selectArgiDeviceById(id);
    }

    /**
     * 查询设备管理列表
     * 
     * @param argiDevice 设备管理
     * @return 设备管理
     */
    @Override
    public List<ArgiDevice> selectArgiDeviceList(ArgiDevice argiDevice)
    {
        return argiDeviceMapper.selectArgiDeviceList(argiDevice);
    }

    /**
     * 新增设备管理
     * 
     * @param argiDevice 设备管理
     * @return 结果
     */
    @Override
    public int insertArgiDevice(ArgiDevice argiDevice)
    {
        argiDevice.setCreateTime(DateUtils.getNowDate());
        argiDevice.setId(IdUtils.randomUUID());
        return argiDeviceMapper.insertArgiDevice(argiDevice);
    }

    /**
     * 修改设备管理
     * 
     * @param argiDevice 设备管理
     * @return 结果
     */
    @Override
    public int updateArgiDevice(ArgiDevice argiDevice)
    {
        argiDevice.setUpdateTime(DateUtils.getNowDate());
        return argiDeviceMapper.updateArgiDevice(argiDevice);
    }

    /**
     * 批量删除设备管理
     * 
     * @param ids 需要删除的设备管理主键
     * @return 结果
     */
    @Override
    public int deleteArgiDeviceByIds(String[] ids)
    {
        return argiDeviceMapper.deleteArgiDeviceByIds(ids);
    }

    /**
     * 删除设备管理信息
     * 
     * @param id 设备管理主键
     * @return 结果
     */
    @Override
    public int deleteArgiDeviceById(String id)
    {
        return argiDeviceMapper.deleteArgiDeviceById(id);
    }
}
