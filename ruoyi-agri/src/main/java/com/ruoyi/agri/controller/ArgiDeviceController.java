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
import com.ruoyi.agri.domain.ArgiDevice;
import com.ruoyi.agri.service.IArgiDeviceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备管理Controller
 * 
 * @author 小江同学
 * @date 2024-06-25
 */
@RestController
@RequestMapping("/agri/device")
public class ArgiDeviceController extends BaseController
{
    @Autowired
    private IArgiDeviceService argiDeviceService;

    /**
     * 查询设备管理列表
     */
    @PreAuthorize("@ss.hasPermi('agri:device:list')")
    @GetMapping("/list")
    public TableDataInfo list(ArgiDevice argiDevice)
    {
        startPage();
        List<ArgiDevice> list = argiDeviceService.selectArgiDeviceList(argiDevice);
        return getDataTable(list);
    }

    /**
     * 导出设备管理列表
     */
    @PreAuthorize("@ss.hasPermi('agri:device:export')")
    @Log(title = "设备管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ArgiDevice argiDevice)
    {
        List<ArgiDevice> list = argiDeviceService.selectArgiDeviceList(argiDevice);
        ExcelUtil<ArgiDevice> util = new ExcelUtil<ArgiDevice>(ArgiDevice.class);
        util.exportExcel(response, list, "设备管理数据");
    }

    /**
     * 获取设备管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('agri:device:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(argiDeviceService.selectArgiDeviceById(id));
    }

    /**
     * 新增设备管理
     */
    @PreAuthorize("@ss.hasPermi('agri:device:add')")
    @Log(title = "设备管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ArgiDevice argiDevice)
    {
        argiDevice.setCreateBy(getUsername());
        argiDevice.setUserId(getUserId().toString());
        argiDevice.setDeptId(getDeptId().toString());
        return toAjax(argiDeviceService.insertArgiDevice(argiDevice));
    }

    /**
     * 修改设备管理
     */
    @PreAuthorize("@ss.hasPermi('agri:device:edit')")
    @Log(title = "设备管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ArgiDevice argiDevice)
    {
        argiDevice.setUpdateBy(getUsername());
        return toAjax(argiDeviceService.updateArgiDevice(argiDevice));
    }

    /**
     * 删除设备管理
     */
    @PreAuthorize("@ss.hasPermi('agri:device:remove')")
    @Log(title = "设备管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(argiDeviceService.deleteArgiDeviceByIds(ids));
    }
}
