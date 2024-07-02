package com.ruoyi.map.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.map.mapper.MapFieldsMapper;
import com.ruoyi.map.domain.MapFields;
import com.ruoyi.map.service.IMapFieldsService;

/**
 * 任务耕地信息Service业务层处理
 * 
 * @author 孙旭江
 * @date 2024-05-24
 */
@Service
public class MapFieldsServiceImpl implements IMapFieldsService {
    @Autowired
    private MapFieldsMapper mapFieldsMapper;

    /**
     * 查询任务耕地信息
     *
     * @param id 任务耕地信息主键
     * @return 任务耕地信息
     */
    @Override
    public MapFields selectMapFieldsById(String id) {
        return mapFieldsMapper.selectMapFieldsById(id);
    }

    /**
     * 查询任务耕地信息列表
     *
     * @param mapFields 任务耕地信息
     * @return 任务耕地信息
     */
    @Override
    @DataScope(deptAlias = "t", userAlias = "t")
    public List<MapFields> selectMapFieldsList(MapFields mapFields) {
        return mapFieldsMapper.selectMapFieldsList(mapFields);
    }

    /**
     * 新增任务耕地信息
     *
     * @param mapFields 任务耕地信息
     * @return 结果
     */
    @Override
    public int insertMapFields(MapFields mapFields) {
        mapFields.setCreateTime(DateUtils.getNowDate());
        mapFields.setId(IdUtils.randomUUID());
        return mapFieldsMapper.insertMapFields(mapFields);
    }

    /**
     * 修改任务耕地信息
     *
     * @param mapFields 任务耕地信息
     * @return 结果
     */
    @Override
    public int updateMapFields(MapFields mapFields) {
        mapFields.setUpdateTime(DateUtils.getNowDate());
        return mapFieldsMapper.updateMapFields(mapFields);
    }

    /**
     * 批量删除任务耕地信息
     *
     * @param ids 需要删除的任务耕地信息主键
     * @return 结果
     */
    @Override
    public int deleteMapFieldsByIds(String[] ids) {
        return mapFieldsMapper.deleteMapFieldsByIds(ids);
    }

    /**
     * 删除任务耕地信息信息
     *
     * @param id 任务耕地信息主键
     * @return 结果
     */
    @Override
    public int deleteMapFieldsById(String id) {
        return mapFieldsMapper.deleteMapFieldsById(id);
    }


    /**
     * 新增电子围栏信息
     *
     * @param mapFields 电子围栏信息
     * @return 操作结果
     */
    @Override
    public int insertFence(MapFields mapFields) {
       mapFields.setCreateTime(DateUtils.getNowDate());
       mapFields.setId(IdUtils.randomUUID());
      return mapFieldsMapper.insertFence(mapFields);

    }
}
