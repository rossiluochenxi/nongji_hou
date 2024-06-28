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
import com.ruoyi.agri.domain.AgriType;
import com.ruoyi.agri.service.IAgriTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 面积类型管理Controller
 *
 * @author 罗晨熙
 * @date 2024-05-21
 */
@RestController
@RequestMapping("/agri/type")
public class AgriTypeController extends BaseController {
    @Autowired
    private IAgriTypeService agriTypeService;

    /**
     * 查询面积类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('agri:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(AgriType agriType) {
        startPage();
        List<AgriType> list = agriTypeService.selectAgriTypeList(agriType);
        return getDataTable(list);
    }

    /**
     * 查询面积类型管理列表(不分页)
     */
    @PreAuthorize("@ss.hasPermi('agri:type:list')")
    @GetMapping("/listTypeQuery")
    public TableDataInfo listTypeQuery(AgriType agriType) {

        List<AgriType> list = agriTypeService.selectAgriTypeList(agriType);
        return getDataTable(list);
    }

    /**
     * 查询面积类型管理列表
     */

    @PreAuthorize("@ss.hasPermi('agri:type:list')")
    @GetMapping("/querylist")
    public TableDataInfo querylist(AgriType agriType) {
        List<AgriType> list = agriTypeService.selectAgriTypeList(agriType);
        return getDataTable(list);
    }


    /**
     * 导出面积类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('agri:type:export')")
    @Log(title = "面积类型管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AgriType agriType) {
        List<AgriType> list = agriTypeService.selectAgriTypeList(agriType);
        ExcelUtil<AgriType> util = new ExcelUtil<AgriType>(AgriType.class);
        util.exportExcel(response, list, "面积类型管理数据");
    }

    /**
     * 获取面积类型管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('agri:type:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return success(agriTypeService.selectAgriTypeById(id));
    }

    /**
     * 新增面积类型管理
     */
    @PreAuthorize("@ss.hasPermi('agri:type:add')")
    @Log(title = "面积类型管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AgriType agriType) {
        String a='';
        agriType.setCreateBy(getUsername());
        agriType.setUserId(getUserId().toString());
        agriType.setDeptId(getDeptId().toString());
        return toAjax(agriTypeService.insertAgriType(agriType));
    }

    /**
     * 修改面积类型管理
     */
    @PreAuthorize("@ss.hasPermi('agri:type:edit')")
    @Log(title = "面积类型管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AgriType agriType) {
        agriType.setUpdateBy(getUsername());
        return toAjax(agriTypeService.updateAgriType(agriType)
        );
    }

    /**
     * 删除面积类型管理
     */
    @PreAuthorize("@ss.hasPermi('agri:type:remove')")
    @Log(title = "面积类型管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids) {
        return toAjax(agriTypeService.deleteAgriTypeByIds(ids));
    }
}
