package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizTasksAssignments;

/**
 * 我的任务Mapper接口
 * 
 * @author 罗晨熙
 * @date 2024-06-21
 */
public interface BizTasksAssignmentsMapper 
{
    /**
     * 查询我的任务
     * 
     * @param id 我的任务主键
     * @return 我的任务
     */
    public BizTasksAssignments selectBizTasksAssignmentsById(String id);


    public BizTasksAssignments selectBizTasksAssignmentsByIdbizTasksId(String id);

    /**
     * 查询我的任务列表
     * 
     * @param bizTasksAssignments 我的任务
     * @return 我的任务集合
     */
    public List<BizTasksAssignments> selectBizTasksAssignmentsList(BizTasksAssignments bizTasksAssignments);

    /**
     * 新增我的任务
     * 
     * @param bizTasksAssignments 我的任务
     * @return 结果
     */
    public int insertBizTasksAssignments(BizTasksAssignments bizTasksAssignments);

    /**
     * 修改我的任务
     * 
     * @param bizTasksAssignments 我的任务
     * @return 结果
     */
    public int updateBizTasksAssignments(BizTasksAssignments bizTasksAssignments);


    /**
     * 删除我的任务
     * 
     * @param id 我的任务主键
     * @return 结果
     */
    public int deleteBizTasksAssignmentsById(String id);



    /**
     * 删除我的任务
     *
     * @param id 我的任务主键
     * @return 结果
     */
    public int deleteBizTasksAssignmentsBytasksId(String id);

    /**
     * 批量删除我的任务
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizTasksAssignmentsByIds(String[] ids);
}
