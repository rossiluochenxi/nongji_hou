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
import com.ruoyi.agri.domain.ArgiDeviceType;
import com.ruoyi.agri.service.IArgiDeviceTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备类型Controller
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
@RestController
@RequestMapping("/agri/deviceType")
public class ArgiDeviceTypeController extends BaseController
{
    @Autowired
    private IArgiDeviceTypeService argiDeviceTypeService;

    /**
     * 查询设备类型列表
     */
    @PreAuthorize("@ss.hasPermi('agri:deviceType:list')")
    @GetMapping("/list")
    public TableDataInfo list(ArgiDeviceType argiDeviceType)
    {
        startPage();
        List<ArgiDeviceType> list = argiDeviceTypeService.selectArgiDeviceTypeList(argiDeviceType);
        return getDataTable(list);
    }

    /**
     * 查询设备类型列表
     */
    @PreAuthorize("@ss.hasPermi('agri:deviceType:list')")
    @GetMapping("/listQuery")
    public TableDataInfo listQuery(ArgiDeviceType argiDeviceType)
    {
        List<ArgiDeviceType> list = argiDeviceTypeService.selectArgiDeviceTypeList(argiDeviceType);
        return getDataTable(list);
    }

    /**
     * 导出设备类型列表
     */
    @PreAuthorize("@ss.hasPermi('agri:deviceType:export')")
    @Log(title = "设备类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ArgiDeviceType argiDeviceType)
    {
        List<ArgiDeviceType> list = argiDeviceTypeService.selectArgiDeviceTypeList(argiDeviceType);
        ExcelUtil<ArgiDeviceType> util = new ExcelUtil<ArgiDeviceType>(ArgiDeviceType.class);
        util.exportExcel(response, list, "设备类型数据");
    }

    /**
     * 获取设备类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('agri:deviceType:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(argiDeviceTypeService.selectArgiDeviceTypeById(id));
    }

    /**
     * 新增设备类型
     */
    @PreAuthorize("@ss.hasPermi('agri:deviceType:add')")
    @Log(title = "设备类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ArgiDeviceType argiDeviceType)
    {
        argiDeviceType.setCreateBy(getUsername());
        argiDeviceType.setUserId(getUserId().toString());
        argiDeviceType.setDeptId(getDeptId().toString());
        return toAjax(argiDeviceTypeService.insertArgiDeviceType(argiDeviceType));
    }

    /**
     * 修改设备类型
     */
    @PreAuthorize("@ss.hasPermi('agri:deviceType:edit')")
    @Log(title = "设备类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ArgiDeviceType argiDeviceType)
    {
        argiDeviceType.setUpdateBy(getUsername());
        return toAjax(argiDeviceTypeService.updateArgiDeviceType(argiDeviceType));
    }

    /**
     * 删除设备类型
     */
    @PreAuthorize("@ss.hasPermi('agri:deviceType:remove')")
    @Log(title = "设备类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(argiDeviceTypeService.deleteArgiDeviceTypeByIds(ids));
    }
}
