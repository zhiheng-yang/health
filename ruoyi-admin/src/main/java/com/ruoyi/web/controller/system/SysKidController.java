package com.ruoyi.system.controller;

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
import com.ruoyi.system.domain.SysKid;
import com.ruoyi.system.service.ISysKidService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 幼儿信息Controller
 * 
 * @author zhangchao
 * @date 2021-05-18
 */
@RestController
@RequestMapping("/system/kid")
public class SysKidController extends BaseController
{
    @Autowired
    private ISysKidService sysKidService;

    /**
     * 查询幼儿信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:kid:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysKid sysKid)
    {
        startPage();
        List<SysKid> list = sysKidService.selectSysKidList(sysKid);
        return getDataTable(list);
    }

    /**
     * 导出幼儿信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:kid:export')")
    @Log(title = "幼儿信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysKid sysKid)
    {
        List<SysKid> list = sysKidService.selectSysKidList(sysKid);
        ExcelUtil<SysKid> util = new ExcelUtil<SysKid>(SysKid.class);
        return util.exportExcel(list, "幼儿信息数据");
    }

    /**
     * 获取幼儿信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:kid:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysKidService.selectSysKidById(id));
    }

    /**
     * 新增幼儿信息
     */
    @PreAuthorize("@ss.hasPermi('system:kid:add')")
    @Log(title = "幼儿信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysKid sysKid)
    {
        return toAjax(sysKidService.insertSysKid(sysKid));
    }

    /**
     * 修改幼儿信息
     */
    @PreAuthorize("@ss.hasPermi('system:kid:edit')")
    @Log(title = "幼儿信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysKid sysKid)
    {
        return toAjax(sysKidService.updateSysKid(sysKid));
    }

    /**
     * 删除幼儿信息
     */
    @PreAuthorize("@ss.hasPermi('system:kid:remove')")
    @Log(title = "幼儿信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysKidService.deleteSysKidByIds(ids));
    }
}
