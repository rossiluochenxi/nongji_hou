package com.ruoyi.agri.mapper;

import java.util.List;
import com.ruoyi.agri.domain.ArgiDevice;

/**
 * 设备管理Mapper接口
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
public interface ArgiDeviceMapper 
{
    /**
     * 查询设备管理
     * 
     * @param id 设备管理主键
     * @return 设备管理
     */
    public ArgiDevice selectArgiDeviceById(String id);

    /**
     * 查询设备管理列表
     * 
     * @param argiDevice 设备管理
     * @return 设备管理集合
     */
    public List<ArgiDevice> selectArgiDeviceList(ArgiDevice argiDevice);

    /**
     * 新增设备管理
     * 
     * @param argiDevice 设备管理
     * @return 结果
     */
    public int insertArgiDevice(ArgiDevice argiDevice);

    /**
     * 修改设备管理
     * 
     * @param argiDevice 设备管理
     * @return 结果
     */
    public int updateArgiDevice(ArgiDevice argiDevice);

    /**
     * 删除设备管理
     * 
     * @param id 设备管理主键
     * @return 结果
     */
    public int deleteArgiDeviceById(String id);

    /**
     * 批量删除设备管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArgiDeviceByIds(String[] ids);
}
