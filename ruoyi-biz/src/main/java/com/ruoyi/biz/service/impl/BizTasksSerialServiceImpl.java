package com.ruoyi.biz.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.biz.mapper.BizTasksSerialMapper;
import com.ruoyi.biz.domain.BizTasksSerial;
import com.ruoyi.biz.service.IBizTasksSerialService;

/**
 * 任务流水详情Service业务层处理
 * 
 * @author 罗晨熙
 * @date 2024-05-26
 */
@Service
public class BizTasksSerialServiceImpl implements IBizTasksSerialService 
{
    @Autowired
    private BizTasksSerialMapper bizTasksSerialMapper;

    /**
     * 查询任务流水详情
     * 
     * @param id 任务流水详情主键
     * @return 任务流水详情
     */
    @Override
    public BizTasksSerial selectBizTasksSerialById(String id)
    {
        return bizTasksSerialMapper.selectBizTasksSerialById(id);
    }

    /**
     * 查询任务流水详情列表
     * 
     * @param bizTasksSerial 任务流水详情
     * @return 任务流水详情
     */
    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
    public List<BizTasksSerial> selectBizTasksSerialList(BizTasksSerial bizTasksSerial)
    {
        return bizTasksSerialMapper.selectBizTasksSerialList(bizTasksSerial);
    }

    /**
     * 新增任务流水详情
     * 
     * @param bizTasksSerial 任务流水详情
     * @return 结果
     */
    @Override
    public int insertBizTasksSerial(BizTasksSerial bizTasksSerial)
    {
        bizTasksSerial.setCreateTime(DateUtils.getNowDate());
        bizTasksSerial.setId(IdUtils.randomUUID());
        return bizTasksSerialMapper.insertBizTasksSerial(bizTasksSerial);
    }

    /**
     * 修改任务流水详情
     * 
     * @param bizTasksSerial 任务流水详情
     * @return 结果
     */
    @Override
    public int updateBizTasksSerial(BizTasksSerial bizTasksSerial)
    {
        bizTasksSerial.setUpdateTime(DateUtils.getNowDate());
        return bizTasksSerialMapper.updateBizTasksSerial(bizTasksSerial);
    }

    /**
     * 批量删除任务流水详情
     * 
     * @param ids 需要删除的任务流水详情主键
     * @return 结果
     */
    @Override
    public int deleteBizTasksSerialByIds(String[] ids)
    {
        return bizTasksSerialMapper.deleteBizTasksSerialByIds(ids);
    }

    /**
     * 删除任务流水详情信息
     * 
     * @param id 任务流水详情主键
     * @return 结果
     */
    @Override
    public int deleteBizTasksSerialById(String id)
    {
        return bizTasksSerialMapper.deleteBizTasksSerialById(id);
    }
}
