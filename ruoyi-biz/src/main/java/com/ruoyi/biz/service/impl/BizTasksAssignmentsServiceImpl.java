package com.ruoyi.biz.service.impl;

import java.util.List;

import com.ruoyi.biz.domain.BizTasks;
import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.biz.mapper.BizTasksAssignmentsMapper;
import com.ruoyi.biz.domain.BizTasksAssignments;
import com.ruoyi.biz.service.IBizTasksAssignmentsService;

/**
 * 我的任务Service业务层处理
 * 
 * @author 罗晨熙
 * @date 2024-06-21
 */
@Service
public class BizTasksAssignmentsServiceImpl implements IBizTasksAssignmentsService 
{
    @Autowired
    private BizTasksAssignmentsMapper bizTasksAssignmentsMapper;

    @Autowired
    private BizTasksServiceImpl bizTasksServiceImpl;
    /**
     * 查询我的任务
     * 
     * @param id 我的任务主键
     * @return 我的任务
     */
    @Override
    public BizTasksAssignments selectBizTasksAssignmentsById(String id)
    {
        return bizTasksAssignmentsMapper.selectBizTasksAssignmentsById(id);
    }


    /**
     * 查询我的任务列表
     * 
     * @param bizTasksAssignments 我的任务
     * @return 我的任务
     */
    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
    public List<BizTasksAssignments> selectBizTasksAssignmentsList(BizTasksAssignments bizTasksAssignments)
    {
        return bizTasksAssignmentsMapper.selectBizTasksAssignmentsList(bizTasksAssignments);
    }

    /**
     * 新增我的任务
     * 
     * @param bizTasksAssignments 我的任务
     * @return 结果
     */
    @Override
    public int insertBizTasksAssignments(BizTasksAssignments bizTasksAssignments)
    {
        bizTasksAssignments.setId(IdUtils.randomUUID());
        bizTasksAssignments.setCreateTime(DateUtils.getNowDate());
        return bizTasksAssignmentsMapper.insertBizTasksAssignments(bizTasksAssignments);
    }

    /**
     * 修改我的任务
     * 
     * @param bizTasksAssignments 我的任务
     * @return 结果
     */
    @Override
    public int updateBizTasksAssignments(BizTasksAssignments bizTasksAssignments)
    {
        bizTasksAssignments.setUpdateTime(DateUtils.getNowDate());
        return bizTasksAssignmentsMapper.updateBizTasksAssignments(bizTasksAssignments);
    }

    @Override
    public int UpdateTasksDataService(BizTasksAssignments bizTasksAssignments) {

        BizTasks bizTasks = new BizTasks();
        bizTasks.setId( bizTasksAssignments.getBizTasksId());
        bizTasks.setStatus( bizTasksAssignments.getTasksStatus());

        bizTasksServiceImpl.updateBizTasks(bizTasks);
        bizTasksAssignments.setUpdateTime(DateUtils.getNowDate());
        return bizTasksAssignmentsMapper.updateBizTasksAssignments(bizTasksAssignments);
    }


    /**
     * 批量删除我的任务
     * 
     * @param ids 需要删除的我的任务主键
     * @return 结果
     */
    @Override
    public int deleteBizTasksAssignmentsByIds(String[] ids)
    {
        return bizTasksAssignmentsMapper.deleteBizTasksAssignmentsByIds(ids);
    }

    /**
     * 删除我的任务信息
     * 
     * @param id 我的任务主键
     * @return 结果
     */
    @Override
    public int deleteBizTasksAssignmentsById(String id)
    {
        return bizTasksAssignmentsMapper.deleteBizTasksAssignmentsById(id);
    }


    /**
     * 任务管理id查询
     *
     * @param id 我的任务主键
     * @return 我的任务
     */
    @Override
    public int deleteBizTasksAssignmentsTasksQueryById(String id)
    {
        return bizTasksAssignmentsMapper.deleteBizTasksAssignmentsBytasksId(id);
    }

}
