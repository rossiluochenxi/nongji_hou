package com.ruoyi.biz.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.biz.domain.BizTasksAssignments;
import com.ruoyi.biz.service.IBizTasksAssignmentsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 我的任务Controller
 * 
 * @author 罗晨熙
 * @date 2024-06-21
 */
@RestController
@RequestMapping("/biz/tasksAssignments")
public class BizTasksAssignmentsController extends BaseController
{
    @Autowired
    private IBizTasksAssignmentsService bizTasksAssignmentsService;

    /**
     * 查询我的任务列表
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksAssignments:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizTasksAssignments bizTasksAssignments)
    {
        startPage();
        List<BizTasksAssignments> list = bizTasksAssignmentsService.selectBizTasksAssignmentsList(bizTasksAssignments);
        return getDataTable(list);
    }

    /**
     * 导出我的任务列表
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksAssignments:export')")
    @Log(title = "我的任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizTasksAssignments bizTasksAssignments)
    {
        List<BizTasksAssignments> list = bizTasksAssignmentsService.selectBizTasksAssignmentsList(bizTasksAssignments);
        ExcelUtil<BizTasksAssignments> util = new ExcelUtil<BizTasksAssignments>(BizTasksAssignments.class);
        util.exportExcel(response, list, "我的任务数据");
    }

    /**
     * 获取我的任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksAssignments:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(bizTasksAssignmentsService.selectBizTasksAssignmentsById(id));
    }

    /**
     * 新增我的任务
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksAssignments:add')")
    @Log(title = "我的任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizTasksAssignments bizTasksAssignments)
    {
        return toAjax(bizTasksAssignmentsService.insertBizTasksAssignments(bizTasksAssignments));
    }

    /**
     * 修改我的任务
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksAssignments:edit')")
    @Log(title = "我的任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizTasksAssignments bizTasksAssignments)
    {
        return toAjax(bizTasksAssignmentsService.updateBizTasksAssignments(bizTasksAssignments));
    }

    /**
     * 修改状态联动任务管理
     * @param bizTasksAssignments
     * @return
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksAssignments:edit')")
    @Log(title = "我的任务", businessType = BusinessType.UPDATE)
    @PutMapping("/updateTasksData")
    public AjaxResult updateTasksData(@RequestBody BizTasksAssignments bizTasksAssignments)
    {
        return toAjax(bizTasksAssignmentsService.UpdateTasksDataService(bizTasksAssignments));
    }




    /**
     * 删除我的任务
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksAssignments:remove')")
    @Log(title = "我的任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(bizTasksAssignmentsService.deleteBizTasksAssignmentsByIds(ids));
    }
}
