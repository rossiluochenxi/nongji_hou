package com.ruoyi.dm.mapper;

import java.util.List;

import com.ruoyi.dm.domain.DmDayData;
import com.ruoyi.dm.domain.DmRtdata;

/**
 * 冻结数据Mapper接口
 * 
 * @author 罗晨熙
 * @date 2024-03-16
 */
public interface DmRtdataMapper 
{
    /**
     * 查询冻结数据
     * 
     * @param id 冻结数据主键
     * @return 冻结数据
     */
    public DmRtdata selectDmRtdataById(String id);

    /**
     * 查询冻结数据列表
     * 
     * @param dmRtdata 冻结数据
     * @return 冻结数据集合
     */
    public List<DmRtdata> selectDmRtdataList(DmRtdata dmRtdata);

    /**
     * 新增冻结数据
     * 
     * @param dmRtdata 冻结数据
     * @return 结果
     */
    public int insertDmRtdata(DmRtdata dmRtdata);

    /**
     * 修改冻结数据
     * 
     * @param dmRtdata 冻结数据
     * @return 结果
     */
    public int updateDmRtdata(DmRtdata dmRtdata);

    /**
     * 删除冻结数据
     * 
     * @param id 冻结数据主键
     * @return 结果
     */
    public int deleteDmRtdataById(String id);

    /**
     * 批量删除冻结数据
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDmRtdataByIds(String[] ids);

    /**
     * 添加或则修改实时冻结数据
     * @param dmRtdata
     * @return
     */
    public int insertOrUpdateDmRtdata(DmRtdata dmRtdata);
}
