package com.ruoyi.map.controller;

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
import com.ruoyi.map.domain.MapFields;
import com.ruoyi.map.service.IMapFieldsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 任务耕地信息Controller
 * 
 * @author 孙旭江
 * @date 2024-05-24
 */
@RestController
@RequestMapping("/map/fields")
public class MapFieldsController extends BaseController
{
    @Autowired
    private IMapFieldsService mapFieldsService;

    /**
     * 查询任务耕地信息列表
     */
    @PreAuthorize("@ss.hasPermi('map:fields:list')")
    @GetMapping("/list")
    public TableDataInfo list(MapFields mapFields)
    {
        startPage();
        List<MapFields> list = mapFieldsService.selectMapFieldsList(mapFields);
        return getDataTable(list);
    }


    /**
     * 查询任务耕地信息列表（不分页）
     */
    @PreAuthorize("@ss.hasPermi('map:fields:list')")
    @GetMapping("/listFieldsQuery")
    public TableDataInfo listFieldsQuery(MapFields mapFields)
    {
        List<MapFields> list = mapFieldsService.selectMapFieldsList(mapFields);
        return getDataTable(list);
    }

    /**
     * 导出任务耕地信息列表
     */
    @PreAuthorize("@ss.hasPermi('map:fields:export')")
    @Log(title = "任务耕地信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MapFields mapFields)
    {
        List<MapFields> list = mapFieldsService.selectMapFieldsList(mapFields);
        ExcelUtil<MapFields> util = new ExcelUtil<MapFields>(MapFields.class);
        util.exportExcel(response, list, "任务耕地信息数据");
    }

    /**
     * 获取任务耕地信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('map:fields:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(mapFieldsService.selectMapFieldsById(id));
    }

    /**
     * 新增任务耕地信息
     */
    @PreAuthorize("@ss.hasPermi('map:fields:add')")
    @Log(title = "任务耕地信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MapFields mapFields)
    {
        mapFields.setCreateBy(getUsername());
        mapFields.setUserId(getUserId().toString());
        mapFields.setDeptId(getDeptId().toString());
        return toAjax(mapFieldsService.insertMapFields(mapFields));
    }

    /**
     * 修改任务耕地信息
     */
    @PreAuthorize("@ss.hasPermi('map:fields:edit')")
    @Log(title = "任务耕地信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MapFields mapFields)
    {
        mapFields.setUpdateBy(getUsername());
        return toAjax(mapFieldsService.updateMapFields(mapFields));
    }

    /**
     * 删除任务耕地信息
     */
    @PreAuthorize("@ss.hasPermi('map:fields:remove')")
    @Log(title = "任务耕地信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(mapFieldsService.deleteMapFieldsByIds(ids));
    }


    /**
     * 新增电子围栏信息
     */
    @PreAuthorize("@ss.hasPermi('map:fields:add')")
    @Log(title = "电子围栏信息", businessType = BusinessType.INSERT)
    @PostMapping("/addFence")
    public AjaxResult addFence(@RequestBody MapFields mapFields) {
//        System.out.println("数据到这里了嘛");
//        System.out.println(mapFields.toString());
        mapFields.setCreateBy(getUsername());
        mapFields.setUserId(getUserId().toString());
        mapFields.setDeptId(getDeptId().toString());
//        System.out.println("数据到这里了嘛      ：" +getUserId().toString());
//        System.out.println("数据到这里了嘛      ：" +getDeptId().toString());

        return toAjax(mapFieldsService.insertFence(mapFields));

    }


//    public interface MapFieldsService {
//
//        /**
//         * 新增电子围栏信息
//         * @param mapFields 电子围栏信息
//         * @return 操作结果
//         */
//        AjaxResult insertMapFields(MapFields mapFields);
//    }


}
