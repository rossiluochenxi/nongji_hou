package com.ruoyi.biz.service;

import java.util.List;
import com.ruoyi.biz.domain.BizTasks;

/**
 * 业务任务Service接口
 * 
 * @author 罗晨熙
 * @date 2024-05-24
 */
public interface IBizTasksService 
{
    /**
     * 查询业务任务
     * 
     * @param id 业务任务主键
     * @return 业务任务
     */
    public BizTasks selectBizTasksById(String id);

    /**
     * 查询业务任务列表
     * 
     * @param bizTasks 业务任务
     * @return 业务任务集合
     */
    public List<BizTasks> selectBizTasksList(BizTasks bizTasks);

    /**
     * 新增业务任务
     * 
     * @param bizTasks 业务任务
     * @return 结果
     */
    public int insertBizTasks(BizTasks bizTasks);

    /**
     * 修改业务任务
     * 
     * @param bizTasks 业务任务
     * @return 结果
     */
    public int updateBizTasks(BizTasks bizTasks);

    /**
     * 批量删除业务任务
     * 
     * @param ids 需要删除的业务任务主键集合
     * @return 结果
     */
    public int deleteBizTasksByIds(String[] ids);

    /**
     * 删除业务任务信息
     * 
     * @param id 业务任务主键
     * @return 结果
     */
    public int deleteBizTasksById(String id);
}
