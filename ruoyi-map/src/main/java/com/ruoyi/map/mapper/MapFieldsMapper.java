package com.ruoyi.map.mapper;

import java.util.List;
import com.ruoyi.map.domain.MapFields;

/**
 * 任务耕地信息Mapper接口
 * 
 * @author 孙旭江
 * @date 2024-05-24
 */
public interface MapFieldsMapper 
{
    /**
     * 查询任务耕地信息
     * 
     * @param id 任务耕地信息主键
     * @return 任务耕地信息
     */
    public MapFields selectMapFieldsById(String id);

    /**
     * 查询任务耕地信息列表
     * 
     * @param mapFields 任务耕地信息
     * @return 任务耕地信息集合
     */
    public List<MapFields> selectMapFieldsList(MapFields mapFields);

    /**
     * 新增任务耕地信息
     * 
     * @param mapFields 任务耕地信息
     * @return 结果
     */
    public int insertMapFields(MapFields mapFields);

    /**
     * 修改任务耕地信息
     * 
     * @param mapFields 任务耕地信息
     * @return 结果
     */
    public int updateMapFields(MapFields mapFields);

    /**
     * 删除任务耕地信息
     * 
     * @param id 任务耕地信息主键
     * @return 结果
     */
    public int deleteMapFieldsById(String id);

    /**
     * 批量删除任务耕地信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMapFieldsByIds(String[] ids);


    /**
     * 新增任务耕地信息
     *
     * @param mapFields 任务耕地信息
     * @return 结果
     */
    public int insertFence(MapFields mapFields);
}
