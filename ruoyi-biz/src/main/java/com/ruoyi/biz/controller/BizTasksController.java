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
import com.ruoyi.biz.domain.BizTasks;
import com.ruoyi.biz.service.IBizTasksService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 业务任务Controller
 * 
 * @author 罗晨熙
 * @date 2024-05-24
 */
@RestController
@RequestMapping("/biz/tasks")
public class BizTasksController extends BaseController
{
    @Autowired
    private IBizTasksService bizTasksService;

    /**
     * 查询业务任务列表
     */
    @PreAuthorize("@ss.hasPermi('biz:tasks:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizTasks bizTasks)
    {
        startPage();
        List<BizTasks> list = bizTasksService.selectBizTasksList(bizTasks);
        return getDataTable(list);
    }

    /**
     * 导出业务任务列表
     */
    @PreAuthorize("@ss.hasPermi('biz:tasks:export')")
    @Log(title = "业务任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizTasks bizTasks)
    {
        List<BizTasks> list = bizTasksService.selectBizTasksList(bizTasks);
        ExcelUtil<BizTasks> util = new ExcelUtil<BizTasks>(BizTasks.class);
        util.exportExcel(response, list, "业务任务数据");
    }

    /**
     * 获取业务任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('biz:tasks:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(bizTasksService.selectBizTasksById(id));
    }

    /**
     * 新增业务任务
     */
    @PreAuthorize("@ss.hasPermi('biz:tasks:add')")
    @Log(title = "业务任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizTasks bizTasks)
    {

        bizTasks.setCreateBy(getUsername());
//        bizTasks.setUserId(getUserId().toString());
//        bizTasks.setDeptId(getDeptId().toString());
        return toAjax(bizTasksService.insertBizTasks(bizTasks));
    }

    /**
     * 修改业务任务
     */
    @PreAuthorize("@ss.hasPermi('biz:tasks:edit')")
    @Log(title = "业务任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizTasks bizTasks)
    {
        return toAjax(bizTasksService.updateBizTasks(bizTasks));
    }

    /**
     * 删除业务任务
     */
    @PreAuthorize("@ss.hasPermi('biz:tasks:remove')")
    @Log(title = "业务任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(bizTasksService.deleteBizTasksByIds(ids));
    }
}
