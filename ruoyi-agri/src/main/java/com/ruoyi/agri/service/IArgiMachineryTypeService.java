package com.ruoyi.agri.service;

import java.util.List;
import com.ruoyi.agri.domain.ArgiMachineryType;

/**
 * 农机类型Service接口
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
public interface IArgiMachineryTypeService 
{
    /**
     * 查询农机类型
     * 
     * @param id 农机类型主键
     * @return 农机类型
     */
    public ArgiMachineryType selectArgiMachineryTypeById(String id);

    /**
     * 查询农机类型列表
     * 
     * @param argiMachineryType 农机类型
     * @return 农机类型集合
     */
    public List<ArgiMachineryType> selectArgiMachineryTypeList(ArgiMachineryType argiMachineryType);

    /**
     * 新增农机类型
     * 
     * @param argiMachineryType 农机类型
     * @return 结果
     */
    public int insertArgiMachineryType(ArgiMachineryType argiMachineryType);

    /**
     * 修改农机类型
     * 
     * @param argiMachineryType 农机类型
     * @return 结果
     */
    public int updateArgiMachineryType(ArgiMachineryType argiMachineryType);

    /**
     * 批量删除农机类型
     * 
     * @param ids 需要删除的农机类型主键集合
     * @return 结果
     */
    public int deleteArgiMachineryTypeByIds(String[] ids);

    /**
     * 删除农机类型信息
     * 
     * @param id 农机类型主键
     * @return 结果
     */
    public int deleteArgiMachineryTypeById(String id);
}
