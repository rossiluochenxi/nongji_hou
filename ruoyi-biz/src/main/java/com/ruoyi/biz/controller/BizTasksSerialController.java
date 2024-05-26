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
import com.ruoyi.biz.domain.BizTasksSerial;
import com.ruoyi.biz.service.IBizTasksSerialService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 任务流水详情Controller
 * 
 * @author 罗晨熙
 * @date 2024-05-26
 */
@RestController
@RequestMapping("/biz/tasksSerial")
public class BizTasksSerialController extends BaseController
{
    @Autowired
    private IBizTasksSerialService bizTasksSerialService;

    /**
     * 查询任务流水详情列表
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksSerial:list')")
    @GetMapping("/list")
    public TableDataInfo list(BizTasksSerial bizTasksSerial)
    {
        startPage();
        List<BizTasksSerial> list = bizTasksSerialService.selectBizTasksSerialList(bizTasksSerial);
        return getDataTable(list);
    }

    /**
     * 导出任务流水详情列表
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksSerial:export')")
    @Log(title = "任务流水详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BizTasksSerial bizTasksSerial)
    {
        List<BizTasksSerial> list = bizTasksSerialService.selectBizTasksSerialList(bizTasksSerial);
        ExcelUtil<BizTasksSerial> util = new ExcelUtil<BizTasksSerial>(BizTasksSerial.class);
        util.exportExcel(response, list, "任务流水详情数据");
    }

    /**
     * 获取任务流水详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksSerial:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(bizTasksSerialService.selectBizTasksSerialById(id));
    }

    /**
     * 新增任务流水详情
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksSerial:add')")
    @Log(title = "任务流水详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BizTasksSerial bizTasksSerial)
    {
        bizTasksSerial.setCreateBy(getUsername());
        bizTasksSerial.setUserId(getUserId().toString());
        bizTasksSerial.setDeptId(getDeptId().toString());
        return toAjax(bizTasksSerialService.insertBizTasksSerial(bizTasksSerial));
    }

    /**
     * 修改任务流水详情
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksSerial:edit')")
    @Log(title = "任务流水详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BizTasksSerial bizTasksSerial)
    {
        return toAjax(bizTasksSerialService.updateBizTasksSerial(bizTasksSerial));
    }

    /**
     * 删除任务流水详情
     */
    @PreAuthorize("@ss.hasPermi('biz:tasksSerial:remove')")
    @Log(title = "任务流水详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(bizTasksSerialService.deleteBizTasksSerialByIds(ids));
    }
}
