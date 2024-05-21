package com.ruoyi.agri.service;

import java.util.List;
import com.ruoyi.agri.domain.ArgiMachinery;

/**
 * 农机管理Service接口
 * 
 * @author 罗晨熙
 * @date 2024-05-20
 */
public interface IArgiMachineryService 
{
    /**
     * 查询农机管理
     * 
     * @param id 农机管理主键
     * @return 农机管理
     */
    public ArgiMachinery selectArgiMachineryById(String id);

    /**
     * 查询农机管理列表
     * 
     * @param argiMachinery 农机管理
     * @return 农机管理集合
     */
    public List<ArgiMachinery> selectArgiMachineryList(ArgiMachinery argiMachinery);

    /**
     * 新增农机管理
     * 
     * @param argiMachinery 农机管理
     * @return 结果
     */
    public int insertArgiMachinery(ArgiMachinery argiMachinery);

    /**
     * 修改农机管理
     * 
     * @param argiMachinery 农机管理
     * @return 结果
     */
    public int updateArgiMachinery(ArgiMachinery argiMachinery);

    /**
     * 批量删除农机管理
     * 
     * @param ids 需要删除的农机管理主键集合
     * @return 结果
     */
    public int deleteArgiMachineryByIds(String[] ids);

    /**
     * 删除农机管理信息
     * 
     * @param id 农机管理主键
     * @return 结果
     */
    public int deleteArgiMachineryById(String id);
}
