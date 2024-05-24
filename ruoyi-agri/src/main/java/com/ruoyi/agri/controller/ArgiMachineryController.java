package com.ruoyi.agri.controller;

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
import com.ruoyi.agri.domain.ArgiMachinery;
import com.ruoyi.agri.service.IArgiMachineryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农机管理Controller
 * 
 * @author 罗晨熙
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/agri/machinery")
public class ArgiMachineryController extends BaseController
{
    @Autowired
    private IArgiMachineryService argiMachineryService;

    /**
     * 查询农机管理列表
     */
    @PreAuthorize("@ss.hasPermi('agri:machinery:list')")
    @GetMapping("/list")
    public TableDataInfo list(ArgiMachinery argiMachinery)
    {
        startPage();
        List<ArgiMachinery> list = argiMachineryService.selectArgiMachineryList(argiMachinery);
        return getDataTable(list);
    }

    /**
     * 导出农机管理列表
     */
    @PreAuthorize("@ss.hasPermi('agri:machinery:export')")
    @Log(title = "农机管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ArgiMachinery argiMachinery)
    {
        List<ArgiMachinery> list = argiMachineryService.selectArgiMachineryList(argiMachinery);
        ExcelUtil<ArgiMachinery> util = new ExcelUtil<ArgiMachinery>(ArgiMachinery.class);
        util.exportExcel(response, list, "农机管理数据");
    }

    /**
     * 获取农机管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('agri:machinery:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(argiMachineryService.selectArgiMachineryById(id));
    }

    /**
     * 新增农机管理
     */
    @PreAuthorize("@ss.hasPermi('agri:machinery:add')")
    @Log(title = "农机管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ArgiMachinery argiMachinery)
    {
        argiMachinery.setCreateBy(getUsername());
        argiMachinery.setUserId(getUserId().toString());
        argiMachinery.setDeptId(getDeptId().toString());
        return toAjax(argiMachineryService.insertArgiMachinery(argiMachinery));
    }

    /**
     * 修改农机管理
     */
    @PreAuthorize("@ss.hasPermi('agri:machinery:edit')")
    @Log(title = "农机管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ArgiMachinery argiMachinery)
    {
        argiMachinery.setUpdateBy(getUsername());

        return toAjax(argiMachineryService.updateArgiMachinery(argiMachinery));
    }

    /**
     * 删除农机管理
     */
    @PreAuthorize("@ss.hasPermi('agri:machinery:remove')")
    @Log(title = "农机管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(argiMachineryService.deleteArgiMachineryByIds(ids));
    }
}
