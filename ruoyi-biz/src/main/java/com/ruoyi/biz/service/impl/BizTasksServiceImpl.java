package com.ruoyi.biz.service.impl;

import java.util.List;

import com.ruoyi.biz.domain.BizTasksAssignments;
import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.biz.mapper.BizTasksMapper;
import com.ruoyi.biz.domain.BizTasks;
import com.ruoyi.biz.service.IBizTasksService;

/**
 * 业务任务Service业务层处理
 * 
 * @author 罗晨熙
 * @date 2024-05-24
 */
@Service
public class BizTasksServiceImpl implements IBizTasksService 
{
    @Autowired
    private BizTasksMapper bizTasksMapper;
    @Autowired
    private BizTasksAssignmentsServiceImpl bizTasksAssignmentsServiceImpl;

    /**
     * 查询业务任务
     * 
     * @param id 业务任务主键
     * @return 业务任务
     */
    @Override
    public BizTasks selectBizTasksById(String id)
    {
        return bizTasksMapper.selectBizTasksById(id);
    }

    /**
     * 查询业务任务列表
     * 
     * @param bizTasks 业务任务
     * @return 业务任务
     */
    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
    public List<BizTasks> selectBizTasksList(BizTasks bizTasks)
    {
        return bizTasksMapper.selectBizTasksList(bizTasks);
    }

    /**
     * 新增业务任务
     * 
     * @param bizTasks 业务任务
     * @return 结果
     */
    @Override
    public int insertBizTasks(BizTasks bizTasks)
    {
        bizTasks.setId(IdUtils.randomUUID());
        BizTasksAssignments bizTasksAssignments = new BizTasksAssignments();
        BeanUtils.copyProperties(bizTasks,bizTasksAssignments);
        bizTasksAssignments.setBizTasksId(bizTasks.getId());
        bizTasksAssignments.setBizTasksName(bizTasks.getBizName());
        bizTasksAssignmentsServiceImpl.insertBizTasksAssignments(bizTasksAssignments);
        bizTasks.setCreateTime(DateUtils.getNowDate());
         return bizTasksMapper.insertBizTasks(bizTasks);
    }


    /**
     * 修改业务任务
     * 
     * @param bizTasks 业务任务
     * @return 结果
     */
    @Override
    public int updateBizTasks(BizTasks bizTasks)
    {
        bizTasks.setUpdateTime(DateUtils.getNowDate());
        return bizTasksMapper.updateBizTasks(bizTasks);
    }

    /**
     * 批量删除业务任务
     * 
     * @param ids 需要删除的业务任务主键
     * @return 结果
     */
    @Override
    public int deleteBizTasksByIds(String[] ids)
    {
        return bizTasksMapper.deleteBizTasksByIds(ids);
    }

    /**
     * 删除业务任务信息
     * 
     * @param id 业务任务主键
     * @return 结果
     */
    @Override
    public int deleteBizTasksById(String id)
    {
        return bizTasksMapper.deleteBizTasksById(id);
    }
    /**
     * 批量撤回业务任务
     *
     * @param ids 需要撤回的业务任务主键
     * @return 结果
     */
    @Override
    public int withdrawBizTasksByIds(String ids) {

      return  bizTasksAssignmentsServiceImpl.deleteBizTasksAssignmentsTasksQueryById(ids);


    }

}
