package com.ruoyi.agri.mapper;

import java.util.List;
import com.ruoyi.agri.domain.ArgiDeviceType;

/**
 * 设备类型Mapper接口
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
public interface ArgiDeviceTypeMapper 
{
    /**
     * 查询设备类型
     * 
     * @param id 设备类型主键
     * @return 设备类型
     */
    public ArgiDeviceType selectArgiDeviceTypeById(String id);

    /**
     * 查询设备类型列表
     * 
     * @param argiDeviceType 设备类型
     * @return 设备类型集合
     */
    public List<ArgiDeviceType> selectArgiDeviceTypeList(ArgiDeviceType argiDeviceType);

    /**
     * 新增设备类型
     * 
     * @param argiDeviceType 设备类型
     * @return 结果
     */
    public int insertArgiDeviceType(ArgiDeviceType argiDeviceType);

    /**
     * 修改设备类型
     * 
     * @param argiDeviceType 设备类型
     * @return 结果
     */
    public int updateArgiDeviceType(ArgiDeviceType argiDeviceType);

    /**
     * 删除设备类型
     * 
     * @param id 设备类型主键
     * @return 结果
     */
    public int deleteArgiDeviceTypeById(String id);

    /**
     * 批量删除设备类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArgiDeviceTypeByIds(String[] ids);
}
