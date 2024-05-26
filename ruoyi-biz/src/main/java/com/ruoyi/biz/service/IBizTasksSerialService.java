package com.ruoyi.biz.service;

import java.util.List;
import com.ruoyi.biz.domain.BizTasksSerial;

/**
 * 任务流水详情Service接口
 * 
 * @author 罗晨熙
 * @date 2024-05-26
 */
public interface IBizTasksSerialService 
{
    /**
     * 查询任务流水详情
     * 
     * @param id 任务流水详情主键
     * @return 任务流水详情
     */
    public BizTasksSerial selectBizTasksSerialById(String id);

    /**
     * 查询任务流水详情列表
     * 
     * @param bizTasksSerial 任务流水详情
     * @return 任务流水详情集合
     */
    public List<BizTasksSerial> selectBizTasksSerialList(BizTasksSerial bizTasksSerial);

    /**
     * 新增任务流水详情
     * 
     * @param bizTasksSerial 任务流水详情
     * @return 结果
     */
    public int insertBizTasksSerial(BizTasksSerial bizTasksSerial);

    /**
     * 修改任务流水详情
     * 
     * @param bizTasksSerial 任务流水详情
     * @return 结果
     */
    public int updateBizTasksSerial(BizTasksSerial bizTasksSerial);

    /**
     * 批量删除任务流水详情
     * 
     * @param ids 需要删除的任务流水详情主键集合
     * @return 结果
     */
    public int deleteBizTasksSerialByIds(String[] ids);

    /**
     * 删除任务流水详情信息
     * 
     * @param id 任务流水详情主键
     * @return 结果
     */
    public int deleteBizTasksSerialById(String id);
}
