package com.ruoyi.web.controller.system;

import java.util.List;
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
import com.ruoyi.system.domain.SysDisease;
import com.ruoyi.system.service.ISysDiseaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 病症信息Controller
 * 
 * @author zhangchao
 * @date 2021-06-10
 */
@RestController
@RequestMapping("/system/disease")
public class SysDiseaseController extends BaseController
{
    @Autowired
    private ISysDiseaseService sysDiseaseService;

    /**
     * 查询病症信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:disease:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysDisease sysDisease)
    {
        startPage();
        List<SysDisease> list = sysDiseaseService.selectSysDiseaseList(sysDisease);
        return getDataTable(list);
    }

    /**
     * 导出病症信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:disease:export')")
    @Log(title = "病症信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysDisease sysDisease)
    {
        List<SysDisease> list = sysDiseaseService.selectSysDiseaseList(sysDisease);
        ExcelUtil<SysDisease> util = new ExcelUtil<SysDisease>(SysDisease.class);
        return util.exportExcel(list, "病症信息数据");
    }

    /**
     * 获取病症信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:disease:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysDiseaseService.selectSysDiseaseById(id));
    }

    /**
     * 新增病症信息
     */
    @PreAuthorize("@ss.hasPermi('system:disease:add')")
    @Log(title = "病症信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysDisease sysDisease)
    {
        return toAjax(sysDiseaseService.insertSysDisease(sysDisease));
    }

    /**
     * 修改病症信息
     */
    @PreAuthorize("@ss.hasPermi('system:disease:edit')")
    @Log(title = "病症信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysDisease sysDisease)
    {
        return toAjax(sysDiseaseService.updateSysDisease(sysDisease));
    }

    /**
     * 删除病症信息
     */
    @PreAuthorize("@ss.hasPermi('system:disease:remove')")
    @Log(title = "病症信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysDiseaseService.deleteSysDiseaseByIds(ids));
    }
}
