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
import com.ruoyi.agri.domain.ArgiMachineryType;
import com.ruoyi.agri.service.IArgiMachineryTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 农机类型Controller
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
@RestController
@RequestMapping("/agri/machineryType")
public class ArgiMachineryTypeController extends BaseController
{
    @Autowired
    private IArgiMachineryTypeService argiMachineryTypeService;

    /**
     * 查询农机类型列表
     */
    @PreAuthorize("@ss.hasPermi('agri:machineryType:list')")
    @GetMapping("/list")
    public TableDataInfo list(ArgiMachineryType argiMachineryType)
    {
        startPage();
        List<ArgiMachineryType> list = argiMachineryTypeService.selectArgiMachineryTypeList(argiMachineryType);
        return getDataTable(list);
    }

    /**
     * 导出农机类型列表
     */
    @PreAuthorize("@ss.hasPermi('agri:machineryType:export')")
    @Log(title = "农机类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ArgiMachineryType argiMachineryType)
    {
        List<ArgiMachineryType> list = argiMachineryTypeService.selectArgiMachineryTypeList(argiMachineryType);
        ExcelUtil<ArgiMachineryType> util = new ExcelUtil<ArgiMachineryType>(ArgiMachineryType.class);
        util.exportExcel(response, list, "农机类型数据");
    }

    /**
     * 获取农机类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('agri:machineryType:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(argiMachineryTypeService.selectArgiMachineryTypeById(id));
    }

    /**
     * 新增农机类型
     */
    @PreAuthorize("@ss.hasPermi('agri:machineryType:add')")
    @Log(title = "农机类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ArgiMachineryType argiMachineryType)
    {
        argiMachineryType.setCreateBy(getUsername());
        argiMachineryType.setUserId(getUserId().toString());
        argiMachineryType.setDeptId(getDeptId().toString());
        return toAjax(argiMachineryTypeService.insertArgiMachineryType(argiMachineryType));
    }

    /**
     * 修改农机类型
     */
    @PreAuthorize("@ss.hasPermi('agri:machineryType:edit')")
    @Log(title = "农机类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ArgiMachineryType argiMachineryType)
    {
        argiMachineryType.setUpdateBy(getUsername());
        return toAjax(argiMachineryTypeService.updateArgiMachineryType(argiMachineryType));
    }

    /**
     * 删除农机类型
     */
    @PreAuthorize("@ss.hasPermi('agri:machineryType:remove')")
    @Log(title = "农机类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(argiMachineryTypeService.deleteArgiMachineryTypeByIds(ids));
    }
}
